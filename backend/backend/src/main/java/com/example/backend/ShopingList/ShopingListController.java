package com.example.backend.ShopingList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShopingListController {


    @Autowired
    private ShopingListJPA shopingListJPA;


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getShopingDetails")
    public List<ShopingListModel> getDetails(){
        return shopingListJPA.findAll();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/AddShopingDetails")
    public List<ShopingListModel> postDetails(@RequestBody ShopingListModel shopingListModel){

         shopingListJPA.save(shopingListModel);
        return shopingListJPA.findAll();
    }



    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/DeleteShopingDetails/{id}")
    public List<ShopingListModel> deleteData(@PathVariable Integer id){
//         Optional<ShopingListModel> shopingListModel=shopingListJPA.findById(id);

         shopingListJPA.deleteById(Integer.valueOf(id));

         return shopingListJPA.findAll();

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/UpdateShopingDetils/{id}")
    public List<ShopingListModel> updateDetails(@RequestBody ShopingListModel shopingListModel,@PathVariable Integer id){

        shopingListJPA.deleteById(Integer.valueOf(id));
        shopingListJPA.save(shopingListModel);

        return shopingListJPA.findAll();
    }
}
