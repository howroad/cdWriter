package com.howroad.frame.jframe;


import com.howroad.cdwriter.conf.Config;
import com.howroad.cdwriter.conf.PageConfig;
import com.howroad.cdwriter.conf.PathConfig;
import com.howroad.cdwriter.service.Container;
import com.howroad.frame.panel.FilePane;
import com.howroad.frame.panel.JoinSqlLine;
import com.howroad.frame.panel.LogPanel;
import com.howroad.frame.panel.SelectPanel;
import com.howroad.frame.panel.TextPane;
import com.howroad.log.PanelLog;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;


/**
 * <p>Title: ShowFrame.java</p>
 *
 * <p>Description: </p>
 *
 * @author luhao
 * 
 * @since：2019年3月5日 下午2:37:58
 * 
 */
public class ShowFrame extends JFrame {
    
    private static final long serialVersionUID = -4760857055691612569L;
    public static final int TEXT_LENGTH = 20;
    private static final String SEQ_DIR_0 = "前置";

    private JPanel contentPanel = new JPanel(new FlowLayout());

    /** 内容，后两位参数是间距 */
    private JPanel settingPanel = new JPanel(new GridLayout(10, 2, 1, 1));

    private LogPanel logPanel = new LogPanel();

    private JPanel sqlPanel = new JPanel(new GridLayout(9, 2, 1, 1));

    /** settings start */
    private FilePane filePanel = new FilePane("...", TEXT_LENGTH);
    private TextPane uRLPanel = new TextPane("url:", TEXT_LENGTH);
    private TextPane userNamePanel = new TextPane("user:", TEXT_LENGTH);
    private TextPane passwordPanel = new TextPane("pwd:", TEXT_LENGTH);

    private TextPane appNoPanel = new TextPane("appNo:", TEXT_LENGTH);
    private TextPane tablesPanel = new TextPane("tbls", TEXT_LENGTH);
    private TextPane filesPanel = new TextPane("files", TEXT_LENGTH);
    private SelectPanel seqDirPanel = new SelectPanel("T_seq:", TEXT_LENGTH, "true", "false");
    private JPanel btnPanel = new JPanel();

    private JPanel custPanel = new JPanel();

    private JButton dbFile = new JButton("Db+F");
    private JButton conBtn = new JButton("cnn");
    private JButton runBtnExcel = new JButton("RnEx");
    private JButton clearBtn = new JButton("clr");
    private JButton runBtnDB = new JButton("RnDb");

    private JButton showSqlBtn = new JButton("sql>");
    private JButton openEx = new JButton("opEx");
    private JButton logBtn = new JButton("lg>");
    /** settings end */

    /**export Sql start*/
    private TextPane sqlTables = new TextPane("tbls(;):", TEXT_LENGTH);
    private TextPane sqlSqls = new TextPane("sqls(;):", TEXT_LENGTH);
    private TextPane sqlPks = new TextPane("pks(;,):", TEXT_LENGTH);
    private JPanel sqlBtnPanel = new JPanel();
    private JButton createSql = new JButton("生成sql");


    //JOIN
    private JoinSqlLine joinSqlLine1 = new JoinSqlLine(true);
    private JoinSqlLine joinSqlLine2 = new JoinSqlLine(false);
    private JoinSqlLine joinSqlLine3 = new JoinSqlLine(false);
    private JoinSqlLine joinSqlLine4 = new JoinSqlLine(false);
    private JoinSqlLine joinSqlLine5 = new JoinSqlLine(false);

    private JPanel joinBtnPanel = new JPanel();
    private JButton joinBtnOnSqlId = new JButton("按照sqlId生成");
    private JButton joinBtnOnColumn = new JButton("按照字段生成");
    /**export Sql end*/


    public ShowFrame() {

        PanelLog.initLog(this.logPanel);
        
        this.setBounds(0, 0, 280, 350);
        // 无相对位置
        this.setLocationRelativeTo(null);
        // 不可设置大小
        this.setResizable(false);
        // 关闭样式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnPanel.add(conBtn);
        btnPanel.add(runBtnExcel);
        btnPanel.add(runBtnDB);
        btnPanel.add(clearBtn);

        custPanel.add(openEx);
        custPanel.add(dbFile);
        custPanel.add(showSqlBtn);
        custPanel.add(logBtn);
        
        this.settingPanel.add(filePanel);
        this.settingPanel.add(uRLPanel);
        this.settingPanel.add(userNamePanel);
        this.settingPanel.add(passwordPanel);
        this.settingPanel.add(appNoPanel);
        this.settingPanel.add(seqDirPanel);
        this.settingPanel.add(tablesPanel);
        this.settingPanel.add(filesPanel);
        this.settingPanel.add(btnPanel);
        this.settingPanel.add(custPanel);

        /**sql panel start*/
        sqlPanel.add(sqlTables);
        sqlPanel.add(sqlSqls);
        sqlPanel.add(sqlPks);
        sqlBtnPanel.add(createSql);
        sqlPanel.add(sqlBtnPanel);

        /*
        sqlPanel.add(joinSqlLine1);
        sqlPanel.add(joinSqlLine2);
        sqlPanel.add(joinSqlLine3);
        sqlPanel.add(joinSqlLine4);
        sqlPanel.add(joinSqlLine5);

        joinBtnPanel.add(joinBtnOnSqlId);
        joinBtnPanel.add(joinBtnOnColumn);
        sqlPanel.add(joinBtnPanel);
         */

        /**sql panel end*/

        this.contentPanel.add(settingPanel);
        this.contentPanel.add(logPanel);
        this.contentPanel.add(sqlPanel);

        this.setTitle("cdWriter 1.1.15 howroad");
        this.setContentPane(contentPanel);
        //退出即关闭
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        init();

    }

