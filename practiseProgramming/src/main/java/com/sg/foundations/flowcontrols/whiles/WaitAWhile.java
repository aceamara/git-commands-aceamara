package com.sg.foundations.flowcontrols.whiles;

    public class WaitAWhile {
        public static void main(String[] args) {

            int timeNow = 5;
            int bedTime = 10;

            while (timeNow < bedTime) {
                System.out.println("It's only" + timeNow + "o'clock!");
                System.out.println("I think I will stay up just a little longer....");
                timeNow++;
            }

            System.out.println("Oh. It's " + timeNow  + " o'clock.");
            System.out.println("Guess I should go to bed...");
        }
    }
