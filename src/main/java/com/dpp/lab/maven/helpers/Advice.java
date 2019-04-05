package com.dpp.lab.maven.helpers;

import java.util.ArrayList;

public class Advice {

    public Advice() {
    }

    public Advice(boolean vegetarian, String name, Meals mealType, ArrayList<String> ingredients) {
        this.vegetarian = vegetarian;
        this.name = name;
        this.mealType = mealType;
        this.ingredients = ingredients;
    }

    private boolean vegetarian;
    private String name;
    private Meals mealType;
    private ArrayList<String> ingredients;

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Meals getMealType() {
        return mealType;
    }

    public void setMealType(Meals mealType) {
        this.mealType = mealType;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder(name + "\n" + "Meal type:" + mealType.toString() + "\n" + "Is vegetarian: " + Boolean.toString(vegetarian) + "\n" + "ingredients: \n");

        for (String ing:
             ingredients) {
            ret.append(ing).append("\n");
        }

        return ret.toString();
    }
}
