package com.onlinefurniture.controller;


import ch.qos.logback.core.net.SyslogOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import com.onlinefurniture.dto.AuthenticationRequest;
import com.onlinefurniture.dto.AuthenticationResponse;
import com.onlinefurniture.dto.UserRegisterDTO;
import com.onlinefurniture.service.UserService;
import com.onlinefurniture.service.MyUserDetails.LoginUserDetailsService;
import com.onlinefurniture.util.JwtUtil;

@RestController
@CrossOrigin(origins = {"*"})
public class AuthentificationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private LoginUserDetailsService loginUserDetailsService;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authRequest) throws Exception{
        /*System.out.println("USERNAME");
        System.out.println(authRequest.getUsername());
        System.out.println("PASSWORD");
        System.out.println(authRequest.getPassword());*/

        try{
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUsername(),authRequest.getPassword())
            );
        }catch(BadCredentialsException e){

            throw new Exception("!! INCORRECT USER NAME OR PASSWORD",e);

        }
        final UserDetails userDetails = loginUserDetailsService.loadUserByUsername(authRequest.getUsername());
        final String jwt = jwtUtil.generateToken(userDetails);
        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
    @PostMapping("/register")
    public  ResponseEntity<AuthenticationResponse> createUSer(@RequestBody UserRegisterDTO userRegisterDTO){

        System.out.println("lName");
        System.out.println(userRegisterDTO.getLastName());
        System.out.println("FName");
        System.out.println(userRegisterDTO.getFirstName());
        System.out.println("ROLE");
        System.out.println(userRegisterDTO.getRole());


        boolean isUserCreated = userService.createUser(userRegisterDTO);
        if(isUserCreated){
            UserDetails userDetails = loginUserDetailsService.loadUserByUsername(userRegisterDTO.getUsername());
            String jwt = jwtUtil.generateToken(userDetails);
            return ResponseEntity.ok(new AuthenticationResponse(jwt));
        }
        return ResponseEntity.ok(new AuthenticationResponse(null));

    }




}
