package com.jx372.jblog.vo;

public class AdminVo {
	
	private Long userNo;
	private Long categoryNo;
	private Long postCount;
	private String title;
	private String content;
	private String logoPath;
	private String categoryName;
	private String categoryDisc;
	
	
	@Override
	public String toString() {
		return "AdminVo [userNo=" + userNo + ", categoryNo=" + categoryNo + ", postCount=" + postCount + ", title="
				+ title + ", content=" + content + ", logoPath=" + logoPath + ", categoryName=" + categoryName
				+ ", categoryDisc=" + categoryDisc + "]";
	}
	public final Long getUserNo() {
		return userNo;
	}
	public final void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public final Long getCategoryNo() {
		return categoryNo;
	}
	public final void setCategoryNo(Long categoryNo) {
		this.categoryNo = categoryNo;
	}
	public final Long getPostCount() {
		return postCount;
	}
	public final void setPostCount(Long postCount) {
		this.postCount = postCount;
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
	public final String getCategoryName() {
		return categoryName;
	}
	public final void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public final String getCategoryDisc() {
		return categoryDisc;
	}
	public final void setCategoryDisc(String categoryDisc) {
		this.categoryDisc = categoryDisc;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
	
}
