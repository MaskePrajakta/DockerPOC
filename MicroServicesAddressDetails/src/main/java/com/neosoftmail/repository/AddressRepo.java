package com.neosoftmail.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoftmail.model.Address;

@Repository
public interface AddressRepo extends MongoRepository<Address, String>{

}
