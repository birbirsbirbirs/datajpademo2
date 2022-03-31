package com.datajpademo.datajpademo2.repository;

import com.datajpademo.datajpademo2.entitiy.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author bir birs sgrg007@gmail.com
 * @since 3/30/2022
 */
public interface HeroRepository extends JpaRepository<Hero, UUID> {
}
