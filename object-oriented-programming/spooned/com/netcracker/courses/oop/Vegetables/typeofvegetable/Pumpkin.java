package com.netcracker.courses.oop.vegetables.typeofvegetable;


public abstract class Pumpkin extends com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable {
    public Pumpkin(java.lang.String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @java.lang.Override
    public com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory() {
        return com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory.PUMPKIN;
    }
}

