package com.datajpademo.datajpademo2.entitiy;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class DisplayNameGenerators {

    @Test void if_it_is_zero(){

    }

    @ParameterizedTest
    @ValueSource(ints={-1,-4,-10}) void if_it_is_negative(int year){
        assertTrue(year>=-10);
    }
}
