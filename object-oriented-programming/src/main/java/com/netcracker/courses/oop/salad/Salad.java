package com.netcracker.courses.oop.salad;

import com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable;

import java.util.ArrayList;


public class Salad {

    private String name;
    private ArrayList<Vegetable> recipe;
    private int calories;

    public Salad() {
    }

    public Salad(String name, ArrayList<Vegetable> recipe) {
        this.name = name;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vegetable> getRecipe() {
        return recipe;
    }

    public void setRecipe(ArrayList<Vegetable> recipe) {
        this.recipe = recipe;
    }

    public int getCalories() {
        int result = 0;
        for (Vegetable vegetable : recipe) {
            result += vegetable.getCalories()*vegetable.getWeight()/100;
        }
        return result;
    }

}
