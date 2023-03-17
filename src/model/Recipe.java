package model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    List<Ingredient> ingredients;

    public Recipe() {
        this.ingredients = new ArrayList<>() ;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(String name, double weight){
        Ingredient goal = null;
        for(Ingredient ingredient : ingredients){
            if(ingredient.getName().equals(name)) {
                goal = ingredient;
            }
        }

        if(goal != null){
            goal.addWeight(weight);
        }else {
            Ingredient ingredient2Add = new Ingredient(name, weight);
            ingredients.add(ingredient2Add);
        }
    }

    public void removeIngredient(String name){

        for(Ingredient ingredient : ingredients){
            if(ingredient.getName().equals(name)) {
                ingredients.remove(ingredient);
            }
        }
    }
}
