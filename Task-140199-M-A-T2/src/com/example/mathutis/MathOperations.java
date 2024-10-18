package com.example.mathutils;

public class MathOperations {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double base, double exponent) {
        double result = 1.0;
        for (int i = 0; i < Math.abs((int) exponent); i++) {
            result *= base;
        }

        if (exponent < 0) {
            result = 1.0 / result;
        }

        return result;
    }
}

