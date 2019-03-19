package com.netcracker.courses.oop.vegetables.typeofvegetable;

public abstract class Tomatoes extends Vegetable {
    public Tomatoes(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    final public VegetableCategory getCategory() {
        return VegetableCategory.TOMATOES;
    }
}
