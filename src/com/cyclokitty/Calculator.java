package com.cyclokitty;

public class Calculator {
    private Reader reader;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        int total = 0;
        while(true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                sum();
                total++;
            } else if (command.equals("difference")) {
                difference();
                total++;
            } else if (command.equals("product")) {
                product();
                total++;
            }
        }

        statistics(total);
    }

    private void sum() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("sum of the values: " + (value1 + value2));
    }

    private void difference() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("difference of the values: " + (value1 - value2));

    }

    private void product() {
        System.out.print("value1: ");
        int value1 = this.reader.readInteger();
        System.out.print("value2: ");
        int value2 = this.reader.readInteger();
        System.out.println("product of the values: " + (value1 * value2));
    }

    private void statistics(int total) {
        System.out.println("Calculations done: " + total);
    }

}
