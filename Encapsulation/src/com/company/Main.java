package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer p = new Printer(50, false);
        System.out.println("Initial count: "+ p.getPagesPrinted());
        int pagesPrinted = p.printPages(4);
        System.out.println("New print count: " + p.getPagesPrinted());
    }
}
