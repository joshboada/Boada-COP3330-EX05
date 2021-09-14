/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Josh Boada
 */

import java.util.Scanner;

public class App {
    public static void main (String[]args) {
        Scanner firstnum = new Scanner (System.in);
        System.out.println("What is the first number");
        String numone = firstnum.nextLine();

        Scanner secondnum = new Scanner (System.in);
        System.out.println("What is the second number?");
        String numtwo = secondnum.nextLine();

        double numberone = Double.parseDouble(numone);
        double numbertwo = Double.parseDouble(numtwo);

        double add = numberone + numbertwo;
        double subtract = numberone - numbertwo;
        double multiply = numberone * numbertwo;
        double divide = numberone / numbertwo;

        System.out.println(numone + " + " + numtwo + " = " + add +
                "\n" + numone + " - " + numtwo + " = " + subtract +
                "\n" + numone + " * " + numtwo + " = " + multiply +
                "\n" + numone + " / " + numtwo + " = " + divide);


    }
}
