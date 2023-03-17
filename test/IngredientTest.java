import exceptions.NegativeWeightException;
import model.Ingredient;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IngredientTest {

    private Ingredient ingredient;

    public void setupStage1(){
        ingredient = new Ingredient("Tomate", 245);
    }

    @Test
    public void addWeightTest(){
        //Arrange
        setupStage1();
        //Act
        ingredient.addWeight(54);
        //Assert
        assertEquals(ingredient.getWeight(), 299);
    }

    @Test
    public void addNegativeWeightTest(){
        //Arrange
        setupStage1();
        //Act y Assert
        assertThrows(NegativeWeightException.class, ()->{
            ingredient.addWeight(-100);
        });
        assertEquals(ingredient.getWeight(), 245);
    }

    @Test
    public void removeWeightTest(){
        //Arrange
        setupStage1();
        //Act
        ingredient.removeWeight(45);
        //Assert
        assertEquals(ingredient.getWeight(), 200);
    }

    @Test
    public void removeNegativeWeightTest(){
        //Arrange
        setupStage1();
        //Act y Assert
        assertThrows(NegativeWeightException.class, ()->{
            ingredient.removeWeight(-100);
        });
        assertEquals(ingredient.getWeight(), 245);
    }


}
