package com.netcracker.courses.oop.vegetables.typeofvegetable;

// клубнеплоды (картофель, батат, топинамбур)
public abstract class TuberCrops extends Vegetable{
    public TuberCrops(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    final public VegetableCategory getCategory() {
        return VegetableCategory.TUBERCROPS;
    }
}
