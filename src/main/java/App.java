import assessment.basicProgrammingConcepts.RockPaperScissors;
import com.sg.foundations.exercises.Factorizer;
import com.sg.foundations.exercises.InterestCalculator;
import com.sg.foundations.exercises.LuckySevens;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        boolean isRunning = false;

        while(!isRunning) {
            System.out.println("What would you like to do? ");
            System.out.println("1. Play Rock Paper Scissors");
            System.out.println("2. Play Factorizer");
            System.out.println("3. Play Lucky Sevens");
            System.out.println("4. Use Interest Calculator");
            System.out.println("5. Cancel");

            Scanner myScanner = new Scanner(System.in);
            String input = myScanner.nextLine();
            if(input.equalsIgnoreCase("1") || input.equalsIgnoreCase("Play Rock Paper Scissors")) {
                RockPaperScissors gameOfRPS = new RockPaperScissors();
                gameOfRPS.playRockPaperScissors();
                isRunning = true;
            } else if (input.equalsIgnoreCase("2") || input.equalsIgnoreCase("Play Factorizer")) {
                Factorizer factorizer = new Factorizer();
                factorizer.playFactorizer();
                isRunning = true;
            } else if (input.equalsIgnoreCase("3") || input.equalsIgnoreCase("Play Lucky Sevens")) {
                LuckySevens luckySevens = new LuckySevens();
                luckySevens.playLuckySevens();
                isRunning = true;
            } else if (input.equalsIgnoreCase("4") || input.equalsIgnoreCase("Play Interest Calculator")) {
                InterestCalculator interestCalculator = new InterestCalculator();
                interestCalculator.playInterestCalculator();
                isRunning = true;
            } else if (input.equalsIgnoreCase("5") || input.equalsIgnoreCase("Cancel")) {
                isRunning = true;
                break;
            } else {
                System.out.println("Invalid input, please try again.");
            }
        }
    }
}
