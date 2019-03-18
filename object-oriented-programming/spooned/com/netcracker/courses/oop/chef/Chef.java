package com.netcracker.courses.oop.chef;


public class Chef {
    public com.netcracker.courses.oop.salad.Salad createSalad(java.lang.String name, java.util.ArrayList<com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable> recipe) {
        return new com.netcracker.courses.oop.salad.Salad(name, recipe);
    }
}

