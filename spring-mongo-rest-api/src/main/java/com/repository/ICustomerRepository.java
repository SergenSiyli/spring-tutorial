package com.repository;

import com.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepository extends MongoRepository <CustomerEntity,String> {
}
