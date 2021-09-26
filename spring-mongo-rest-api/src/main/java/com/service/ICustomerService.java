package com.service;

import com.dto.CustomerDto;

import java.util.List;

public interface ICustomerService {

    CustomerDto save (CustomerDto customerDto);
    List<CustomerDto> getAll();
    List<CustomerDto> getByCustomerId (Long customerId);
}
