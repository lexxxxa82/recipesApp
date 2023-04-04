package home.igumnoff.recipesapp.dto;

import home.igumnoff.recipesapp.model.Ingredient;
import home.igumnoff.recipesapp.model.Recipe;

import java.util.List;

public class RecipeDTO {
    private final int id;
    private final String title;
    private final int cookingTime;
    private final List<Ingredient> Ingredients;
    private final List<String> steps;

    public RecipeDTO(int id, String title, int cookingTime, List<Ingredient> ingredients, List<String> steps) {
        this.id = id;
        this.title = title;
        this.cookingTime = cookingTime;
        Ingredients = ingredients;
        this.steps = steps;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<Ingredient> getIngredients() {
        return Ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public static RecipeDTO from(int id, Recipe recipe) {
        return new RecipeDTO(id, recipe.getTitle(), recipe.getCookingTime(), recipe.getIngredients(),
                recipe.getSteps());
    }
}