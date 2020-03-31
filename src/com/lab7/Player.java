package com.lab7;
import java.lang.Thread;


public class Player {

    private String name;
    Thread t = new Thread();
//vom genera un nume si dupa vom lucra cu Thread
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void run() {

        while (true) {
            try {
                Thread.sleep(100);}
            catch(InterruptedException e)
            { /* processinterrupt */ }
        }
    }
}
