package com.study.springmicroservice.web.controller;

import com.study.springmicroservice.services.CustomerService;
import com.study.springmicroservice.web.model.BeerDto;
import com.study.springmicroservice.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{customerId}"})
    public ResponseEntity<CustomerDto> getCustomerById(@PathVariable("customerId") UUID customerId){
        return new ResponseEntity<>(customerService.getCustomers(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> createBeerDto(@RequestBody CustomerDto customerDto){
        CustomerDto saveCustomerDto = customerService.createCustomerDto();
        HttpHeaders headers = new HttpHeaders();
        //todo hostname to url
        System.out.println("Creating..........");
        headers.add("Location","/api/v1/customer/"+saveCustomerDto.getId().toString());
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }
    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId,@RequestBody CustomerDto customerDto){

        customerService.updateCustomer(customerId, customerDto);

        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("customerId") UUID customerId){
        customerService.deleteByCustomerId(customerId);
    }

}
