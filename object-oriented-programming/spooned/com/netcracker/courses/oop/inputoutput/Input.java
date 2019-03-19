package com.netcracker.courses.oop.inputoutput;


public class Input {
    public int inputInt() {
        java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        while (!(scanner.hasNextInt())) {
            java.lang.System.out.print("Incorrect input,try again ");
            scanner.next();
        } 
        return scanner.nextInt();
    }

    public java.lang.String inputString() {
        java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
        while (!(scanner.hasNextLine())) {
            java.lang.System.out.print("Incorrect input,try again ");
            scanner.next();
        } 
        return scanner.nextLine();
    }

    public boolean checkRightRange(int temp, int min, int max) {
        return (temp >= min) && (temp <= max);
    }
}

