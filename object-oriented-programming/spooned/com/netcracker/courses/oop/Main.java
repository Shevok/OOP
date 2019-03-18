package com.netcracker.courses.oop;


public class Main {
    public static void main(java.lang.String[] args) {
        boolean flag = true;
        com.netcracker.courses.oop.inputoutput.Input input = new com.netcracker.courses.oop.inputoutput.Input();
        com.netcracker.courses.oop.inputoutput.Output output = new com.netcracker.courses.oop.inputoutput.Output();
        com.netcracker.courses.oop.chef.Chef chef = new com.netcracker.courses.oop.chef.Chef();
        com.netcracker.courses.oop.salad.Salad salad;
        while (flag) {
            output.printMainMenu();
        } 
    }
}

