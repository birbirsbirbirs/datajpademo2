package com.datajpademo.datajpademo2.config;

import com.datajpademo.datajpademo2.entitiy.Address;
import com.datajpademo.datajpademo2.entitiy.Hero;
import com.datajpademo.datajpademo2.entitiy.OrderStatus;
import com.datajpademo.datajpademo2.repository.HeroRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Slf4j
@RequiredArgsConstructor
@Component
public class CustomCommandLineRunner implements CommandLineRunner {
    private final HeroRepository heroRepository;
    @Override
    public void run(String... args) throws Exception {
        Address address = Address.builder().address("6900 Squire Ln").city("Yukon").state("OK")
                .zipCode("73116").build();
        Hero hero = Hero.builder().name("name1").orderStatus(OrderStatus.NEW).shippingAddress(address)
                .billToAddress(address).build();
        heroRepository.save(hero);


    }
}
