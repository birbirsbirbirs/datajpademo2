package com.datajpademo.datajpademo2.entitiy;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
@DisplayName("Calculator")
public class Tests {
    @BeforeEach void createResource(){

    }

//    @Disabled
    @Tag("feature-addition")
    @DisplayName("should return sum of two numbers when adding")
    @Test void test(){
        assertEquals(2,1+1);
    }
}
