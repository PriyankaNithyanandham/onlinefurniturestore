package com.onlinefurniture.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinefurniture.domain.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address,Long> {

}