    private void init() {
        Config.init();
        loadConfig();
        addListener();
        hidePanel(logPanel);
        hidePanel(sqlPanel);

    }

    private void loadConfig(){
        seqDirPanel.setText(BooleanUtils.toStringTrueFalse(PageConfig.SEQ_ON_LAST));
        filePanel.setText(PageConfig.WORK_SPACE);
        uRLPanel.setText(PageConfig.URL == null ? "" : PageConfig.URL.replace("jdbc:oracle:thin:@", ""));
        userNamePanel.setText(PageConfig.USER);
        passwordPanel.setText(PageConfig.PASSWORD);
        appNoPanel.setText(PageConfig.appNo);
        tablesPanel.setText(PageConfig.tablesFromDB != null ? StringUtils.join(PageConfig.tablesFromDB,",") : "");
        filesPanel.setText(PageConfig.modelFiles != null ? StringUtils.join(PageConfig.modelFiles,",") : "");
    }

    private void reLoadConfig(){
        PageConfig.WORK_SPACE = filePanel.getText();
        PageConfig.URL = "jdbc:oracle:thin:@" + uRLPanel.getText();
        PageConfig.USER = userNamePanel.getText();
        PageConfig.PASSWORD = passwordPanel.getText();
        PageConfig.appNo = appNoPanel.getText();
        PageConfig.tablesFromDB = tablesPanel.getText().split(",");
        PageConfig.modelFiles = filesPanel.getText().split(",");
        PageConfig.SEQ_ON_LAST = Boolean.valueOf(seqDirPanel.getText());
    }

    private void addListener(){
        conBtn.addActionListener((e) -> {
            reLoadConfig();
            if(Container.coreService.testCoonect()){
                JOptionPane.showMessageDialog(null, "连接成功！");
                writeProperties();
            }else{
                JOptionPane.showMessageDialog(null, "连接失败！");
            }
        });

        runBtnExcel.addActionListener((e) -> {
            try {
                reLoadConfig();
                Container.coreService.createFromXls();
                JOptionPane.showMessageDialog(null, "生成成功！");
                writeProperties();
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
                e1.printStackTrace();
            }
        });
        runBtnDB.addActionListener((e) -> {
            try {
                reLoadConfig();
                Container.coreService.createFromDb();
                JOptionPane.showMessageDialog(null, "生成成功！");
                writeProperties();
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
                e1.printStackTrace();
            }
        });
        dbFile.addActionListener((e) -> {
            try {
                reLoadConfig();
                Container.coreService.createFromDbAndFile();
                JOptionPane.showMessageDialog(null, "生成成功！");
                writeProperties();
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
                e1.printStackTrace();
            }
        });
        clearBtn.addActionListener((e) -> {
            try {
                reLoadConfig();
                Container.coreService.clear();
                JOptionPane.showMessageDialog(null, "清除成功");
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
                e1.printStackTrace();
            }
        });

        //自定义事件
        createSql.addActionListener(e ->{
            reLoadConfig();
            try {
                //Start.ta0723BuildSql();
                //Start.N0801SQL();
                Container.coreService.createCustSql(this.sqlTables.getText(),this.sqlSqls.getText(),this.sqlPks.getText().toUpperCase());
                JOptionPane.showMessageDialog(null, "生成成功");
            } catch (Exception e1) {
                JOptionPane.showMessageDialog(null, e1.getMessage());
                e1.printStackTrace();
            }
        });

        logBtn.addActionListener(e -> {
            showOrHidePanel(this.logPanel);
        });
        showSqlBtn.addActionListener(e ->{
            showOrHidePanel(this.sqlPanel);
        });
        openEx.addActionListener(e ->{
            try {
                Desktop.getDesktop().open(new File(filePanel.getText()));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });
    }
    /**
     * 写入配置文件
     */
    public void writeProperties() {
        Properties pro = new Properties();
        FileOutputStream oFile;
        File tempFile = new File(PathConfig.SAVE_CONFIG_PATH);
        pro.setProperty("SEQ_ON_LAST", PageConfig.SEQ_ON_LAST == null ? "false" : PageConfig.SEQ_ON_LAST.toString());
        pro.setProperty("URL", PageConfig.URL);
        pro.setProperty("USER", PageConfig.USER);
        pro.setProperty("PASSWORD", PageConfig.PASSWORD);
        pro.setProperty("WORK_SPACE", PageConfig.WORK_SPACE);
        pro.setProperty("appNo", PageConfig.appNo);
        pro.setProperty("tablesFromDB", PageConfig.tablesFromDB == null ? "" : StringUtils.join(PageConfig.tablesFromDB, ","));
        pro.setProperty("modelFiles", PageConfig.modelFiles == null ? "" : StringUtils.join(PageConfig.modelFiles, ","));
        try {
            if(!tempFile.exists()) {
                tempFile.getParentFile().mkdirs();
                tempFile.createNewFile();
            }
            oFile = new FileOutputStream(tempFile, false);
            pro.store(new OutputStreamWriter(oFile, "utf-8"), "Comment");
            oFile.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public void showOrHidePanel(JPanel panel){
        if(panel.isVisible()){
            hidePanel(panel);
        }else{
            showPanel(panel);
        }
    }
    public void hidePanel(JPanel panel){
        panel.setVisible(false);
        contentPanel.remove(panel);
        pack();
    }
    public void showPanel(JPanel panel){
        panel.setVisible(true);
        contentPanel.add(panel);
        pack();
    }
    
}
