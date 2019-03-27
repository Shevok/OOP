package com.netcracker.courses.oop.vegetables.typeofvegetable;

//луковые (лук репчатый, лук-порей, лук-батун, лук-слизун, лук-шалот, чеснок)

public abstract class Onions extends Vegetable {
    public Onions(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    public VegetableCategory getCategory() {
        return VegetableCategory.ONION;
    }
}
