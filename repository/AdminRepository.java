package com.onlinefurniture.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.onlinefurniture.domain.Admin;

public interface AdminRepository extends CrudRepository<Admin,Long> {

    @Query(value = "select admin from Admin admin where admin.user.username=:admin_userName")
    public Admin findAdminByUserName(String admin_userName);
}
