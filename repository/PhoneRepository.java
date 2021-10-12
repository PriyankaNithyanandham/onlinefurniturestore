package com.onlinefurniture.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.onlinefurniture.domain.Phone;

@Repository
public interface PhoneRepository extends CrudRepository<Phone,Long> {
}
