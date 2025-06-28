package com.pack.account.entity;



public class Account {
    private String accountId;
    private String customerId;
    private String accountType;
    private String branchCode;
    
    // Constructors, getters, and setters
    public Account() {}
    
    public Account(String accountId, String customerId, String accountType, String branchCode) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
        this.branchCode = branchCode;
    }

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
    
    
}