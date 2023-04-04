package home.igumnoff.recipesapp.model;

import java.util.List;

public class Recipe {

    private String title;

    private int CookingTime;

    private List<Ingredient> Ingredients;
    private List<String> steps;

    public Recipe(String title, int cookingTime, List<Ingredient> ingredients, List<String> steps) {
        this.title = title;
        CookingTime = cookingTime;
        Ingredients = ingredients;
        this.steps = steps;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCookingTime() {
        return CookingTime;
    }

    public void setCookingTime(int cookingTime) {
        CookingTime = cookingTime;
    }

    public List<Ingredient> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        Ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}