package com.bridgelabz.JUnit.divisionTest;

public class Division {
    public int divide(int i, int i1) {
        if(i1==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return i/i1;

    }
}
