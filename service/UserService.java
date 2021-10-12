package com.onlinefurniture.service;

import org.springframework.stereotype.Service;

import com.onlinefurniture.domain.Admin;
import com.onlinefurniture.domain.Buyer;
import com.onlinefurniture.domain.Seller;
import com.onlinefurniture.domain.User;
import com.onlinefurniture.dto.UserRegisterDTO;

import java.util.Optional;

@Service
public interface UserService {

    public Optional<User> findUserByUserName(String userName);

    boolean createUser(UserRegisterDTO userRegisterDTO);

    public void addSeller(Seller seller);
    public void addBuyer(Buyer buyer);
    public void addAdmin(Admin admin);

}
