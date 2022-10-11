
import jdk.jshell.SourceCodeAnalysis;
//importing required packages
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args){
        //creating variables to be assigned
        String DogName= "";
        int percentage1= 0;
        int percentage2= 0;
        int percentage3=0;
        int percentage4=0;
        int percentage5=0;

        //requesting user input
        System.out.print("What is your dog's name?");
        Scanner scanner = new Scanner(System.in);
         DogName= scanner.nextLine();
         System.out.println(DogName);
         System.out.print("Well then I have this highly reliable report on " + DogName + "'s prestigious background right here.");

         Random breed = new Random();
//do-while loop
         do{
             percentage1=breed.nextInt(100)+1;
             percentage2=breed.nextInt(100-percentage1)+1;
             percentage3=breed.nextInt(100-(percentage1+percentage2))+1;
             percentage4=breed.nextInt(100-(percentage1+percentage2+percentage3))+1;
             percentage5=breed.nextInt(100-(percentage1+percentage2+percentage3+percentage4))+1;

         } while (percentage1==10 && percentage2==0 &&percentage3==0&&percentage4==0&&percentage5==0);
//printing results

         System.out.println('\n'+ DogName+  " is..");
         System.out.println(percentage1 + " % " + "St. Bernard");
         System.out.println(percentage2 + " % " + "Chihuahua");
         System.out.println(percentage3+ " % "+ "Dramatic RedNosed Asian Pug");
         System.out.println(percentage4+ " % "+ "Common Cur");
         System.out.println(percentage5+" % "+"King Doberman");

         System.out.print("Wow, that's QUITE the dog!");
         }





    }

