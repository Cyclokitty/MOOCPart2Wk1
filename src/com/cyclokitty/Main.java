package com.cyclokitty;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String word = "carrot";
        Change change1 = new Change('a', 'b');
        word = change1.change(word);
        System.out.println(word);

        Change change2 = new Change('r', 'x');
        word = change2.change(word);
        System.out.println(word);

//        Reader reader = new Reader();
//
//        System.out.print("Command: ");
//        String repeat = reader.readString();
//
//        System.out.print("Value 1: ");
//        int num = reader.readInteger();
//
//        System.out.print("Value 2: ");
//        int num2 = reader.readInteger();
//        System.out.print(repeat + " of the values:  ");
//        System.out.print(num + num2);

        Calculator calc = new Calculator();
        calc.start();

    }



}
