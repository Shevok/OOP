package com.netcracker.courses.oop.chef;


public class Chef {
    public java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> createRecipe(java.util.ArrayList allVegetable) {
        final int MIN = 0;
        boolean flag = true;
        int max = allVegetable.size();
        int menuPoint;
        com.netcracker.courses.oop.inputoutput.Input input = new com.netcracker.courses.oop.inputoutput.Input();
        com.netcracker.courses.oop.inputoutput.Output output = new com.netcracker.courses.oop.inputoutput.Output();
        java.util.ArrayList<com.netcracker.courses.oop.vegetables.typeofvegetable.Vegetable> recipe = new java.util.ArrayList<>();
        while (flag) {
            output.printAllVegetables(allVegetable);
            java.lang.System.out.println((("- " + (allVegetable.size())) + " - выход"));
            java.lang.System.out.println("Введите число + enter");
            menuPoint = input.inputInt();
            while (!(input.checkRightRange(menuPoint, MIN, max))) {
                java.lang.System.out.println("Вы выбрали что-то не то,повторите ввод");
                menuPoint = input.inputInt();
            } 
            if (menuPoint < (allVegetable.size()))
                java.lang.System.out.println("Сколько грамм добавлять?");

            switch (menuPoint) {
                case 0 :
                    recipe.add(new com.netcracker.courses.oop.vegetables.onion.Onion(input.inputInt()));
                    break;
                case 1 :
                    recipe.add(new com.netcracker.courses.oop.vegetables.pumpkin.Cucumber(input.inputInt()));
                    break;
                case 2 :
                    recipe.add(new com.netcracker.courses.oop.vegetables.roots.Carrot(input.inputInt()));
                    break;
                case 3 :
                    recipe.add(new com.netcracker.courses.oop.vegetables.spicy.Dill(input.inputInt()));
                    break;
                case 4 :
                    recipe.add(new com.netcracker.courses.oop.vegetables.tomatoes.Tomato(input.inputInt()));
                    break;
                case 5 :
                    recipe.add(new com.netcracker.courses.oop.vegetables.tubercrops.Potato(input.inputInt()));
                    break;
                case 6 :
                    flag = false;
                    break;
            }
        } 
        return recipe;
    }
}

