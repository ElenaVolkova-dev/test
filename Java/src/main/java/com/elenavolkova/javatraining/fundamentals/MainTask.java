package com.elenavolkova.javatraining.fundamentals;
import java.util.Scanner;

public class MainTask
{
    public static void greeting()
    {


        System.out.println("Please, enter your name: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine())
        {
            System.out.println("Hello, " + scanner.nextLine() + "!");
        }
        scanner.close();

    }

    public static void reverseOrder()
    {

    }




}


