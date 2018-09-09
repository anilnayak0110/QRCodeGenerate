package com.anilnayak.qrcode;

public class PaytmRequestBody {
	
	private String username;
	private String mobileNo;
	private String accountType;
	private String accountNo;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public PaytmRequestBody(String username, String mobileNo, String accountType, String accountNo) {
		super();
		this.username = username;
		this.mobileNo = mobileNo;
		this.accountType = accountType;
		this.accountNo = accountNo;
	}
	public PaytmRequestBody() {
		super();
	}
	
	

}
