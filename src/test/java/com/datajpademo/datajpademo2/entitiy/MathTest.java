package com.datajpademo.datajpademo2.entitiy;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    @ParameterizedTest(name="sqrt({0})={1}")
    @CsvSource(textBlock= """
            4.0,2.0
            9.0,3.0
            2.0,1.41
            """)
    void sqrt(double input, double expected){
        assertEquals(expected,Math.sqrt(input),0.01);
    }

//    @RepeatedTest(100)
    void flakyTest(){
        assertEquals(0.0,Math.random(),0.9);
    }

    @TestFactory
    Stream<DynamicTest> evenNumbersAreDivisibleByTwo(){
        return IntStream.iterate(0,n->n+2)
                .limit(1000)
                .mapToObj(n->DynamicTest.dynamicTest(n+" is divisible by 2",()->{
                    assertEquals(0,n%2);
                }));
    }

}
