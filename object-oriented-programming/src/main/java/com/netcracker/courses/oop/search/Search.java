package com.netcracker.courses.oop.search;

import com.netcracker.courses.oop.inputoutput.Input;
import com.netcracker.courses.oop.inputoutput.Output;
import com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable;

import java.util.ArrayList;

public class Search {

    public ArrayList<Vegetable> startSearch(ArrayList<Vegetable> recipe){
        ArrayList<Vegetable> resultList = new ArrayList<>();
        Input input = new Input();
        Output output = new Output();
        final int MIN = 1;
        final int MAX = 5;

       output.printSearchChoice();
       int menuPoint = input.inputInt();

        while (!input.checkRightRange(menuPoint, MIN, MAX)){
            System.out.println("Вы выбрали что-то не то,повторите ввод");
            menuPoint = input.inputInt();
        }

        switch (menuPoint) {
            case 1:
                System.out.println("Введите имя");
                resultList = nameSearch(recipe,input.inputString());
                break;
            case 2:
                System.out.println("Введите калорийность");
                resultList = caloriesSearch(recipe,input.inputInt());
                break;
            case 3:
                System.out.println("Введите вес");
                resultList = weightSearch(recipe,input.inputInt());
                break;
            case 4:
                System.out.println("Введите имя(затем enter) + вес");
                resultList = weightSearch(nameSearch(recipe,input.inputString()),input.inputInt());
                break;
            case 5:
                break;
        }

        return resultList;
    }

    private ArrayList<Vegetable> nameSearch(ArrayList<Vegetable> recipe,String name){
        ArrayList<Vegetable> resultList = new ArrayList<>();

        for (Vegetable vegetable : recipe) {
            if (vegetable.getName().toUpperCase().equals(name.toUpperCase())){
                resultList.add(vegetable);
            }
        }
        return resultList;
    }

    private ArrayList<Vegetable> caloriesSearch(ArrayList<Vegetable> recipe,int calories){
        ArrayList<Vegetable> resultList = new ArrayList<>();

        for (Vegetable vegetable : recipe) {
            if (vegetable.getCalories() == calories){
                resultList.add(vegetable);
            }
        }
        return resultList;
    }

    private ArrayList<Vegetable> weightSearch(ArrayList<Vegetable> recipe,int weight){
        ArrayList<Vegetable> resultList = new ArrayList<>();

        for (Vegetable vegetable : recipe) {
            if (vegetable.getWeight() == weight){
                resultList.add(vegetable);
            }
        }
        return resultList;
    }

}
