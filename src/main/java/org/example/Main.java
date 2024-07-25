package org.example;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        greet();
        repeatName();
        guessAge();
    }
    public static void greet() {
        Scanner input = new Scanner(System.in);

        System.out.println("Hello There! What is your name?");
        String fakeName = input.nextLine();
    }
    public static void repeatName() {
        Scanner input = new Scanner(System.in);

        System.out.println("Sorry, I didn't catch that could you retype your name?");
        String name = input.nextLine();
        System.out.println("Thank you, " + name + " sorry about that my cpu capabilities arnt all that great.");
    }
    public static void guessAge() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Would you like me to guess your age? (yes/no)");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            int randInt = rand.nextInt(90);
            System.out.println("My guess is that you are " + randInt + " years old.");
            countTo();
        } else if (answer.equalsIgnoreCase("no")) {
            countTo();
        } else {
            System.out.println("You need to answer yes or no!");
            guessAge();
        }

    }
    public static void countTo() {
        Scanner input = new Scanner(System.in);

        System.out.println("What number would you like to count to?");
        int numTo = input.nextInt();

        for (int i = 0; i <= numTo; i++) {
            System.out.println(i);
        }
        System.out.println("Now I'd like you to answer one of my questions!");
        testQues();

    }
    public static void testQues() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is 1 + 1?");
        System.out.println("a. 1, b. 2, c. 3");
        int answer = input.nextInt();
        if (answer == 2) {
            System.out.println("Correct! Well done.");
            System.out.println("I had fun chatting with you!");
        } else if (answer == 3 || answer == 1) {
            System.out.println("Wrong!");
            testQues();
        } else {
            System.out.println("Enter an available answer choice.");
            testQues();
        }
    }



}