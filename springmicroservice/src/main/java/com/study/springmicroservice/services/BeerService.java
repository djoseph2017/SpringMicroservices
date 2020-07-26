package com.study.springmicroservice.services;

import com.study.springmicroservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto createBeerDto();

    void updateBeer(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
