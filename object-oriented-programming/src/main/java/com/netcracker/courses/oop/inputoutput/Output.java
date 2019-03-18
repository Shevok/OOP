package com.netcracker.courses.oop.inputoutput;

import java.util.ArrayList;

public class Output {

    public void printMainMenu(){
        System.out.println("Добро пожаловать в режим повара!");
        System.out.println("Вам доступны следующие функции(для взаимодействия выберите число и нажмите enter) : ");
        System.out.println("- 1 - просмотреть список доступных ингридиентов");
        System.out.println("- 2 - приготовить салат");
        System.out.println("- 3 - отсортировать ингридиенты в салате(по калорийности)");
        System.out.println("- 4 - найти ингридиент по имени");
        System.out.println("- 5 - выход");

    }

    public void printAllVegetables(ArrayList allVegetables){
        System.out.println("Вам доступны следующие овощи для приготовления салата");
       for(int i = 0; i < allVegetables.size(); i++){
           System.out.println("- " + i + " - " + allVegetables.get(i));
       }
    }


}
