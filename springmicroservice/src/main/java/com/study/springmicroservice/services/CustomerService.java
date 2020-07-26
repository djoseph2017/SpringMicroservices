package com.study.springmicroservice.services;

import com.study.springmicroservice.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomers(UUID customerId);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    CustomerDto createCustomerDto();

    void deleteByCustomerId(UUID customerId);
}
