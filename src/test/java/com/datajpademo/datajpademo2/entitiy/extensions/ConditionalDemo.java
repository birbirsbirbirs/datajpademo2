package com.datajpademo.datajpademo2.entitiy.extensions;

import org.junit.jupiter.api.Test;

import static java.time.DayOfWeek.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ConditionalDemo {

    @Test
    @DisabledOnWeekdays({FRIDAY, SUNDAY})
    void conditionalTest() {
        assertTrue(true);
    }

}
