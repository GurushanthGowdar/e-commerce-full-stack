package com.example.backend.Authentication;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class userAuthController {

    @Autowired
    private JWTGenerator jwtGenerator;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/login")
    public userAuthModel userLogin(@RequestBody userModel user){
//        System.out.println(user.toString());
//        System.out.println(user.getUsername()=="mahadeva");
        if("Guru".equals(user.getUsername())){
           if("pass@2022".equals(user.getPass())){
               return new userAuthModel(null,20,"logged in ",jwtGenerator.jwtGenerator(user.getUsername()));
           }else{
               return new userAuthModel(null,"wrong password",null);
           }
       }else{
            return new userAuthModel(null,"Incorrect username",null);
        }
    }


}
