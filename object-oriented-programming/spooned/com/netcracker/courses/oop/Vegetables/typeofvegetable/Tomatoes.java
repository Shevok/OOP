package com.netcracker.courses.oop.vegetables.typeofvegetable;


public abstract class Tomatoes extends com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable {
    public Tomatoes(java.lang.String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @java.lang.Override
    public final com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory() {
        return com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory.TOMATOES;
    }
}

