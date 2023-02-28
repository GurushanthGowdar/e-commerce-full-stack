package com.example.backend.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RecipeRestController {


    @Autowired
    private recipeJpaRepo reciperepository;


    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/getRecipe")
    public List<RecipeModel> getRecipe(){
//        System.out.println(rec);
//        reciperepository.findAll().stream().forEach((data)->System.out.println(data.getName()));
        return reciperepository.findAll();
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/addRecipe")
    public String postRecipe(@RequestBody RecipeModel recipeModel){
        System.out.println("adding "+recipeModel);
        reciperepository.save(recipeModel);
        return "data added ";
    }


    @CrossOrigin(origins = "http://localhost:4200")
    @DeleteMapping("/DeleteRecipe/{id}")
    public List<RecipeModel> deleterecipe(@PathVariable Integer id){



        System.out.println("Inside update");
//        System.out.println(id);
        Optional<RecipeModel> recipeModel=reciperepository.findById(Integer.valueOf(id));
        reciperepository.delete(recipeModel.get());
        return  reciperepository.findAll();

    }


    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(path = "/editRecipe/{id}")
    public List<RecipeModel> updateDetails(@PathVariable Integer id,@RequestBody RecipeModel data){


        System.out.println(id);
        System.out.println("Inside update");
        Optional<RecipeModel> recipeModel=reciperepository.findById(Integer.valueOf(id));

        reciperepository.delete(recipeModel.get());

        reciperepository.save(data);
        return reciperepository.findAll();
    }

}
