package com.netcracker.courses.oop.chef;

import com.netcracker.courses.oop.Vegetables.onion.Onion;
import com.netcracker.courses.oop.Vegetables.pumpkin.Cucumber;
import com.netcracker.courses.oop.Vegetables.roots.Carrot;
import com.netcracker.courses.oop.Vegetables.spicy.Dill;
import com.netcracker.courses.oop.Vegetables.tomatoes.Tomato;
import com.netcracker.courses.oop.Vegetables.tubercrops.Potato;
import com.netcracker.courses.oop.inputoutput.Input;
import com.netcracker.courses.oop.inputoutput.Output;
import com.netcracker.courses.oop.salad.Salad;
import com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable;

import java.util.ArrayList;

public class Chef {

    public ArrayList<Vegetable> addIngredients(ArrayList allVegetable){

        final int MIN = 0;
        boolean flag = true;
        int max = allVegetable.size()+1;
        int menuPoint ;
        Input input = new Input();
        Output output = new Output();

        ArrayList<Vegetable> listWithIngredients = new ArrayList<Vegetable>();

        while (flag) {
            output.printAllVegetables(allVegetable);
            System.out.println("- " + allVegetable.size()+" - выход");
            System.out.println("Введите число + enter");
            menuPoint = input.inputInt();

            while (!input.chechRightRange(menuPoint, MIN, max)){
                System.out.println("Вы выбрали что-то не то,повторите ввод");
                menuPoint = input.inputInt();
            }

            switch (menuPoint) {
                case 0:{
                    System.out.println("Сколько грамм добавлять?");
                    Vegetable vegetable = new Onion(input.inputInt());
                    listWithIngredients.add(vegetable);
                }
                    break;
                case 1:{
                    System.out.println("Сколько грамм добавлять?");
                    Vegetable vegetable = new Cucumber(input.inputInt());
                    listWithIngredients.add(vegetable);
                }
                    break;
                case 2:{
                    System.out.println("Сколько грамм добавлять?");
                    Vegetable vegetable = new Carrot(input.inputInt());
                    listWithIngredients.add(vegetable);
                }
                    break;
                case 3:{
                    System.out.println("Сколько грамм добавлять?");
                    Vegetable vegetable = new Dill(input.inputInt());
                    listWithIngredients.add(vegetable);
                }
                    break;
                case 4:{
                    System.out.println("Сколько грамм добавлять?");
                    Vegetable vegetable = new Tomato(input.inputInt());
                    listWithIngredients.add(vegetable);
                }
                    break;
                case 5:{
                    System.out.println("Сколько грамм добавлять?");
                    Vegetable vegetable = new Potato(input.inputInt());
                    listWithIngredients.add(vegetable);
                }
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
        return listWithIngredients;
    }
}
