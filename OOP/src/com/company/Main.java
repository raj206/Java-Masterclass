package com.company;

public class Main {

    public static void main(String[] args) {
    Car Nissan = new Car();
    Car Mercedes  = new Car();
    Nissan.setModel("slc");
    System.out.println("Model name is: " + Nissan.getModel());

    Account evo = new Account();
    evo.setAccount_number(1);
    evo.setBalance(10000);
    evo.setEmail("e@v.o");
    evo.setName("Evo");
    evo.setNumber(1111111111);

    evo.deposit(5000);
    evo.withdraw(15001);

    // Account ev = new Account(2, 100, "e", "e2d", 123);
    }
}
