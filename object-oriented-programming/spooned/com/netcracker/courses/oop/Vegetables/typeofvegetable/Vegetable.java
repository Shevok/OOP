package com.netcracker.courses.oop.vegetables.typeofvegetable;


public abstract class Vegetable {
    private java.lang.String name;

    private int weight;

    private java.lang.Integer calories;

    public Vegetable(java.lang.String name, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public abstract com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory();

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}

