package com.onlinefurniture.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinefurniture.domain.*;
import com.onlinefurniture.dto.UserRegisterDTO;
import com.onlinefurniture.repository.AdminRepository;
import com.onlinefurniture.repository.BuyerRepository;
import com.onlinefurniture.repository.SellerRepository;
import com.onlinefurniture.repository.UserRepository;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Autowired
    SellerRepository sellerRepository;
    @Autowired
    BuyerRepository buyerRepository;
    @Autowired
    AdminRepository adminRepository;

    public Optional<User> findUserByUserName(String userName){
        return userRepository.findUserByUsername(userName);

    }

    @Override
    public void addSeller(Seller seller) {
        sellerRepository.save(seller);
    }
    @Override
    public void addBuyer(Buyer buyer) {
//        buyer.getUser().setR
        buyerRepository.save(buyer);
    }
    @Override
    public void addAdmin(Admin admin) {
//        buyer.getUser().setR
        adminRepository.save(admin);
    }
    @Override
    public boolean createUser(UserRegisterDTO userRegisterDTO) {

        User user = new User();

        Role role = new Role();

        User findUSer = userRepository.findUserByUsername(userRegisterDTO.getUsername()).orElse(null);

        if(findUSer !=null){
            return false;
        }

        role.setRole(userRegisterDTO.getRole());


        user.setEmail(userRegisterDTO.getEmail());
        user.setfName(userRegisterDTO.getFirstName());
        user.setUsername(userRegisterDTO.getUsername());
        user.setPassword(userRegisterDTO.getPassword());
        user.setlName(userRegisterDTO.getLastName());
        user.addRole(role);

        if (userRegisterDTO.getRole().equals("BUYER")){
            Buyer buyer=new Buyer();
            buyer.setUser(user);
            addBuyer(buyer);
        }else if(userRegisterDTO.getRole().equals("SELLER")){
            Seller seller=new Seller();
            seller.setUser(user);
            addSeller(seller);
        }else if(userRegisterDTO.getRole().equals("ADMIN")){
            Admin admin=new Admin();
            admin.setUser(user);
            addAdmin(admin);
        }
       userRepository.save(user);
        return true;
    }

}
