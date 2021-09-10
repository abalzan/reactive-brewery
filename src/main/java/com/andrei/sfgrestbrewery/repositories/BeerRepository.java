package com.andrei.sfgrestbrewery.repositories;


import com.andrei.sfgrestbrewery.domain.Beer;
import com.andrei.sfgrestbrewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import java.util.UUID;


public interface BeerRepository extends R2dbcRepository<Beer, Integer> {
//    Page<Beer> findAllByBeerName(String beerName, Pageable pageable);
//
//    Page<Beer> findAllByBeerStyle(BeerStyleEnum beerStyle, Pageable pageable);
//
//    Page<Beer> findAllByBeerNameAndBeerStyle(String beerName, BeerStyleEnum beerStyle, Pageable pageable);

    Beer findByUpc(String upc);
}
