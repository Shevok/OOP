package com.netcracker.courses.oop.vegetables.typeofvegetable;

//корнеплоды (морковь, свекла, редис, репа, редька, брюква, корни петрушки, сельдерея, пастернака)

public abstract class Roots extends Vegetable{
    public Roots(String name, int weight, int calories) {
        super(name, weight, calories);
    }

    @Override
    public VegetableCategory getCategory() {
        return VegetableCategory.ROOTS;
    }
}
