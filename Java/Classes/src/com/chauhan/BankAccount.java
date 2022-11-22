package com.chauhan;

public class BankAccount {

    private Long accountNumber;
    private Double balance;
    private String customerName;
    private String email;
    private Long phoneNumber;

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double depositFund(Double depositAmount) {
        this.balance += depositAmount;
        return this.balance;
    }

    public Double withdrawFunds(Double withdrawAmount) {
        if (this.balance - withdrawAmount < 0) {
            System.out.println("Insuficient Balance");
            return -1d;
        } else  {
            this.balance -= withdrawAmount;
            return this.balance;
        }
    }
}
