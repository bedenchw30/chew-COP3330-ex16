import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 beden chew
 */
public class exerciseSixteen {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("What is your age? ");

        int age = input.nextInt();
        if(age >= 16){
            System.out.println("You are old enough to legally drive.");

        }
        else{
            System.out.println("You are not old enough to legally drive");
        }

    }
}
