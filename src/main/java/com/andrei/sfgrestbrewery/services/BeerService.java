package com.andrei.sfgrestbrewery.services;

import com.andrei.sfgrestbrewery.web.model.BeerDto;
import com.andrei.sfgrestbrewery.web.model.BeerPagedList;
import com.andrei.sfgrestbrewery.web.model.BeerStyleEnum;
import org.springframework.data.domain.PageRequest;
import reactor.core.publisher.Mono;

import java.util.UUID;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    Mono<BeerPagedList> listBeers(String beerName, BeerStyleEnum beerStyle, PageRequest pageRequest, Boolean showInventoryOnHand);

    Mono<BeerDto> getById(Integer beerId, Boolean showInventoryOnHand);

    Mono<BeerDto> saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);

    Mono<BeerDto> getByUpc(String upc);

    void deleteBeerById(Integer beerId);
}
