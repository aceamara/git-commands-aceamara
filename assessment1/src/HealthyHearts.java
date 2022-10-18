import java.util.Scanner;
public class HealthyHearts
{
    public static void main(String []args){
        System.out.println("What is your age?");

        //use scanner.utils to collect user response

        Scanner MyScanner = new Scanner(System.in);
        int UserAge = Integer.parseInt(MyScanner.nextLine());
         System.out.println("You are:" + UserAge);

         //calculate the max and min heart rate
         int TargetHeartRate = (220- UserAge);
         //required to convert float to int value
         int LowerBound= (int)Math.round(TargetHeartRate*.5);
         int UpperBound=(int)Math.round(TargetHeartRate*.85);




         System.out.println("Your maximum heart rate should be " + TargetHeartRate+ " beats per minute");
         System.out.println("Your target HR Zone is " + LowerBound +"-" + UpperBound+ " beats per minute ");



    }


}
