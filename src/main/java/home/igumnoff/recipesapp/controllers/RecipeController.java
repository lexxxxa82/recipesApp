package home.igumnoff.recipesapp.controllers;

import home.igumnoff.recipesapp.dto.RecipeDTO;
import home.igumnoff.recipesapp.model.Recipe;
import home.igumnoff.recipesapp.service.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {
    private final RecipeService recipeService;
    public RecipeController(RecipeService recipeService){
        this.recipeService=recipeService;
    }
    @GetMapping("/id")
    public RecipeDTO getRecipe(@PathVariable("id")int id){
        return recipeService.getRecipe(id);
    }
    @PostMapping
    public RecipeDTO addRecipe(@RequestBody Recipe recipe){
        return recipeService.addRecipe(recipe);
    }
}