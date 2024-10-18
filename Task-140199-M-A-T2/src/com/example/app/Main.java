package com.example.app;

import com.example.mathutils.MathOperations;

public class Main {
    public static void main(String[] args){
        int number = 5;
        int factorialResult = MathOperations.factorial(number);
        double base = 2.0, exponent = 3.0;
        double powerResult = MathOperations.power(base, exponent);

        System.out.println("Factorial of " + number + " is: " + factorialResult);
        System.out.println(base + " to the power of " + exponent + " is: " + powerResult);
    }
}

