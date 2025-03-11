package com.xuankha.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    public static Object [][] initData() {
        return new Object[][]{
                {0,1},
                {1,1},
                {2,2},
                {3,6},
                {4,24},
                {5,120},
                {6,720}
        };
    }


    //test case with
//    @ParameterizedTest
//    @MethodSource("initData")
    @ParameterizedTest
    @MethodSource(value = "initData")
    public  void testFactorialGivenRightArgRunsWell(int n, long expectedResult){
//        int n = 5; // cho n  = 0
//        long expectedResult = 120; // hy vong 0!  ở trên sẽ là 1
//        long actualValue = MathUtility.getFactorial(n);// thực tế là mấy
        assertEquals(expectedResult,MathUtility.getFactorial(n));
    }
}