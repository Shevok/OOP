package com.netcracker.courses.oop.vegetables.typeofvegetable;


// клубнеплоды (картофель, батат, топинамбур)
public abstract class TuberCrops extends com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable {
    public TuberCrops(java.lang.String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @java.lang.Override
    public final com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory() {
        return com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory.TUBERCROPS;
    }
}

