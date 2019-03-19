package com.netcracker.courses.oop;


public class Main {
    private static com.netcracker.courses.oop.salad.Salad salad;

    public static void main(java.lang.String[] args) {
        final int MAX = 6;
        final int MIN = 1;
        boolean flag = true;
        int menuPoint;
        com.netcracker.courses.oop.inputoutput.Input input = new com.netcracker.courses.oop.inputoutput.Input();
        com.netcracker.courses.oop.inputoutput.Output output = new com.netcracker.courses.oop.inputoutput.Output();
        com.netcracker.courses.oop.chef.Chef chef = new com.netcracker.courses.oop.chef.Chef();
        java.util.ArrayList<java.lang.String> allVegetable = new java.util.ArrayList<>();
        java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> recipe;
        allVegetable.add("Лук");
        allVegetable.add("Огурец");
        allVegetable.add("Морковь");
        allVegetable.add("Укроп");
        allVegetable.add("Помидор");
        allVegetable.add("Картошка");
        while (flag) {
            output.printMainMenu();
            menuPoint = input.inputInt();
            while (!(input.checkRightRange(menuPoint, MIN, MAX))) {
                java.lang.System.out.println("Вы выбрали что-то не то,повторите ввод");
                menuPoint = input.inputInt();
            } 
            switch (menuPoint) {
                case 1 :
                    output.printAllVegetables(allVegetable);
                    break;
                case 2 :
                    java.lang.System.out.println("Выберите ингридиент для салата");
                    recipe = chef.createRecipe(allVegetable);
                    java.lang.String nameOfSalad = input.inputString();
                    com.netcracker.courses.oop.Main.salad = new com.netcracker.courses.oop.salad.Salad(nameOfSalad, recipe);
                    break;
                case 3 :
                    try {
                        com.netcracker.courses.oop.Main.salad.getRecipe().sort(new com.netcracker.courses.oop.comparator.CaloriesComparator());
                        output.printSaladCondition(com.netcracker.courses.oop.Main.salad.getRecipe());
                    } catch (java.lang.NullPointerException e) {
                        java.lang.System.out.println("Салат еще не создан!");
                    }
                    break;
                case 5 :
                    try {
                        output.printSaladCondition(com.netcracker.courses.oop.Main.salad.getRecipe());
                        java.lang.System.out.println(("Общее количество калорий в салате: " + (com.netcracker.courses.oop.Main.salad.getCalories())));
                    } catch (java.lang.NullPointerException e) {
                        java.lang.System.out.println("Вы еще не создали салат");
                    }
                    break;
                case 6 :
                    flag = false;
                    break;
            }
        } 
    }
}

