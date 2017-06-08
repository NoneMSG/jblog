package com.jx372.jblog.vo;

public class PostVo {
	private Long no;
	private Long categoryNo;
	private String title;
	private String content;
	private String regDate;
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
	@Override
	public String toString() {
		return "PostVo [no=" + no + ", categoryNo=" + categoryNo + ", title=" + title + ", content=" + content
				+ ", regDate=" + regDate + "]";
	}
	
}
