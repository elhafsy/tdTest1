package com.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
    Calculator calc = new Calculator();

    @Test
    void testAdd(){
        Assertions.assertEquals(4,calc.add(1,2));
    }
    @Test
    void testSubtract(){
        Assertions.assertEquals(4,calc.sub(9,5));
    }
    @Test
    void testMultiply(){
        Assertions.assertEquals(6, calc.mul(2,3));
    }
    @Test
    void testDivide(){
        Assertions.assertEquals(5, calc.div(10,2));
    }
}
