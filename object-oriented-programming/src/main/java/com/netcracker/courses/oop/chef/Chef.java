package com.netcracker.courses.oop.chef;

import com.netcracker.courses.oop.salad.Salad;
import com.netcracker.courses.oop.typeofvegetable.Vegetable;

import java.util.ArrayList;

public class Chef {

    public Salad createSalad (String name, ArrayList<Vegetable> recipe){

        return new Salad(name,recipe);
    }
}
