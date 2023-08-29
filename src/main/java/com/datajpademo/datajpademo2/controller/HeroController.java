package com.datajpademo.datajpademo2.controller;

import com.datajpademo.datajpademo2.entitiy.Hero;
import com.datajpademo.datajpademo2.service.HeroService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class HeroController {
    private final HeroService heroService;

    @GetMapping
    public List<Hero> findAll(){
        return heroService.findAll();
    }

    @PostMapping
    public Hero saveHero(@RequestBody Hero hero){
        return heroService.saveHero(hero);
    }

    @GetMapping("/{id}")
    public Hero findById(@PathVariable Long id){
        return heroService.findHeroById(id);
    }

}
