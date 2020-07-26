package com.study.springmicroservice.services;

import com.study.springmicroservice.web.model.BeerDto;
import com.study.springmicroservice.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service//Very Important!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
public class CustomerServiceImpl implements CustomerService{
    @Override
    public CustomerDto getCustomers(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("TestName")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {
        //todo impl - would add a real impl to update beer
    }

    @Override
    public CustomerDto createCustomerDto() {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .build();
    }

    @Override
    public void deleteByCustomerId(UUID customerId) {
        System.out.println("Deleting a beer...");
    }
}
