package com.netcracker.courses.oop;

import com.netcracker.courses.oop.Vegetables.onion.Onion;
import com.netcracker.courses.oop.Vegetables.typeofvegetable.Onions;
import com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable;
import com.netcracker.courses.oop.chef.Chef;
import com.netcracker.courses.oop.inputoutput.Input;
import com.netcracker.courses.oop.inputoutput.Output;
import com.netcracker.courses.oop.salad.Salad;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static Salad salad;

    public static void main(String[] args) {

        final int MAX = 6;
        final int MIN = 1;
        boolean flag = true;
        int menuPoint;
        Input input = new Input();
        Output output = new Output();
        Chef chef = new Chef();

        ArrayList<String>  allVegetable = new ArrayList<String>();
        ArrayList<Vegetable> ingredientsList = new ArrayList<Vegetable>();

        allVegetable.add("Лук");
        allVegetable.add("Огурец");
        allVegetable.add("Морковь");
        allVegetable.add("Укроп");
        allVegetable.add("Помидор");
        allVegetable.add("Картошка");


        while (flag){
            output.printMainMenu();
            menuPoint = input.inputInt();

            while (!input.chechRightRange(menuPoint, MIN, MAX)){
                System.out.println("Вы выбрали что-то не то,повторите ввод");
                menuPoint = input.inputInt();
            }

            switch(menuPoint) {
                case 1:
                    output.printAllVegetables(allVegetable);
                    break;
                case 2:
                     ingredientsList = chef.addIngredients(allVegetable);
                     String nameOfSalad = input.inputString();
                    salad = new  Salad(nameOfSalad,ingredientsList);
                    break;
                case 5:
                    flag = false;
                    break;
            }

        }

        ArrayList<Vegetable> list1 = salad.getRecipe();
        System.out.println(list1.get(0));
    }
}