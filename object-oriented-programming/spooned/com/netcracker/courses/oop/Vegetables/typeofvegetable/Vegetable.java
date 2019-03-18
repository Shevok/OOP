package com.netcracker.courses.oop.Vegetables.typeofvegetable;


public class Vegetable {
    private java.lang.String name;

    private java.lang.String category;

    private int weight;

    private int calories;

    public Vegetable(java.lang.String name, java.lang.String category, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.category = category;
        this.calories = calories;
    }

    public java.lang.String getCategory() {
        return category;
    }

    public void setCategory(java.lang.String category) {
        this.category = category;
    }

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

