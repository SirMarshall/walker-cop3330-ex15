/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carter I. Walker
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        //Necessary Variables
        Scanner input = new Scanner(System.in);
        String username, password;

        //Username and Password query
        System.out.println("Enter username:");
        username = input.nextLine();

        System.out.println("Enter password:");
        password = input.nextLine();

        //Password comparison
        if (password.equals("please"))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
