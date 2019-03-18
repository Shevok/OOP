package com.netcracker.courses.oop.inputoutput;

import java.util.Scanner;

public class Input {


    public  int inputInt() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.print("Incorrect input,try again ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public  String inputString() {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextLine()) {
            System.out.print("Incorrect input,try again ");
            scanner.next();
        }
        return scanner.nextLine();
    }


    public boolean chechRightRange(int temp, int min, int max){
        return (temp >= min && temp < max);
    }
}
