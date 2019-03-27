package com.netcracker.courses.oop.chef;

import com.netcracker.courses.oop.vegetables.onion.Onion;
import com.netcracker.courses.oop.vegetables.pumpkin.Cucumber;
import com.netcracker.courses.oop.vegetables.roots.Carrot;
import com.netcracker.courses.oop.vegetables.spicy.Dill;
import com.netcracker.courses.oop.vegetables.tomatoes.Tomato;
import com.netcracker.courses.oop.vegetables.tubercrops.Potato;
import com.netcracker.courses.oop.inputoutput.Input;
import com.netcracker.courses.oop.inputoutput.Output;
import com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable;

import java.util.ArrayList;

public class Chef {

    public ArrayList<Vegetable> createRecipe(ArrayList allVegetable){

        final int MIN = 0;
        boolean flag = true;
        int max = allVegetable.size();
        int menuPoint ;
        Input input = new Input();
        Output output = new Output();

        ArrayList<Vegetable> recipe = new ArrayList<>();

        while (flag) {
            output.printAllVegetables(allVegetable);
            System.out.println("- " + allVegetable.size()+" - выход");
            System.out.println("Введите число + enter");
            menuPoint = input.inputInt();

            while (!input.checkRightRange(menuPoint, MIN, max)){
                System.out.println("Вы выбрали что-то не то,повторите ввод");
                menuPoint = input.inputInt();
            }

            if(menuPoint<allVegetable.size()) System.out.println("Сколько грамм добавлять?");

            switch (menuPoint) {
                case 0:
                    recipe.add(new Onion(input.inputInt()));
                    break;
                case 1:
                    recipe.add(new Cucumber(input.inputInt()));
                    break;
                case 2:
                    recipe.add(new Carrot(input.inputInt()));
                    break;
                case 3:
                    recipe.add(new Dill(input.inputInt()));
                    break;
                case 4:
                    recipe.add(new Tomato(input.inputInt()));
                    break;
                case 5:
                    recipe.add(new Potato(input.inputInt()));
                    break;
                case 6:
                    flag = false;
                    break;
            }
        }
        return recipe;
    }

}
