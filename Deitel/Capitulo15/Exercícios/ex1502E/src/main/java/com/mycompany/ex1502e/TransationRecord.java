package com.mycompany.ex1502e;

public class TransationRecord {
    private int account;
    private double amount;
    public TransationRecord(int account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){
        return String.format("Conta: %d%nValor: R$%.2f", getAccount(),getAmount());
    }
}
