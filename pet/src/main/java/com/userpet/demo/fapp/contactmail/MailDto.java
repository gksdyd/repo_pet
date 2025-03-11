package com.userpet.demo.fapp.contactmail;

public class MailDto {

	private String mailSeq;
	private String mailAddr;
	private int mailMain;
	private int deleNy;
	private String contactAdd_contSeq;
	
	public String getMailSeq() {
		return mailSeq;
	}
	public void setMailSeq(String mailSeq) {
		this.mailSeq = mailSeq;
	}
	public String getMailAddr() {
		return mailAddr;
	}
	public void setMailAddr(String mailAddr) {
		this.mailAddr = mailAddr;
	}
	public int getMailMain() {
		return mailMain;
	}
	public void setMailMain(int mailMain) {
		this.mailMain = mailMain;
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
