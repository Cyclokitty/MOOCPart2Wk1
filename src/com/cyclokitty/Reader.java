package com.cyclokitty;

import java.util.Scanner;

public class Reader {
    private Scanner scan;


    public Reader() {
        this.scan = new Scanner(System.in);
    }

    public String readString() {
        String command = this.scan.nextLine();
        return command;

    }

    public int readInteger() {
        String num = this.scan.nextLine();
        return Integer.parseInt(num);
    }
}
