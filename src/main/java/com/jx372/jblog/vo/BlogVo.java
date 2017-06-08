package com.jx372.jblog.vo;

public class BlogVo {
	
	private Long userNo;
	private String title;
	private String logoPath;
	private Long categoryNo;
	private String categoryName;
	private String categoryReg;
	private String postTitle;
	private String postContent;
	private String postReg;
	private Long postNo;
	
	@Override
	public String toString() {
		return "BlogVo [userNo=" + userNo + ", title=" + title + ", logoPath=" + logoPath + ", categoryNo=" + categoryNo
				+ ", categoryName=" + categoryName + ", categoryReg=" + categoryReg + ", postTitle=" + postTitle
				+ ", postContent=" + postContent + ", postReg=" + postReg + ", postNo=" + postNo + "]";
	}
	public final Long getUserNo() {
		return userNo;
	}
	public final void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public final String getTitle() {
		return title;
	}
	public final void setTitle(String title) {
		this.title = title;
	}
	public final String getLogoPath() {
		return logoPath;
	}
	public final void setLogoPath(String logoPath) {
		this.logoPath = logoPath;
	}
	public final Long getCategoryNo() {
		return categoryNo;
	}
	public final void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public final String getCategoryName() {
		return categoryName;
	}
	public final void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public final String getCategoryReg() {
		return categoryReg;
	}
	public final void setCategoryReg(String categoryReg) {
		this.categoryReg = categoryReg;
	}
	public final String getPostTitle() {
		return postTitle;
	}
	public final void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	public final String getPostContent() {
		return postContent;
	}
	public final void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public final String getPostReg() {
		return postReg;
	}
	public final void setPostReg(String postReg) {
		this.postReg = postReg;
	}
	public final Long getPostNo() {
		return postNo;
	}
	public final void setPostNo(Long postNo) {
		this.postNo = postNo;
	}
	
	
	
}
