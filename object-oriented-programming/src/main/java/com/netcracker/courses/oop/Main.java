package com.netcracker.courses.oop;

import com.netcracker.courses.oop.Vegetables.onion.Onion;
import com.netcracker.courses.oop.Vegetables.typeofvegetable.Onions;
import com.netcracker.courses.oop.Vegetables.typeofvegetable.Vegetable;
import com.netcracker.courses.oop.chef.Chef;
import com.netcracker.courses.oop.comparator.CaloriesComparator;
import com.netcracker.courses.oop.inputoutput.Input;
import com.netcracker.courses.oop.inputoutput.Output;
import com.netcracker.courses.oop.salad.Salad;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

        ArrayList<String>  allVegetable = new ArrayList<>();
        ArrayList<Vegetable> ingredientsList;

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
                    System.out.println("Выберите ингридиент для салата");
                    ingredientsList = chef.createRecipe(allVegetable);
                    String nameOfSalad = input.inputString();
                    salad = new  Salad(nameOfSalad, ingredientsList);
                    break;
                case 3:
                    List<Vegetable> sortedIngredients = salad.getRecipe()
                            .stream()
                            .sorted(new CaloriesComparator())
                            .collect(Collectors.toList());
                    System.out.println();
                    sortedIngredients.forEach(System.out::println);
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