package com.netcracker.courses.oop.vegetables.typeofvegetable;


// луковые (лук репчатый, лук-порей, лук-батун, лук-слизун, лук-шалот, чеснок)
public abstract class Onions extends com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable {
    public Onions(java.lang.String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @java.lang.Override
    public com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory() {
        return com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory.ONION;
    }
}

