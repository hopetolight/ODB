package com.suneee.odb.model.rocketmq;

import java.io.Serializable;

/**
 * 终端变量对象
 * @author zyj
 *
 */
public class GatherConfigVariable implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5910119373591761350L;
	private Integer configId;//GatherConfig ID：add by yunzhi
	private String varCode;//变量号，不可重复
	
	private String varName;//变量名
	
	private String varColname;//变量字段名
	
	private String varUnit;//变量单位
	public void preInsert() {
		
	}
	
	public void preUpdate(){
		
	}
	
	
	public String getVarCode() {
		return varCode;
	}

	public void setVarCode(String varCode) {
		this.varCode = varCode;
	}

	
	public String getVarName() {
		return varName;
	}

	public void setVarName(String varName) {
		this.varName = varName;
	}

	public String getVarColname() {
		return varColname;
	}

	public void setVarColname(String varColname) {
		this.varColname = varColname;
	}

	public Integer getConfigId() {
		return configId;
	}

	public void setConfigId(Integer configId) {
		this.configId = configId;
	}

	public String getVarUnit() {
		return varUnit;
	}

	public void setVarUnit(String varUnit) {
		this.varUnit = varUnit;
	}
}
