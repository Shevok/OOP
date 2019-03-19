package com.netcracker.courses.oop;

import com.netcracker.courses.oop.search.Search;
import com.netcracker.courses.oop.vegetables.onion.Onion;
import com.netcracker.courses.oop.vegetables.pumpkin.Cucumber;
import com.netcracker.courses.oop.vegetables.roots.Carrot;
import com.netcracker.courses.oop.vegetables.spicy.Dill;
import com.netcracker.courses.oop.vegetables.tomatoes.Tomato;
import com.netcracker.courses.oop.vegetables.tubercrops.Potato;
import com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable;
import com.netcracker.courses.oop.chef.Chef;
import com.netcracker.courses.oop.comparator.CaloriesComparator;
import com.netcracker.courses.oop.inputoutput.Input;
import com.netcracker.courses.oop.inputoutput.Output;
import com.netcracker.courses.oop.salad.Salad;

import java.util.ArrayList;

public class Main {

    private static Salad salad;

    public static void main(String[] args) {

        final int MAX = 6;
        final int MIN = 1;
        boolean flag = true;
        int menuPoint;
        Input input = new Input();
        Output output = new Output();
        Chef chef = new Chef();
        Search search = new Search();

        ArrayList<Vegetable>  allVegetable = new ArrayList<Vegetable>();
        ArrayList<Vegetable> recipe;
        ArrayList<Vegetable> resultSearch;

        allVegetable.add(new Onion(0));
        allVegetable.add(new Cucumber(0));
        allVegetable.add(new Carrot(0));
        allVegetable.add(new Dill(0));
        allVegetable.add(new Tomato(0));
        allVegetable.add(new Potato(0));


        while (flag){
            output.printMainMenu();
            menuPoint = input.inputInt();

            while (!input.checkRightRange(menuPoint, MIN, MAX)){
                System.out.println("Вы выбрали что-то не то,повторите ввод");
                menuPoint = input.inputInt();
            }

            switch(menuPoint) {
                case 1:
                    output.printAllVegetables(allVegetable);
                    break;
                case 2:
                    System.out.println("Выберите ингридиент для салата");
                    recipe = chef.createRecipe(allVegetable);
                    String nameOfSalad = input.inputString();
                    salad = new  Salad(nameOfSalad, recipe);
                    break;
                case 3:
                    try {
                        salad.getRecipe().sort(new CaloriesComparator());
                        output.printSaladCondition(salad.getRecipe());
                    }catch (NullPointerException e){
                        System.out.println("Салат еще не создан!");
                    }
                    break;

                case 4:
                    try {
                        resultSearch = search.startSearch(salad.getRecipe());
                        if(resultSearch.size() > 0){
                            output.printAllVegetables(resultSearch);
                        }else {
                            System.out.println("Ничего не найдено!");
                        }
                    }catch (NullPointerException e){
                        System.out.println("Салат еще не создан!");
                    }
                    break;
                case 5:
                    try {
                        output.printSaladCondition(salad.getRecipe());
                        System.out.println("Общее количество калорий в салате: " + salad.getCalories());
                    }catch (NullPointerException e){
                        System.out.println("Вы еще не создали салат");
                    }
                    break;

                case 6:
                    flag = false;
                    break;
            }

        }

    }
}