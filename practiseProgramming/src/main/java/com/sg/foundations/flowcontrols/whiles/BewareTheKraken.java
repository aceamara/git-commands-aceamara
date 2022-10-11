package com.sg.foundations.flowcontrols.whiles;

public class BewareTheKraken{
    public static void main(String[] args) {

        System.out.println("Alrighty, get those flippers and wetsuit on- we're going diving!");
        System.out.println("Here we gooooo....! *SPLASH*");

        int depthDivedInFt = 0;

        while (depthDivedInFt < 36200) {
            System.out.println("So far, we've swum" + depthDivedInFt + " feet");

            if (depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys...");
                System.out.println("TIME TO GO!");
                break;
            }

            if (depthDivedInFt == 1000){
                System.out.println("I see a goldfish!");
            }

            if (depthDivedInFt== 6000){
                System.out.println("* an octopus swims past*");
            }

            if (depthDivedInFt== 14000){
                System.out.println("That shadow looks suspiciously shark shaped...");
            }



            depthDivedInFt += 1000;

        }

        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " eet down.");
        System.out.println("I bet we can do better next time!");
    }
    }


