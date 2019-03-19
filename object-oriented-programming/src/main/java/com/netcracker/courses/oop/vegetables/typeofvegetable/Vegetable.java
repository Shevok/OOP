package com.netcracker.courses.oop.vegetables.typeofvegetable;

public abstract class Vegetable  {

    private String name;
    private int weight;
    private Integer calories;

    public Vegetable(String name, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.calories = calories;
    }

    public abstract VegetableCategory getCategory();


    public String getName() {
        return name;
    }

    public void setName(String name) {
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
