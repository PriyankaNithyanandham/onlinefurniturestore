package com.onlinefurniture.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.onlinefurniture.repository.AddressRepository;

public class AddressServiceImpl implements AddressService{
    @Autowired
    AddressRepository addressRepository;
}

