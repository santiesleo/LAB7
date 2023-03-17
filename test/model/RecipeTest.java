package model;

import model.Ingredient;
import model.Recipe;
import org.junit.Test;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class RecipeTest {

    private Recipe recipe;

    public void setupStage1(){
        recipe = new  Recipe();
    }

    public void setupStage2(){
        recipe = new Recipe();
        recipe.addIngredient("Cebolla", 315);
        recipe.addIngredient("Ajo", 58);
        recipe.addIngredient("Arroz", 520);
    }

    @Test
    public void addIngredientTest(){
        //Arrange
        setupStage1();
        //Act
        recipe.addIngredient("Sal", 12);
        //Assert
        assertEquals(recipe.getIngredients().size(), 1);
        assertEquals(recipe.getIngredients().get(0).getName(), "Sal");
        assertEquals(recipe.getIngredients().get(0).getWeight(), 12);
    }

    @Test
    public void addFourIngredientsTest(){
        //Arrange
        setupStage2();
        //Act
        recipe.addIngredient("Pimienta", 6);
        //Assert
        assertEquals(recipe.getIngredients().size(), 4);
        assertEquals(recipe.getIngredients().get(3).getName(), "Pimienta");
        assertEquals(recipe.getIngredients().get(3).getWeight(), 6);
    }

    @Test
    public void addDuplicatedIngredientTest(){
        //Arrange
        setupStage2();
        //Act
        recipe.addIngredient("Ajo", 21);
        //Assert
        assertEquals(recipe.getIngredients().size(), 3);
        assertEquals(recipe.getIngredients().get(1).getName(), "Ajo");
        assertEquals(recipe.getIngredients().get(1).getWeight(), 79);
    }

    @Test
    public void removeIngredientTest(){
        //Arrange
        setupStage2();
        //Act
        recipe.removeIngredient("Ajo");
        //Assert
        assertEquals(recipe.getIngredients().size(), 2);
    }

}
