package com.netcracker.courses.oop.typeofvegetable;

public class Vegetable {

    private String name;
    private String category;
    private int weight;
    private int calories;

    public Vegetable(String name,String category, int weight, int calories) {
        this.name = name;
        this.weight = weight;
        this.category = category;
        this.calories = calories;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

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
