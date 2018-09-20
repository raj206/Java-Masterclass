package com.company;

import java.sql.SQLOutput;

import static com.company.ThreadColor.ANSI_BLACK;
import static com.company.ThreadColor.ANSI_BLUE;

public class AnotherThread extends Thread {
    @Override
    public void run() {
        System.out.println(ANSI_BLUE +"Hello from another thread!");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e ){
            System.out.println(ANSI_BLACK + "Another thread woke me up!");
        }

        System.out.println(ANSI_BLACK + "0.3 second has passed and I'm awake!");
    }
}
