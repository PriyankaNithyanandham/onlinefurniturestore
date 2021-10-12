package com.onlinefurniture.service.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefurniture.domain.Admin;
import com.onlinefurniture.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin getAdminProfile(String admin_userName) {
        return adminRepository.findAdminByUserName(admin_userName);
    }
}
