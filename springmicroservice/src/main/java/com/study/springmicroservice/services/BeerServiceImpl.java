package com.study.springmicroservice.services;

import com.study.springmicroservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("galaxy Cat")
                .beerstyle("Pale Ale")
                .build();
    }
}
