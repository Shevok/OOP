package com.netcracker.courses.oop.vegetables.typeofvegetable;


// пряные (укроп, зелень петрушки, сельдерея, пастернака, чабер, эстрагон, базилик, мелисса и др.)
public abstract class Spicy extends com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable {
    public Spicy(java.lang.String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @java.lang.Override
    public final com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory() {
        return com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory.SPICY;
    }
}

