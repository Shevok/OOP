package com.netcracker.courses.oop.comparator;


import com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable;

import java.util.Comparator;

public class CaloriesComparator implements Comparator<Vegetable>
{

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return o1.getCalories()-o2.getCalories();
    }
}
