package com.example;

public class SimpleTest {
    
    public int multiple(int a, int b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }
    
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Returning 1 for factorial of 0 or 1
        }
        return n * factorial(n - 1);
    }
}
