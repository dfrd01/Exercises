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
        Calculator calc = new Calculator();

        calc.writeNumbers(10);
        calc.sum();
        calc.writeNumbers(20);
        calc.sub();
        calc.writeNumbers(5);
        calc.mult();
        calc.writeNumbers(4);
        calc.div();
        calc.writeNumbers(2);
        calc.equals();
        System.out.println(calc.getScreen());
    }
}
