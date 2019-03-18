package com.netcracker.courses.oop.salad;


public class Salad {
    private java.lang.String name;

    private java.util.ArrayList<com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable> recipe;

    private int calories;

    public Salad(java.lang.String name, java.util.ArrayList<com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable> recipe) {
        this.name = name;
        this.recipe = recipe;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.util.ArrayList<com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable> getRecipe() {
        return recipe;
    }

    public void setRecipe(java.util.ArrayList<com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable> recipe) {
        this.recipe = recipe;
    }

    public int getCalories() {
        int result = 0;
        for (com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable vegetable : recipe) {
            result += ((vegetable.getCalories()) * (vegetable.getWeight())) / 100;
        }
        return result;
    }
}

