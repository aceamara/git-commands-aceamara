package org.example;

import java.util.Scanner;

public class windowMaster {

        public static void main(String[] args){
        float height = 0;
        float width = 0;

        String stringHeight= "";
        String stringWidth= "";

        float windowArea= 0;
        float windowCost= 0;
        float windowPerimeter=0;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter the window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Please enter the window width:");
        stringWidth=myScanner.nextLine();

        height = Float.parseFloat(stringHeight);
        width= Float.parseFloat(stringWidth);

        windowArea = height * width;
        windowPerimeter = 2 * (height + width);

        windowCost= (3.50f * windowArea) + (2.25f * windowPerimeter);

        System.out.println("Window height= " + stringHeight);
        System.out.println("Window width =" + stringWidth);
        System.out.println("Window area=" + windowArea);
        System.out.println("Window perimeter=" + windowPerimeter);
        System.out.println("Total cost=" + windowCost);





        }
        }


