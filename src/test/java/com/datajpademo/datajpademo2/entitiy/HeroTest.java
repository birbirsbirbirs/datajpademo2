package com.datajpademo.datajpademo2.entitiy;

import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
class HeroTest {

    @Test
    void testEquals(){
        UUID uuid = UUID.randomUUID();
        Hero hero1 = new Hero();
        hero1.setId(uuid);
        Hero hero2 = new Hero();
        hero2.setId(uuid);

        assertEquals(hero1,hero2);
    }

    @Test
    void testNotEquals(){

        Hero hero1 = new Hero();
        hero1.setId(UUID.randomUUID());
        Hero hero2 = new Hero();
        hero2.setId(UUID.randomUUID());

        assertNotEquals(hero1,hero2);
    }

}