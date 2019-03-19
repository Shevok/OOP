package com.netcracker.courses.oop.search;


public class Search {
    public java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> startSearch(java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> recipe) {
        java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> resultList = new java.util.ArrayList<>();
        com.netcracker.courses.oop.inputoutput.Input input = new com.netcracker.courses.oop.inputoutput.Input();
        com.netcracker.courses.oop.inputoutput.Output output = new com.netcracker.courses.oop.inputoutput.Output();
        final int MIN = 1;
        final int MAX = 5;
        output.printSearchChoice();
        int menuPoint = input.inputInt();
        while (!(input.checkRightRange(menuPoint, MIN, MAX))) {
            java.lang.System.out.println("Вы выбрали что-то не то,повторите ввод");
            menuPoint = input.inputInt();
        } 
        switch (menuPoint) {
            case 1 :
                java.lang.System.out.println("Введите имя");
                resultList = nameSearch(recipe, input.inputString());
                break;
            case 2 :
                java.lang.System.out.println("Введите калорийность");
                resultList = caloriesSearch(recipe, input.inputInt());
                break;
            case 3 :
                java.lang.System.out.println("Введите вес");
                resultList = weightSearch(recipe, input.inputInt());
                break;
            case 4 :
                java.lang.System.out.println("Введите имя(затем enter) + вес");
                resultList = weightSearch(nameSearch(recipe, input.inputString()), input.inputInt());
                break;
            case 5 :
                break;
        }
        return resultList;
    }

    private java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> nameSearch(java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> recipe, java.lang.String name) {
        java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> resultList = new java.util.ArrayList<>();
        for (com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable vegetable : recipe) {
            if (vegetable.getName().toUpperCase().equals(name.toUpperCase())) {
                resultList.add(vegetable);
            }
        }
        return resultList;
    }

    private java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> caloriesSearch(java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> recipe, int calories) {
        java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> resultList = new java.util.ArrayList<>();
        for (com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable vegetable : recipe) {
            if ((vegetable.getCalories()) == calories) {
                resultList.add(vegetable);
            }
        }
        return resultList;
    }

    private java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> weightSearch(java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> recipe, int weight) {
        java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> resultList = new java.util.ArrayList<>();
        for (com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable vegetable : recipe) {
            if ((vegetable.getWeight()) == weight) {
                resultList.add(vegetable);
            }
        }
        return resultList;
    }
}

