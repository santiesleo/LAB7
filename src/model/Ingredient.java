package model;

import exceptions.NegativeWeightException;

public class Ingredient {
    String name;
    double weight;

    public Ingredient(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void addWeight(double weight2Add){
        if(weight2Add < 0){
            throw new NegativeWeightException();
        }
        weight += weight2Add;
    }

    public void removeWeight(double weight2Remove) throws NegativeWeightException{
        if(weight2Remove < 0){
            throw new NegativeWeightException();
        }
        weight -= weight2Remove;
    }
}
