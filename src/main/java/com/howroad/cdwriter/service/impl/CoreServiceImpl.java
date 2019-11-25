package com.howroad.cdwriter.service.impl;

import com.howroad.cdwriter.builder.TableBuilder;
import com.howroad.cdwriter.conf.PageConfig;
import com.howroad.cdwriter.conf.PathConfig;
import com.howroad.cdwriter.model.Table;
import com.howroad.cdwriter.service.Container;
import com.howroad.cdwriter.service.ICoreService;
import com.howroad.cdwriter.util.ValidateUtil;
import com.howroad.log.PanelLog;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * <p>Title: ICoreServiceImpl.java</p>
 * <p>Description: </p>
 * <p>Company: 北京九恒星科技股份有限公司</p>
 *
 * @author luhao
 * @since：2019-10-09 10:20
 */
public class CoreServiceImpl implements ICoreService {

    @Override
    public boolean testCoonect() {
        String sql = "SELECT 1 FROM DUAL";
        try{
            List<List<Object>> result = Container.databaseService.query(sql);
            return result != null && result.size() > 0;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public void createFromXls() {
        List<Table> tables = TableBuilder.buildTableFromExcel(0);
        for (Table table : tables) {
            Container.ioService.writeAllFileByJarTemplet(table);
            Container.ioService.writeAllFileByTemplet(table, PathConfig.OUT_CODE_DIR(), PathConfig.CUST_TEMPLET_DIR());
        }
        List<Table> tablePatch = TableBuilder.buildTableFromExcel(1);
        for (Table table : tablePatch) {
            //新增字段的模版
            InputStream addColumnTemplet = Container.ioService.getTemplet(PathConfig.ADD_COLUMN_TEMPLET);
            //修改字段的模版
            InputStream modifyColumnTemplet = Container.ioService.getTemplet(PathConfig.MODIFY_COLUMN_TEMPLET);
            Container.ioService.writeFileByTemplet(addColumnTemplet, new File(PathConfig.ADD_COLUMN_PATH(table)),table);
            Container.ioService.writeFileByTemplet(modifyColumnTemplet, new File(PathConfig.MODIFY_COLUMN_PATH(table)),table);
        }
    }

    @Override
    public void createFromDb() {
        List<Table> tables = TableBuilder.buildTableFromNames(PageConfig.tablesFromDB);
        for (Table table : tables) {
            Container.ioService.writeAllFileByJarTemplet(table);
            Container.ioService.writeAllFileByTemplet(table, PathConfig.OUT_CODE_DIR(), PathConfig.CUST_TEMPLET_DIR());
            Container.ioService.writeDataFile(table);
        }

    }

    @Override
    public void clear() {
        Container.ioService.clear();
    }


    @Override
    public void createCustSql(String tbNamesStr, String sqlsStr, String pkNamesStr) {
        String[] tableNames = tbNamesStr.split(";");
        String[] sqls = sqlsStr.split(";");
        String[] primaryKeyStr = pkNamesStr.split(";");
        List<String[]> primaryKeys = new ArrayList<String[]>();
        for (String pk: primaryKeyStr) {
            primaryKeys.add(pk.split(","));
        }

        for (int i = 0; i < tableNames.length; i++) {
            String tableName = tableNames[i];
            String sql = sqls[i];
            String[] primaryKey = primaryKeys.get(i);
            Table table = TableBuilder.buildTableFromDB(tableName);
            Container.ioService.writeDataFile(table,sql,primaryKey);
            PanelLog.log("build " + tableName + ".SQL(cust) down...");
        }
    }
}
