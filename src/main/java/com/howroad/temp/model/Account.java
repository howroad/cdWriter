package com.howroad.temp.model;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * Title:
 * </p>
 * 
 * <p>
 * Description: �˻�ʵ����
 * </p>
 * 
 * <p>
 * Company: �����ź��ǿƼ��ɷ����޹�˾
 * </p>
 * 
 * @author LYY
 * 
 * @since��2016-7-21 ����04:27:29
 * 
 */
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * �˻�id
	 */
	private Integer accountId;
	/**
	 * �˻�������ˮ��
	 */
	private Integer applyId;
	/**
	 * �˻�����
	 */
	private String accountCode;
	/**
	 * ��λ���
	 */
	private String cltNo;
	/**
	 * ��������������ˮ��
	 */
	private Integer assId;
	/**
	 * �������ڻ���
	 */
	private String bankNo;
	/**
	 * ������
	 */
	private String isAbroad;
	/**
	 * �������루������ַ��
	 */
	private String regNo;
	/**
	 * �������
	 */
	private Integer areaId;
	/**
	 * ��������
	 */
	private Date openAccountDate;
	/**
	 * �˺�
	 */
	private String accountNo;
	/**
	 * ����
	 */
	private String accountName;
	/**
	 * ������
	 */
	private String memoryName;
	/**
	 * ����
	 */
	private String currencyNo;
	/**
	 * �˻���;
	 */
	private Integer usageId;
	/**
	 * �˻�����
	 */
	private Integer ctId;
	/**
	 * ��Ч���ڿ�ʼ
	 */
	private Date vaildStartDate;
	/**
	 * ��Ч���ڽ���
	 */
	private Date vaildEndDate;
	/**
	 * �˻����
	 */
	private Integer natureId;
    /**
     * �˻������
     */
    private String natureCode;
	/**
	 * ���ҵ������
	 */
	private Integer foreignType;
	/**
	 * ������ʽ
	 */
	private String associateFlag;
    /**
     * �����������ʽ
     */
	private String afterAssociateFlag;
	/**
	 * ��λ/��Ŀ��ַ
	 */
	private String arrdess;
	/**
	 * ��ע
	 */
	private String cnreMark;
	/**
	 * ͳ�Ʊ���1
	 */
	private String tempCode1;
	/**
	 * ͳ�Ʊ���2
	 */
	private String tempCode2;
	/**
	 * ͳ�Ʊ���3
	 */
	private String tempCode3;
	/**
	 * ͳ�Ʊ���4
	 */
	private String tempCode4;
	/**
	 * ͳ�Ʊ���5
	 */
	private String tempCode5;
	/**
	 * ͳ�Ʊ���6
	 */
	private String tempCode6;
	/**
	 * ͳ�Ʊ���7
	 */
	private String tempCode7;
	/**
	 * ͳ�Ʊ���8
	 */
	private String tempCode8;
	/**
	 * ͳ�Ʊ���9
	 */
	private String tempCode9;
	/**
	 * ͳ�Ʊ���10
	 */
	private String tempCode10;
	/**
	 * �˻�״̬
	 */
	private Integer acntState;
    /**
     * ������˻�״̬
     */
    private Integer afterAcntState;
	/**
	 * ��������
	 */
	private Date cancelDate;
	/**
	 * ������ע
	 */
	private String cancelRemark;
	/**
	 * ����ԭ��
	 */
	private String cancelReason;
	
	/**
	 * ȡ����������
	 */
	private Date removeCancelDate;
	/**
	 * ȡ������ԭ��
	 */
	private String removeCancelReason;
	/**
	 * ������������
	 */
	private String fileRemark;
	/**
	 * ������
	 */
	private String createUser;
	/**
	 * ������
	 */
	private String inputor;
	/**
	 * ����ʱ��
	 */
	private Date create_time;
	/**
	 * ����޸�ʱ��
	 */
	private Date update_time;
	/**
	 * ���⻧��Ӧ��ʵ���˻�
	 */
	private String eAccount;
	/**
	 * ��λ������
	 */
	private String treeNo;

	/**
	 * �Թ��绰
	 */
	private String publicTelephone;

	/**
	 * �ͻ�����
	 */
	private String customerManager;

	/**
	 * �ͻ�����绰
	 */
	private String cmTelephone;

	/**
	 * �ͻ������������
	 */
	private String cmMail;

	/**
	 * �Ƿ����˻�
	 */
	private Integer isEscrowAccount;
	
	/**
	 * ��������Ȩ�޲�ѯ���ĵ�λ����
	 */
	private String[] cltNos;
	
	/**
	 * �Ƿ���������Ȩ��
	 */
	private Integer isUserPer;
	
	/**
	 * �۽��˻����:1��,0��
	 */
	private Integer isDeduct;
	/**
	 * ����֮ǰ���˻�״̬
	 */
	private Integer beforeCalcelState;
    /**
     * �˻�������ͣ�0-������Ϣ 1-�˻�״̬ 2-������ʽ��
     */
    private String modifyType;
	/**
	 * ֱ��������ʽ:0 ȫ�� 1 �ֽ� 2 Ʊ��
	 */
	private Integer connectType;

    /**
     * ���к�/������
     */
	private String associateBankCode;

	/**
	 * �����Ƿ񱻵Ǽ�
	 */
	private Integer isRegister;
	
	/*********************����Ͷ�����ֶ�**********************/
	/**
	 * ��λ����
	 */
	private String cltName;
	/**
	 * ��ϵ��
	 */
	private String contactPerson;
	/**
	 * ��ϵ�˵绰
	 */
	private String contactTel;
	/**
	 * �������˻�
	 */
	private String basicAccountNo;
	/**
	 * ������������
	 */
	private String basicAccountBankname;
	/**
	 * ����Ȩ������
	 */
	private String authorizedPersonName;
	/**
	 * ����Ȩ�����֤��
	 */
	private String authorizedPersonId;
	/**
	 * ��������
	 */
	private String legalPerson;
	/**
	 * �������֤��
	 */
	private String legalIdCard;
	/**
	 * ӡ������������
	 */
	private String namesSeal;
	/**
	 * ӡ������������
	 */
	private String financialSeal;
	/**
	 * ��������
	 */
	private String officialSeal;
	/**
	 * ��������
	 */
	private String adminArea;
	/**
	 * ʵ�ʰ칫��ַ
	 */
	private String actualOfficeAddress;
	/**
	 * Ԥ��ӡ���Ƿ�Ϊ����
	 */
	private Integer isSealLegalPerson;
	/**
	 * �Ƿ�Ϊ����˾�ڲ���
	 */
	private Integer isInternalAccount;
	/**
	 * �Ƿ���Ҫ��ͨ����
	 */
	private Integer needOpenEbank;
	/**
	 * �Ƿ���Ҫ����
	 */
	private Integer needOnline;
	/**
	 * �Ƿ�������ó��
	 */
	private Integer belongFta;
	/**
	 * �Ƿ�ͨ����
	 */
	private Integer isOpenRemind;
	/**
	 * �Ƿ��������
	 */
	private Integer smsRemind;
	/**
	 * �Ƿ�绰����
	 */
	private Integer telRemind;
	/**
	 * �Ƿ�������
	 */
	private Integer largeAmountRemind;
	/**
	 * �˻�������
	 */
	private Date dueDate;
    /**
     * �˻��������Id
     */
	private Integer changeApplyId;
	/**
	 * �������
	 */
	private Date changeDate;
	/**
	 * ���ԭ��
	 */
	private String changeReason;
	/**
	 * ��������
	 */
	private Date correctDate;
	/**
	 * ����ԭ��
	 */
	private String correctReason;
	/**
	 * erp�����Ǽ���ˮ��
	 */
	private String erpId;
	/**
	 * ERPϵͳ���
	 */
	private String erpSysNo;
	/*********************����Ͷ�����ֶ�**********************/
	/**
	 * ���������
	 */
	private String fmCls;
	
	
	public String getFmCls() {
		return fmCls;
	}

	public void setFmCls(String fmCls) {
		this.fmCls = fmCls;
	}

	public String[] getCltNos() {
		return cltNos;
	}

	public Date getCorrectDate() {
		return correctDate;
	}

	public void setCorrectDate(Date correctDate) {
		this.correctDate = correctDate;
	}

	public String getCorrectReason() {
		return correctReason;
	}

	public void setCorrectReason(String correctReason) {
		this.correctReason = correctReason;
	}

	public Integer getIsRegister() {
		return isRegister;
	}

	public void setIsRegister(Integer isRegister) {
		this.isRegister = isRegister;
	}

	public void setCltNos(String[] cltNos) {
		this.cltNos = cltNos;
	}

	public Integer getIsUserPer() {
		return isUserPer;
	}

	public void setIsUserPer(Integer isUserPer) {
		this.isUserPer = isUserPer;
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public Integer getApplyId() {
		return applyId;
	}

	public void setApplyId(Integer applyId) {
		this.applyId = applyId;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public String getCltNo() {
		return cltNo;
	}

	public void setCltNo(String cltNo) {
		this.cltNo = cltNo;
	}

	public Integer getAssId() {
		return assId;
	}

	public void setAssId(Integer assId) {
		this.assId = assId;
	}

	public String getBankNo() {
		return bankNo;
	}

	public void setBankNo(String bankNo) {
		this.bankNo = bankNo;
	}

	public String getIsAbroad() {
		return isAbroad;
	}

	public void setIsAbroad(String isAbroad) {
		this.isAbroad = isAbroad;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public Date getOpenAccountDate() {
		return openAccountDate;
	}

	public void setOpenAccountDate(Date openAccountDate) {
		this.openAccountDate = openAccountDate;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getMemoryName() {
		return memoryName;
	}

	public void setMemoryName(String memoryName) {
		this.memoryName = memoryName;
	}

	public String getCurrencyNo() {
		return currencyNo;
	}

	public void setCurrencyNo(String currencyNo) {
		this.currencyNo = currencyNo;
	}

	public Integer getUsageId() {
		return usageId;
	}

	public void setUsageId(Integer usageId) {
		this.usageId = usageId;
	}

	public Integer getCtId() {
		return ctId;
	}

	public void setCtId(Integer ctId) {
		this.ctId = ctId;
	}

	public Date getVaildStartDate() {
		return vaildStartDate;
	}

	public void setVaildStartDate(Date vaildStartDate) {
		this.vaildStartDate = vaildStartDate;
	}

	public Date getVaildEndDate() {
		return vaildEndDate;
	}

	public void setVaildEndDate(Date vaildEndDate) {
		this.vaildEndDate = vaildEndDate;
	}

	public Integer getNatureId() {
		return natureId;
	}

	public void setNatureId(Integer natureId) {
		this.natureId = natureId;
	}

	public Integer getForeignType() {
		return foreignType;
	}

	public void setForeignType(Integer foreignType) {
		this.foreignType = foreignType;
	}

	public String getAssociateFlag() {
		return associateFlag;
	}

	public void setAssociateFlag(String associateFlag) {
		this.associateFlag = associateFlag;
	}

	public String getArrdess() {
		return arrdess;
	}

	public void setArrdess(String arrdess) {
		this.arrdess = arrdess;
	}

	public String getCnreMark() {
		return cnreMark;
	}

	public void setCnreMark(String cnreMark) {
		this.cnreMark = cnreMark;
	}

	public Integer getAcntState() {
		return acntState;
	}

	public void setAcntState(Integer acntState) {
		this.acntState = acntState;
	}

	public Date getCancelDate() {
		return cancelDate;
	}

	public void setCancelDate(Date cancelDate) {
		this.cancelDate = cancelDate;
	}

	public String getCancelRemark() {
		return cancelRemark;
	}

	public void setCancelRemark(String cancelRemark) {
		this.cancelRemark = cancelRemark;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getFileRemark() {
		return fileRemark;
	}

	public void setFileRemark(String fileRemark) {
		this.fileRemark = fileRemark;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getTempCode1() {
		return tempCode1;
	}

	public void setTempCode1(String tempCode1) {
		this.tempCode1 = tempCode1;
	}

	public String getTempCode2() {
		return tempCode2;
	}

	public void setTempCode2(String tempCode2) {
		this.tempCode2 = tempCode2;
	}

	public String getTempCode3() {
		return tempCode3;
	}

	public void setTempCode3(String tempCode3) {
		this.tempCode3 = tempCode3;
	}

	public String getTempCode4() {
		return tempCode4;
	}

	public void setTempCode4(String tempCode4) {
		this.tempCode4 = tempCode4;
	}

	public String getTempCode5() {
		return tempCode5;
	}

	public void setTempCode5(String tempCode5) {
		this.tempCode5 = tempCode5;
	}

	public String getTempCode6() {
		return tempCode6;
	}

	public void setTempCode6(String tempCode6) {
		this.tempCode6 = tempCode6;
	}

	public String getTempCode7() {
		return tempCode7;
	}

	public void setTempCode7(String tempCode7) {
		this.tempCode7 = tempCode7;
	}

	public String getTempCode8() {
		return tempCode8;
	}

	public void setTempCode8(String tempCode8) {
		this.tempCode8 = tempCode8;
	}

	public String getTempCode9() {
		return tempCode9;
	}

	public void setTempCode9(String tempCode9) {
		this.tempCode9 = tempCode9;
	}

	public String getTempCode10() {
		return tempCode10;
	}

	public void setTempCode10(String tempCode10) {
		this.tempCode10 = tempCode10;
	}

	public String getInputor() {
		return inputor;
	}

	public void setInputor(String inputor) {
		this.inputor = inputor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountCode == null) ? 0 : accountCode.hashCode());
		result = prime * result
				+ ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result
				+ ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result
				+ ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result
				+ ((acntState == null) ? 0 : acntState.hashCode());
		result = prime * result + ((applyId == null) ? 0 : applyId.hashCode());
		result = prime * result + ((areaId == null) ? 0 : areaId.hashCode());
		result = prime * result + ((arrdess == null) ? 0 : arrdess.hashCode());
		result = prime * result + ((assId == null) ? 0 : assId.hashCode());
		result = prime * result
				+ ((associateFlag == null) ? 0 : associateFlag.hashCode());
		result = prime * result + ((bankNo == null) ? 0 : bankNo.hashCode());
		result = prime * result
				+ ((cancelDate == null) ? 0 : cancelDate.hashCode());
		result = prime * result
				+ ((cancelReason == null) ? 0 : cancelReason.hashCode());
		result = prime * result
				+ ((cancelRemark == null) ? 0 : cancelRemark.hashCode());
		result = prime * result + ((cltNo == null) ? 0 : cltNo.hashCode());
		result = prime * result
				+ ((cnreMark == null) ? 0 : cnreMark.hashCode());
		result = prime * result
				+ ((createUser == null) ? 0 : createUser.hashCode());
		result = prime * result
				+ ((create_time == null) ? 0 : create_time.hashCode());
		result = prime * result + ((ctId == null) ? 0 : ctId.hashCode());
		result = prime * result
				+ ((currencyNo == null) ? 0 : currencyNo.hashCode());
		result = prime * result
				+ ((fileRemark == null) ? 0 : fileRemark.hashCode());
		result = prime * result
				+ ((foreignType == null) ? 0 : foreignType.hashCode());
		result = prime * result + ((inputor == null) ? 0 : inputor.hashCode());
		result = prime * result
				+ ((isAbroad == null) ? 0 : isAbroad.hashCode());
		result = prime * result
				+ ((memoryName == null) ? 0 : memoryName.hashCode());
		result = prime * result
				+ ((natureId == null) ? 0 : natureId.hashCode());
		result = prime * result
				+ ((openAccountDate == null) ? 0 : openAccountDate.hashCode());
		result = prime * result + ((regNo == null) ? 0 : regNo.hashCode());
		result = prime * result
				+ ((tempCode1 == null) ? 0 : tempCode1.hashCode());
		result = prime * result
				+ ((tempCode10 == null) ? 0 : tempCode10.hashCode());
		result = prime * result
				+ ((tempCode2 == null) ? 0 : tempCode2.hashCode());
		result = prime * result
				+ ((tempCode3 == null) ? 0 : tempCode3.hashCode());
		result = prime * result
				+ ((tempCode4 == null) ? 0 : tempCode4.hashCode());
		result = prime * result
				+ ((tempCode5 == null) ? 0 : tempCode5.hashCode());
		result = prime * result
				+ ((tempCode6 == null) ? 0 : tempCode6.hashCode());
		result = prime * result
				+ ((tempCode7 == null) ? 0 : tempCode7.hashCode());
		result = prime * result
				+ ((tempCode8 == null) ? 0 : tempCode8.hashCode());
		result = prime * result
				+ ((tempCode9 == null) ? 0 : tempCode9.hashCode());
		result = prime * result
				+ ((update_time == null) ? 0 : update_time.hashCode());
		result = prime * result + ((usageId == null) ? 0 : usageId.hashCode());
		result = prime * result
				+ ((vaildEndDate == null) ? 0 : vaildEndDate.hashCode());
		result = prime * result
				+ ((vaildStartDate == null) ? 0 : vaildStartDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (tempCode1 == null) {
			if (other.tempCode1 != null)
				return false;
		} else if (!tempCode1.equals(other.tempCode1))
			return false;
		if (tempCode10 == null) {
			if (other.tempCode10 != null)
				return false;
		} else if (!tempCode10.equals(other.tempCode10))
			return false;
		if (tempCode2 == null) {
			if (other.tempCode2 != null)
				return false;
		} else if (!tempCode2.equals(other.tempCode2))
			return false;
		if (tempCode3 == null) {
			if (other.tempCode3 != null)
				return false;
		} else if (!tempCode3.equals(other.tempCode3))
			return false;
		if (tempCode4 == null) {
			if (other.tempCode4 != null)
				return false;
		} else if (!tempCode4.equals(other.tempCode4))
			return false;
		if (tempCode5 == null) {
			if (other.tempCode5 != null)
				return false;
		} else if (!tempCode5.equals(other.tempCode5))
			return false;
		if (tempCode6 == null) {
			if (other.tempCode6 != null)
				return false;
		} else if (!tempCode6.equals(other.tempCode6))
			return false;
		if (tempCode7 == null) {
			if (other.tempCode7 != null)
				return false;
		} else if (!tempCode7.equals(other.tempCode7))
			return false;
		if (tempCode8 == null) {
			if (other.tempCode8 != null)
				return false;
		} else if (!tempCode8.equals(other.tempCode8))
			return false;
		if (tempCode9 == null) {
			if (other.tempCode9 != null)
				return false;
		} else if (!tempCode9.equals(other.tempCode9))
			return false;
		return true;
	}

	public String geteAccount() {
		return eAccount;
	}

	public void seteAccount(String eAccount) {
		this.eAccount = eAccount;
	}

	public String getTreeNo() {
		return treeNo;
	}

	public void setTreeNo(String treeNo) {
		this.treeNo = treeNo;
	}

	public String getPublicTelephone() {
		return publicTelephone;
	}

	public void setPublicTelephone(String publicTelephone) {
		this.publicTelephone = publicTelephone;
	}

	public String getCustomerManager() {
		return customerManager;
	}

	public void setCustomerManager(String customerManager) {
		this.customerManager = customerManager;
	}

	public String getCmTelephone() {
		return cmTelephone;
	}

	public void setCmTelephone(String cmTelephone) {
		this.cmTelephone = cmTelephone;
	}

	public String getCmMail() {
		return cmMail;
	}

	public void setCmMail(String cmMail) {
		this.cmMail = cmMail;
	}

	public Integer getIsEscrowAccount() {
		return isEscrowAccount;
	}

	public void setIsEscrowAccount(Integer isEscrowAccount) {
		this.isEscrowAccount = isEscrowAccount;
	}

	public Date getRemoveCancelDate() {
		return removeCancelDate;
	}

	public void setRemoveCancelDate(Date removeCancelDate) {
		this.removeCancelDate = removeCancelDate;
	}

	public String getRemoveCancelReason() {
		return removeCancelReason;
	}

	public void setRemoveCancelReason(String removeCancelReason) {
		this.removeCancelReason = removeCancelReason;
	}

	public Integer getIsDeduct() {
		return isDeduct;
	}

	public void setIsDeduct(Integer isDeduct) {
		this.isDeduct = isDeduct;
	}

    public Integer getAfterAcntState() {
        return afterAcntState;
    }

    public void setAfterAcntState(Integer afterAcntState) {
        this.afterAcntState = afterAcntState;
    }

    public Integer getBeforeCalcelState() {
        return beforeCalcelState;
    }

    public void setBeforeCalcelState(Integer beforeCalcelState) {
        this.beforeCalcelState = beforeCalcelState;
    }

    public String getModifyType() {
        return modifyType;
    }

    public void setModifyType(String modifyType) {
        this.modifyType = modifyType;
    }

    public Integer getConnectType() {
        return connectType;
    }

    public void setConnectType(Integer connectType) {
        this.connectType = connectType;
    }

    public String getNatureCode() {
        return natureCode;
    }

    public void setNatureCode(String natureCode) {
        this.natureCode = natureCode;
    }

    public String getAssociateBankCode() {
        return associateBankCode;
    }

    public void setAssociateBankCode(String associateBankCode) {
        this.associateBankCode = associateBankCode;
    }

    public String getAfterAssociateFlag() {
        return afterAssociateFlag;
    }

    public void setAfterAssociateFlag(String afterAssociateFlag) {
        this.afterAssociateFlag = afterAssociateFlag;
    }

	public String getCltName() {
		return cltName;
	}

	public void setCltName(String cltName) {
		this.cltName = cltName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactTel() {
		return contactTel;
	}

	public void setContactTel(String contactTel) {
		this.contactTel = contactTel;
	}

	public String getBasicAccountNo() {
		return basicAccountNo;
	}

	public void setBasicAccountNo(String basicAccountNo) {
		this.basicAccountNo = basicAccountNo;
	}

	public String getBasicAccountBankname() {
		return basicAccountBankname;
	}

	public void setBasicAccountBankname(String basicAccountBankname) {
		this.basicAccountBankname = basicAccountBankname;
	}

	public String getAuthorizedPersonName() {
		return authorizedPersonName;
	}

	public void setAuthorizedPersonName(String authorizedPersonName) {
		this.authorizedPersonName = authorizedPersonName;
	}

	public String getAuthorizedPersonId() {
		return authorizedPersonId;
	}

	public void setAuthorizedPersonId(String authorizedPersonId) {
		this.authorizedPersonId = authorizedPersonId;
	}

	public String getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(String legalPerson) {
		this.legalPerson = legalPerson;
	}

	public String getLegalIdCard() {
		return legalIdCard;
	}

	public void setLegalIdCard(String legalIdCard) {
		this.legalIdCard = legalIdCard;
	}

	public String getNamesSeal() {
		return namesSeal;
	}

	public void setNamesSeal(String namesSeal) {
		this.namesSeal = namesSeal;
	}

	public String getFinancialSeal() {
		return financialSeal;
	}

	public void setFinancialSeal(String financialSeal) {
		this.financialSeal = financialSeal;
	}

	public String getOfficialSeal() {
		return officialSeal;
	}

	public void setOfficialSeal(String officialSeal) {
		this.officialSeal = officialSeal;
	}

	public String getAdminArea() {
		return adminArea;
	}

	public void setAdminArea(String adminArea) {
		this.adminArea = adminArea;
	}

	public String getActualOfficeAddress() {
		return actualOfficeAddress;
	}

	public void setActualOfficeAddress(String actualOfficeAddress) {
		this.actualOfficeAddress = actualOfficeAddress;
	}

	public Integer getIsSealLegalPerson() {
		return isSealLegalPerson;
	}

	public void setIsSealLegalPerson(Integer isSealLegalPerson) {
		this.isSealLegalPerson = isSealLegalPerson;
	}

	public Integer getIsInternalAccount() {
		return isInternalAccount;
	}

	public void setIsInternalAccount(Integer isInternalAccount) {
		this.isInternalAccount = isInternalAccount;
	}

	public Integer getNeedOpenEbank() {
		return needOpenEbank;
	}

	public void setNeedOpenEbank(Integer needOpenEbank) {
		this.needOpenEbank = needOpenEbank;
	}

	public Integer getNeedOnline() {
		return needOnline;
	}

	public void setNeedOnline(Integer needOnline) {
		this.needOnline = needOnline;
	}

	public Integer getBelongFta() {
		return belongFta;
	}

	public void setBelongFta(Integer belongFta) {
		this.belongFta = belongFta;
	}

	public Integer getIsOpenRemind() {
		return isOpenRemind;
	}

	public void setIsOpenRemind(Integer isOpenRemind) {
		this.isOpenRemind = isOpenRemind;
	}

	public Integer getSmsRemind() {
		return smsRemind;
	}

	public void setSmsRemind(Integer smsRemind) {
		this.smsRemind = smsRemind;
	}

	public Integer getTelRemind() {
		return telRemind;
	}

	public void setTelRemind(Integer telRemind) {
		this.telRemind = telRemind;
	}

	public Integer getLargeAmountRemind() {
		return largeAmountRemind;
	}

	public void setLargeAmountRemind(Integer largeAmountRemind) {
		this.largeAmountRemind = largeAmountRemind;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Integer getChangeApplyId() {
		return changeApplyId;
	}

	public void setChangeApplyId(Integer changeApplyId) {
		this.changeApplyId = changeApplyId;
	}

	public Date getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(Date changeDate) {
		this.changeDate = changeDate;
	}

	public String getChangeReason() {
		return changeReason;
	}

	public void setChangeReason(String changeReason) {
		this.changeReason = changeReason;
	}

	public String getErpId() {
		return erpId;
	}

	public void setErpId(String erpId) {
		this.erpId = erpId;
	}

	public String getErpSysNo() {
		return erpSysNo;
	}

	public void setErpSysNo(String erpSysNo) {
		this.erpSysNo = erpSysNo;
	}
}
