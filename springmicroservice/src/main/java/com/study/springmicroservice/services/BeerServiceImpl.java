package com.study.springmicroservice.services;

import com.study.springmicroservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service//Very Important!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("galaxy Cat")
                .beerstyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto createBeerDto() {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public void deleteById(UUID beerId) {
        System.out.println("Deleting a beer...");
    }
}
