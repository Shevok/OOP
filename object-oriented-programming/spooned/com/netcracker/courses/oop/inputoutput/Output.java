package com.netcracker.courses.oop.inputoutput;


public class Output {
    public void printMainMenu() {
        java.lang.System.out.println("Добро пожаловать в режим повара!");
        java.lang.System.out.println("Вам доступны следующие функции(для взаимодействия выберите число и нажмите enter) : ");
        java.lang.System.out.println("- 1 - просмотреть список доступных ингридиентов");
        java.lang.System.out.println("- 2 - приготовить салат");
        java.lang.System.out.println("- 3 - отсортировать ингридиенты в салате(по калорийности)");
        java.lang.System.out.println("- 4 - найти ингридиент по имени");
        java.lang.System.out.println("- 5 - вывести калорийность салата");
        java.lang.System.out.println("- 6 - выход");
    }

    public void printAllVegetables(java.util.ArrayList allVegetables) {
        for (int i = 0; i < (allVegetables.size()); i++) {
            java.lang.System.out.println(((("- " + i) + " - ") + (allVegetables.get(i))));
        }
    }

    public void printSaladCondition(java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> list) {
        java.lang.System.out.println("Ваш салат состоит из следующих ингридиентов: ");
        for (com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable vegetable : list) {
            java.lang.System.out.println((((((((vegetable.getName()) + " Относится к классу ") + (vegetable.getCategory())) + " Количество калорий в 100г: ") + (vegetable.getCalories())) + " Вес: ") + (vegetable.getWeight())));
        }
    }
}

