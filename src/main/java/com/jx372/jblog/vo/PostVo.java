package com.jx372.jblog.vo;

public class PostVo {
	private Long no;
	private Long categoryNo;
	private Long userNo;
	private String userName;
	private String categoryName;
	private String title;
	private String content;
	private String regDate;
	
	
	@Override
	public String toString() {
		return "PostVo [no=" + no + ", categoryNo=" + categoryNo + ", userNo=" + userNo + ", userName=" + userName
				+ ", categoryName=" + categoryName + ", title=" + title + ", content=" + content + ", regDate="
				+ regDate + "]";
	}
	public final Long getNo() {
		return no;
	}
	public final void setNo(Long no) {
		this.no = no;
	}
	public final Long getCategoryNo() {
		return categoryNo;
	}
	public final void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getContent() {
		return content;
	}
	public final void setContent(String content) {
		this.content = content;
	}
	public final String getRegDate() {
		return regDate;
	}
	public final void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
