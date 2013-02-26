package com.chinasofti.basic.framework.common;


public class Params {
	
	private String pname;
	
	private String operator;
	
	private Object pvalue;	
	
	private int typeNo;
	
	public Params(String pname,String operator,Object pvalue){
		super();
		this.pname = pname;
		this.operator = operator;
		this.pvalue = pvalue;
	}
		
	public Params(String pname, String operator, Object pvalue, int typeNo) {
		super();
		this.pname = pname;
		this.operator = operator;
		this.pvalue = pvalue;
		this.typeNo = typeNo;
	}

	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public Object getPvalue() {
		return pvalue;
	}
	public void setPvalue(Object pvalue) {
		this.pvalue = pvalue;
	}
	public int getTypeNo() {
		return typeNo;
	}
	public void setTypeNo(int typeNo) {
		this.typeNo = typeNo;
	}
}