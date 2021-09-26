package com.service;

import com.dto.CustomerDto;
import com.entity.CustomerEntity;
import com.repository.ICustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository;

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        CustomerEntity customerEntity = new CustomerEntity();
        customerEntity.setCustomerId(customerDto.getCustomerId());
        customerEntity.setIdentityNumber(customerDto.getIdentityNumber());
        customerEntity.setCustomerCompanyId(customerDto.getCustomerCompanyId());
        customerEntity.setAddress(customerDto.getAddress());
        customerEntity.setNationality(customerDto.getNationality());
        customerEntity.setPhoneNumber(customerDto.getPhoneNumber());
        customerRepository.save(customerEntity);
        return null;
    }

    @Override
    public List<CustomerDto> getAll() {
        List<CustomerEntity> customerEntityList  = customerRepository.findAll();
        List<CustomerDto> customerDtoList  = new ArrayList<>();
        customerEntityList.forEach(it -> {
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustomerId(it.getCustomerId());
            customerDto.setCustomerCompanyId(it.getCustomerCompanyId());
            customerDto.setIdentityNumber(it.getIdentityNumber());
            customerDto.setPhoneNumber(it.getPhoneNumber());
            customerDto.setNationality(it.getNationality());
            customerDto.setAddress(it.getAddress());
            customerDtoList.add(customerDto);
        });
     return customerDtoList;
    }

    @Override
    public List<CustomerDto> getByCustomerId(Long customerId) {
        return null;
    }
}
