package com.userpet.demo.fapp.contactmessenger;

public class MessDto {

	private String messSeq;
	private String messList;
	private String messAddress;
	private int messMain;
	private int deleNy;
	private int contactAdd_contSeq;
	
	public String getMessSeq() {
		return messSeq;
	}
	public void setMessSeq(String messSeq) {
		this.messSeq = messSeq;
	}
	public String getMessList() {
		return messList;
	}
	public void setMessList(String messList) {
		this.messList = messList;
	}
	public int getMessMain() {
		return messMain;
	}
	public void setMessMain(int messMain) {
		this.messMain = messMain;
	}
	public int getContactAdd_contSeq() {
		return contactAdd_contSeq;
	}
	public void setContactAdd_contSeq(int contactAdd_contSeq) {
		this.contactAdd_contSeq = contactAdd_contSeq;
	}
	public String getMessAddress() {
		return messAddress;
	}
	public void setMessAddress(String messAddress) {
		this.messAddress = messAddress;
	}
	public int getDeleNy() {
		return deleNy;
	}
	public void setDeleNy(int deleNy) {
		this.deleNy = deleNy;
	}
}
