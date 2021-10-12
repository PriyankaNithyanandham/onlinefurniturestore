package com.onlinefurniture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefurniture.repository.PhoneRepository;

@Service
public class PhoneServiceImpl implements PhoneService{
    @Autowired
    PhoneRepository phoneRepository;
}
