package com.datajpademo.datajpademo2.entitiy;

import com.datajpademo.datajpademo2.repository.HeroRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
@SpringBootTest
class HeroTest {
    @Autowired
    HeroRepository repository;

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

    @Test
    void testSaveHero(){
        Hero hero = new Hero();
        hero.setName("suraj");

        Hero save = repository.save(hero);

        Optional<Hero> byId = repository.findById(save.getId());
        System.out.println(byId.get().getId());
        System.out.println(byId.get().getCreatedDate().toString());
        System.out.println(byId.get().getUpdated().toString());
        assertNotNull(byId.get().getCreatedDate());

    }

}