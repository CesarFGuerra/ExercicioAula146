/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.exceptions.DomainException;

/**
 *
 * @author Cesar
 */
public class Account {
    
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double Balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = Balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWhithdrawLimit() {
        return withdrawLimit;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setWhithdrawLimit(Double whithdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
    
    public void whithdraw(Double withdraw){
        if (balance< withdraw){
            throw new DomainException("Exceeded account limit");
        }else if (withdrawLimit < withdraw){
            throw new DomainException("Exceeded withdraw limit");
        }else {
           
            balance -= withdraw;
        }
        }          
       
    public void deposit(double deposit){
        balance += deposit;
    }

    @Override
    public String toString() {
        return "Account number:" + number + ", holder:" + holder + ", balance: $" + balance ;
    }
    
    
    
}
