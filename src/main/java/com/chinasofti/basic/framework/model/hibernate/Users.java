package com.chinasofti.basic.framework.model.hibernate;

import java.util.Date;

import org.apache.commons.lang.StringEscapeUtils;



/**
 * @hibernate.class table="users"
 * @author zj
 * @version 1.0 
 */
public class Users {
	private String  user_id;		/* 主键 */
	private String 	user_name;		/* 用户登陆名 */
	private String 	user_pwd;		/* 用户密码 */
	private String 	user_email;		/* 用户Email地址 */
	private String 	user_desc;		/* 用户说明 */
	private String 	user_dept;		/* 用户部门编号 */
	private String 	user_type;		/* 用户类型(1管理员,..) */
	

	
	/**
	 * @hibernate.id column="user_id" generator-class="uuid.hex" length="32"
	 * @return
	 */
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	
	/**
	 * @hibernate.property column="user_name" not-null="true"	 length="50"
	 */
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = replaceStr(user_name);
	}
	
	/**
	 * @hibernate.property column="user_pwd" not-null="true"	 length="50" 
	 */
	public String getUser_pwd() {
		return user_pwd;
	}
	public void setUser_pwd(String user_pwd) {
		this.user_pwd = replaceStr(user_pwd);
	}
	
	/**
	 * @hibernate.property column="user_email"  length="50"
	 */
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = replaceStr(user_email);
	}
	

	/**
	 * @hibernate.property column="user_desc"  length="500"
	 */
	public String getUser_desc() {
		return user_desc;
	}
	public void setUser_desc(String user_desc) {
		this.user_desc = replaceStr(user_desc);
	}
	
	


	/**
	 * @hibernate.property column="user_dept"  length="50"
	 */
	public String getUser_dept() {
		return user_dept;
	}
	public void setUser_dept(String user_dept) {
		this.user_dept = replaceStr(user_dept);
	}

	/**
	 * @hibernate.property column="user_type"  length="20"
	 */
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = replaceStr(user_type);
	}
	
	private String replaceStr(String str){
		if(str!=null && !"".equals(str)){
			str = str.replaceAll("<", "&lt;");
			str = str.replaceAll(">", "&gt;");
		}
		return str;
	}
	
}
