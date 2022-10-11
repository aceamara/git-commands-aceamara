package com.sg.foundations.flowcontro.ifs;

import java.util.Scanner;

public class GuessMe {



    public static void main(String[] args) {
        int storedValue = 66;

        int guessNumber = 0 ;

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please guess a number:");
        guessNumber= Integer.parseInt(myScanner.nextLine());

        if (guessNumber == storedValue) {
            System.out.println("Wow nice guess! That was it!");
        }

        if (guessNumber < storedValue) {
            System.out.println("Your guess: " + guessNumber);
            System.out.println(guessNumber + "? Ha, nice try - I chose "+ storedValue);
        }

        if (guessNumber > storedValue) {
            System.out.println("Your guess: " + guessNumber);
            System.out.println(guessNumber + "? Too bad, way to high. I chose " + storedValue );
        }
    }


}