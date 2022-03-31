package com.datajpademo.datajpademo2.service;

import com.datajpademo.datajpademo2.repository.HeroRepository;
import org.springframework.stereotype.Service;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
@Service
public class HeroService {
    private final HeroRepository heroRepository;

    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }
}
