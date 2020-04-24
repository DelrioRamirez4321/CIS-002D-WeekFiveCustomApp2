package edu.whccd.dramirez;

import java.util.Scanner;

/*
This application is made to be show the use of exeptions used for integers.
author: Delrio Ramirez
 */


public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter an Integer: ");
            int Number = sc.nextInt();
            System.out.println( Number + " is valid");
        } catch (Exception e) {
            System.out.println("Invalid input!");
            e.printStackTrace();
        }
        finally {
            System.out.println("This finally block would run regardless if there is an exception or not");
        }
    }
}
