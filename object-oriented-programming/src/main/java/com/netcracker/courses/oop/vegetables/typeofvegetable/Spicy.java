package com.netcracker.courses.oop.vegetables.typeofvegetable;

//пряные (укроп, зелень петрушки, сельдерея, пастернака, чабер, эстрагон, базилик, мелисса и др.)
public abstract class Spicy extends Vegetable {
    public Spicy(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    final public VegetableCategory getCategory() {
        return VegetableCategory.SPICY;
    }
}
