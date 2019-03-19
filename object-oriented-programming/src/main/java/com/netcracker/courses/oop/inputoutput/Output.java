package com.netcracker.courses.oop.inputoutput;

import com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable;

import java.util.ArrayList;

public class Output {

    public void printMainMenu(){
        System.out.println("Добро пожаловать в режим повара!");
        System.out.println("Вам доступны следующие функции(для взаимодействия выберите число и нажмите enter) : ");
        System.out.println("- 1 - просмотреть список доступных ингридиентов");
        System.out.println("- 2 - приготовить салат");
        System.out.println("- 3 - отсортировать ингридиенты в салате(по калорийности)");
        System.out.println("- 4 - найти ингридиент по имени");
        System.out.println("- 5 - вывести калорийность салата");
        System.out.println("- 6 - выход");

    }

    public void printAllVegetables(ArrayList<Vegetable> list){
        for (Vegetable vegetable : list) {
            System.out.println("- "+list.indexOf(vegetable)+" - "+vegetable.getName()+" Относится к классу "+vegetable.getCategory()+" Количество калорий в 100г: "+ vegetable.getCalories());
        }
    }

    public void printSaladCondition(ArrayList<Vegetable> list){

        System.out.println("Ваш салат состоит из следующих ингридиентов: ");
        for (Vegetable vegetable : list) {
            System.out.println(vegetable.getName()+" Относится к классу "+vegetable.getCategory()+" Количество калорий в 100г: "+ vegetable.getCalories()+" Вес: "+vegetable.getWeight());
        }
    }

    public void printSearchChoice(){
        System.out.println("Вам доступен поиск по одному из следующих параметров овощей : ");
        System.out.println("- 1 - Имя");
        System.out.println("- 2 - Калорийность");
        System.out.println("- 3 - Вес");
        System.out.println("- 4 - Имя + Вес");
        System.out.println("- 5 - Выход");


    }


}
