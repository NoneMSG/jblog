package com.jx372.jblog.vo;

public class BlogVo {
	
	private Long userNo;
	private String title;
	private String logoPath;
	
	
	@Override
	public String toString() {
		return "BlogVo [userNo=" + userNo + ", title=" + title + ", logoPath=" + logoPath ;
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

	
	
	
}
