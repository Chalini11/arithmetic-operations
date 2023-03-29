package com.m2pfintech;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationTest
{
   ArithmeticOperation arithmeticObject = new ArithmeticOperation();
   @Test
   void toReturnFourWhenOneIsAddedToThree()
   {
      int expectedValue = 4;

      int actualValue = arithmeticObject.add(1,3);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnFourWhenFiveIsSubtractedFromNine()
   {
      int expectedValue = 4;

      int actualValue = arithmeticObject.subtract(9,5);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnMinusFourWhenNineIsSubtractedFromFive()
   {
      int expectedValue = -4;

      int actualValue = arithmeticObject.subtract(5,9);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnTenWhenFiveIsMultipliedByTwo()
   {
      int expectedValue = 10;

      int actualValue = arithmeticObject.multiply(2,5);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnZeroWhenFiveIsMultipliedByZero()
   {
      int expectedValue = 0;

      int actualValue = arithmeticObject.multiply(0,5);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnMinusOneWhenMinusOneIsMultipliedByOne()
   {
      int expectedValue = -1;

      int actualValue = arithmeticObject.multiply(-1,1);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnOneWhenMinusOneIsMultipliedByMinusOne()
   {
      int expectedValue = 1;

      int actualValue = arithmeticObject.multiply(-1,-1);

      assertEquals(expectedValue,actualValue);
   }

   @Test
   void toReturnTwoWhenFourIsDividedByTwo()
   {
      double expectedValue = 2.0;

      double actualValue = arithmeticObject.divide(4,2);

      assertEquals(expectedValue,actualValue);
   }




}
