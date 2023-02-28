package com.example.ecommercebackend.Products;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productsController {


    @GetMapping("/test")
    public String test(){
        return "Hello ";
    }


}
