package com.netcracker.courses.oop.vegetables.typeofvegetable;


// корнеплоды (морковь, свекла, редис, репа, редька, брюква, корни петрушки, сельдерея, пастернака)
public abstract class Roots extends com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable {
    public Roots(java.lang.String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @java.lang.Override
    public com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory getCategory() {
        return com.netcracker.courses.oop.vegetables.typeofvegetable.VegetableCategory.ROOTS;
    }
}

