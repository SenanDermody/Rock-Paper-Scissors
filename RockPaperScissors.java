import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Random random = new Random();
        int r = random.nextInt(3);
        
        Scanner scanner = new Scanner(System.in);

        Barrier(30);
        System.out.println(" ");
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Choose one of the options and see if you can beat the Computer!");
        Barrier(30);
        System.out.println(" ");

        String input = scanner.nextLine().toLowerCase();

        int compCount = 0;
        int youCount = 0;

        while(!input.equals("end"))
        {
            if(!input.equals("end") && !input.equals("rock") && !input.equals("paper") && !input.equals("scissors"))
            {
                System.out.println("Not a valid option, please choose Rock, Paper or Scissors to continue or type end to quit the game");
                input = scanner.nextLine().toLowerCase();
                continue;
            }

            r = random.nextInt(3);
            String Computer = "";

            if(r == 0) Computer = "rock";
            if(r == 1) Computer = "paper";
            if(r == 2) Computer = "scissors";

            if(input.equals(Computer))
            {
                System.out.println(" ");
                Barrier(12);
                System.out.println(" ");
                System.out.println("The computer picked " + Computer);
                System.out.println("It's a tie");
                Barrier(12);
                System.out.println(" ");
            }
            else if(input.equals("rock") && Computer.equals("scissors") || input.equals("paper") && Computer.equals("rock") || input.equals("scissors") && Computer.equals("paper"))
            {
                System.out.println(" ");
                Barrier(20);
                System.out.println(" ");
                System.out.println("The computer picked " + Computer);
                System.out.println("You win!");
                Barrier(20);
                System.out.println(" ");
                youCount++;
            }
            else
            {
                System.out.println(" ");
                Barrier(20);
                System.out.println(" ");
                System.out.println("The computer picked " + Computer);
                System.out.println("You lose");
                Barrier(20);
                System.out.println(" ");
                compCount++;
            }

            input = scanner.nextLine().toLowerCase();
        }

        if(compCount > youCount)
        {
            System.out.println("The computer beat you " + compCount + " to " + youCount);
        }
        else if(compCount == youCount)
        {
            System.out.println("It was a " + compCount + " all draw");
        }
        else
        {
            System.out.println("You beat the computer " + youCount + " to " + compCount);
        }
        System.out.println("Thank you for playing!");
    }
    public static void Barrier(int length)
    {
        for(int i = 0; i < length; i++)
        {
            System.out.print("*");
        }
    }
}