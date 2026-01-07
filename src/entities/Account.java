package src.entities;

import src.exceptions.BusinessException;

public class Account {

    private Integer accountNumber;
    private String accountHolder;
    private Double initialBalance;
    private Double withdrawLimit;

    public Account(){

    }

    public Account(Integer accountNumber, String accountHolder, Double initialBalance, Double withdrawLimit){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.initialBalance = initialBalance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(Double inicialBalance) {
        this.initialBalance = inicialBalance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        initialBalance += amount;
    }

    public void withdraw(double amount) {
        validateWithdraw(amount);
        initialBalance -= amount;
    }

    private void validateWithdraw(double amount) {
        if (amount > getWithdrawLimit()){
            throw new BusinessException("Withdrawal error: The amount exceeds the withdrawal limit.");
        }
        if (amount > getInitialBalance()){
            throw new BusinessException("Withdrawal error: Insufficient funds");
        }
    }

}
