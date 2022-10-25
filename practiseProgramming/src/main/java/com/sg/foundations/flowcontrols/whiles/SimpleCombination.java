//combining two arrays
package com.sg.foundations.basics.arrays;
import java.util.Arrays;

public class SimpleCombination {
    public static void main(String [] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};

        int[] wholeNumbers = new int[24];

        //combing the code
        for (int x = 0; x < firstHalf.length; x++) {
            wholeNumbers[x] = firstHalf[x];
        }

        for (int y = 0; y < secondHalf.length; y++) {
            wholeNumbers[y + firstHalf.length] = secondHalf[y];

        }
        Arrays.sort(wholeNumbers);

        for (int num : wholeNumbers) {
            System.out.print(num + "  ");


        }
    }}