package com.datajpademo.datajpademo2.service;

import com.datajpademo.datajpademo2.entitiy.Hero;
import com.datajpademo.datajpademo2.repository.HeroRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */


@Service
public class HeroService {
    private final Logger log= LogManager.getLogger(getClass());
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
        long timeBefore=System.currentTimeMillis();
        List<Hero> heroList = heroRepository.findAll();
        long spentTimeInMillis=System.currentTimeMillis()-timeBefore;
        log.info("Execution time: {}",spentTimeInMillis);
        heroList.forEach(hero -> log.info("{}", hero));
        return heroList;
    }

    public Hero findHeroById(Long id) {
        Hero hero = heroRepository.findById(id).orElse(null);
        log.info("returning: {}", hero);
        return hero;
    }


}
