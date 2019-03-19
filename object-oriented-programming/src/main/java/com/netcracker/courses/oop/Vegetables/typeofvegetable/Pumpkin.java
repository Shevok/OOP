package com.netcracker.courses.oop.Vegetables.typeofvegetable;

public abstract class Pumpkin extends Vegetable {
    public Pumpkin(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    public VegetableCategory getCategory() {
        return VegetableCategory.PUMPKIN;
    }
}
