package com.school.mindera.exercises;

public class Calculator {
    private double digit = 0;
    private double result;
    private double number = 0;
    private int operation = 0;

    private void operations() {
        switch (operation) {
            case 1:
                number = number + digit;
                break;
            case 2:
                number = number - digit;
                break;
            case 3:
                number = number * digit;
                break;
            case 4:
                number = number / digit;
                break;
        }
    }

    public void writeNumbers(double digit) {
        if(operation == 0) {
            number = digit;
        } else {
            this.digit = digit;
        }
    }

    public void mult() {
        operations();
        operation = 3;
    }

    public void div() {
        operations();
        operation = 4;
    }

    public void sum() {
        operations();
        operation = 1;
    }

    public void sub() {
        operations();
        operation = 2;
    }

    public void equals() {
        operations();
        result = number;
        number = 0;
        operation = 0;
    }

    public double getScreen() {
        return result;
    }

    public static void main(String[] args) {

    }
}
