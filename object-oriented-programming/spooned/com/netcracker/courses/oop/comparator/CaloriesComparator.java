package com.netcracker.courses.oop.comparator;


public class CaloriesComparator implements java.util.Comparator<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> {
    @java.lang.Override
    public int compare(com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable o1, com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable o2) {
        return (o1.getCalories()) - (o2.getCalories());
    }
}

