package com.datajpademo.datajpademo2.service;

import com.datajpademo.datajpademo2.entitiy.Hero;
import com.datajpademo.datajpademo2.repository.HeroRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */

@Slf4j
@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero saveHero(Hero hero) {
        Hero savedHero = heroRepository.save(hero);
        log.info("saved: {}", savedHero);
        return savedHero;
    }

    public List<Hero> findAll() {
        List<Hero> heroList = heroRepository.findAll();
        heroList.forEach(hero -> log.info("{}", hero));
        return heroList;
    }

    public Hero findHeroById(UUID id) {
        Hero hero = heroRepository.findById(id).orElse(null);
        log.info("returning: {}", hero);
        return hero;
    }


}
