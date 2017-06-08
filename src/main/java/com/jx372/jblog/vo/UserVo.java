package com.jx372.jblog.vo;

public class UserVo {

	private String name;
	private String password;
	private String id;
	private Long no;
	private String regDate;
	
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}
	public final String getId() {
		return id;
	}
	public final void setId(String id) {
		this.id = id;
	}
	public final Long getNo() {
		return no;
	}
	public final void setNo(Long no) {
		this.no = no;
	}
	public final String getRegDate() {
		return regDate;
	}
	public final void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	@Override
	public String toString() {
		return "UserVo [name=" + name + ", password=" + password + ", id=" + id + ", no=" + no + ", regDate=" + regDate
				+ "]";
	}
	
	
}
