import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner MyScanner = new Scanner(System.in);

        int UserWin= 0;
        int ComputerWin=0;
        int TotalRounds=0;

        System.out.println("How many rounds would you like to play?");
        int rounds = Integer.parseInt(MyScanner.nextLine());


        for (int y = 0; y < rounds; y++) {
            game(MyScanner);

        if (rounds < 11);
        System.out.println("Error: please select another value.");
    }
    }

    static void game(Scanner MyScanner) {
        System.out.println("Please select a move: Rock, paper or scissors");
        String PlayerMove = MyScanner.nextLine();


        Random MyRandom = new Random();
        int RandomNum = MyRandom.nextInt(3);

        String ComputerGuess;
        if (RandomNum == 0) {
            ComputerGuess = "rock";
        } else if (RandomNum == 1) {
            ComputerGuess = "paper";
        } else {
            ComputerGuess = "scissors";
        }
        System.out.println("The computer selected: " + ComputerGuess);

        if (PlayerMove.equals(ComputerGuess)) {
            System.out.println("It's a draw!");
        } else if (PlayerWins(PlayerMove,ComputerGuess)) {
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");


        }
    }

    static boolean PlayerWins(String PlayerMove,String ComputerGuess) {
        if(PlayerMove.equals("Rock")) {
            return ComputerGuess.equals("Scissors");
        }else if (PlayerMove.equals("Paper")) {
            return ComputerGuess.equals("Rock");
        }else{
            return ComputerGuess.equals("Paper");
        }


    }

}
