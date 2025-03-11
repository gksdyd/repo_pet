package com.userpet.demo.fapp.contactpage;

public class PageDto {

	private String pageSeq;
	private String pageAddress;
	private int pageMain;
	private int deleNy;
	private String contactAdd_contSeq;
	
	public String getPageSeq() {
		return pageSeq;
	}
	public void setPageSeq(String pageSeq) {
		this.pageSeq = pageSeq;
	}
	public String getPageAddress() {
		return pageAddress;
	}
	public void setPageAddress(String pageAddress) {
		this.pageAddress = pageAddress;
	}
	public int getPageMain() {
		return pageMain;
	}
	public void setPageMain(int pageMain) {
		this.pageMain = pageMain;
	}
	public String getContactAdd_contSeq() {
		return contactAdd_contSeq;
	}
	public void setContactAdd_contSeq(String contactAdd_contSeq) {
		this.contactAdd_contSeq = contactAdd_contSeq;
	}
	public int getDeleNy() {
		return deleNy;
	}
	public void setDeleNy(int deleNy) {
		this.deleNy = deleNy;
	}
}
