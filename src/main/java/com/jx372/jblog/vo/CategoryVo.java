package com.jx372.jblog.vo;

public class CategoryVo {
	private Long no;
	private Long userNo;
	private String name;
	private String description;
	private String regDate;
	
	@Override
	public String toString() {
		return "CategoryVo [no=" + no + ", userNo=" + userNo + ", name=" + name + ", description=" + description
				+ ", regDate=" + regDate + "]";
	}
	public final Long getNo() {
		return no;
	}
	public final void setNo(Long no) {
		this.no = no;
	}
	public final Long getUserNo() {
		return userNo;
	}
	public final void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	public final String getRegDate() {
		return regDate;
	}
	public final void setRegDate(String regDate) {
		this.regDate = regDate;
	}
}
