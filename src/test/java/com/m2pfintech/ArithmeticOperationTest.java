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
}
