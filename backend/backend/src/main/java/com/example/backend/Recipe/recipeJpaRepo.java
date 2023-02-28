package com.example.backend.Recipe;

import org.springframework.data.jpa.repository.JpaRepository;

public interface recipeJpaRepo extends JpaRepository<RecipeModel,Integer> {
}
