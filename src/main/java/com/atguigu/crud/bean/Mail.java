package com.atguigu.crud.bean;

public class Mail {
       private String myEmailAccount;
       private String myEmailPassword;
       private String myEmailSMTPHost;
       private  String receiveMailAccount;
	public String getMyEmailAccount() {
		return myEmailAccount;
	}
	public void setMyEmailAccount(String myEmailAccount) {
		this.myEmailAccount = myEmailAccount;
	}
	public String getMyEmailPassword() {
		return myEmailPassword;
	}
	public void setMyEmailPassword(String myEmailPassword) {
		this.myEmailPassword = myEmailPassword;
	}
	public String getMyEmailSMTPHost() {
		return myEmailSMTPHost;
	}
	public void setMyEmailSMTPHost(String myEmailSMTPHost) {
		this.myEmailSMTPHost = myEmailSMTPHost;
	}
	public String getReceiveMailAccount() {
		return receiveMailAccount;
	}
	public void setReceiveMailAccount(String receiveMailAccount) {
		this.receiveMailAccount = receiveMailAccount;
	}
       
}
