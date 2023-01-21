import java.util.Random;
import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] moves = {"rock", "paper", "scissors"};
            String pcMove = moves[new Random().nextInt(moves.length)];
            String playerMove;

            while (true) {
                System.out.println("Please enter your move:");
                playerMove = scanner.nextLine();
                if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                    break;
                }
                System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "This is not a valid move!" + ConsoleColors.RESET);
                System.out.println("Choose between: rock, paper or scissors!");
            }

            System.out.println("Computer played: " + ConsoleColors.WHITE_BOLD_BRIGHT + pcMove + ConsoleColors.RESET);

            if (playerMove.equals(pcMove)) {
                System.out.println(ConsoleColors.YELLOW_BOLD_BRIGHT + "The game was a tie!" + ConsoleColors.RESET);
                System.out.println("-----------------------------------");
            } else if (playerMove.equals("rock")) {
                if (pcMove.equals("paper")) {
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "You lose!" + ConsoleColors.RESET);
                    System.out.println("-----------------------------------");
                } else {
                    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "You win!" + ConsoleColors.RESET);
                    System.out.println("-----------------------------------");

                }
            } else if (playerMove.equals("paper")) {
                if (pcMove.equals("rock")) {
                    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "You win!" + ConsoleColors.RESET);
                    System.out.println("-----------------------------------");
                } else {
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "You lose!" + ConsoleColors.RESET);
                    System.out.println("-----------------------------------");

                }
            } else {
                if (pcMove.equals("rock")) {
                    System.out.println(ConsoleColors.RED_BOLD_BRIGHT + "You lose!" + ConsoleColors.RESET);
                    System.out.println("-----------------------------------");
                } else {
                    System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT + "You win!" + ConsoleColors.RESET);
                    System.out.println("-----------------------------------");

                }
            }
            System.out.println("Play again?");
            String answer = scanner.nextLine();
            System.out.println();

            if (answer.equals("no")) {
                break;
            }
        }
    }
}