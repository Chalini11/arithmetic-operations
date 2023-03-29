package com.m2pfintech;

public class ArithmeticOperation
{

    public int add(int firstNumber, int secondNumber)
    {
        return firstNumber+secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber )
    {
        return firstNumber-secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber)
    {
        return firstNumber*secondNumber;
    }

    public double divide(double firstNumber, double secondNumber)
    {

        if(secondNumber == 0)
            throw  new ArithmeticException();
        return firstNumber / secondNumber;
    }
}
