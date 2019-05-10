package com.calculator;

public class CalculatorApplication {

    public double addAToB(double a, double b) {
        return a + b;
    }

    public double subtractBFromA(double a, double b) {
         return a - b;
    }

    public static void main(String[] args) {
        CalculatorApplication calculator = new CalculatorApplication();
        System.out.println("The sum of is " + calculator.addAToB(5, 7));
        System.out.println("The result of subtraction is " + calculator.subtractBFromA(20, 7));
    }
}
