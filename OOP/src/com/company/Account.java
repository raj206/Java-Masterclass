package com.company;

public class Account {

    // Variables
    private int account_number;
    private int balance;
    private String name;
    private String email;
    private int number;


    // Constructor
//    public Account(int account_number, int balance, String name, String email, int number){
//        System.out.println("Constructor constructing...");
//        this.balance = balance;
//        this.number = number;
//        this.email = email;
//        this.name = name;
//        this.account_number = account_number;
//    }


    // Setters
    public void setAccount_number(int account_number){
        this.account_number = account_number;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNumber(int number){
        this.number = number;
    }

    // Getters
    public int getAccount_number(){
        return this.account_number;
    }
    public int getBalance(){
        return this.balance;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getNumber(){
        return this.number;
    }


    // Methods for manipulation
    public void deposit(int added){
        this.balance = this.balance + added;
        System.out.println("The new balance is: $" + this.balance);
    }
    public void withdraw(int subtract){
        if(this.balance>subtract){
            this.balance = this.balance - subtract;
            System.out.println("The new balance is: $" + this.balance);
        }
        else{
            System.out.println("Insufficient balance by: $"+ (subtract - this.balance));
        }
    }

}
