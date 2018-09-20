package com.company;

/*
    Synchronize, wait, notify etc. are in the notes rather than the code. I think it was more important to understand the concept.
 */

import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;

import static com.company.ThreadColor.ANSI_GREEN;
import static com.company.ThreadColor.ANSI_RED;
import static com.company.ThreadColor.ANSI_CYAN;

public class Main {

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "Hello from the main thread!");

        Thread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_CYAN + "hello from the anonymous class!");
            }
        }.start();

        Future

        System.out.println(ANSI_GREEN + "Hello, again! -- from the main thread!");

        Thread runner = new Thread( new MyRunnable());

        runner.start();
    }
}
