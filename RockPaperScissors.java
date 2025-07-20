import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] choices = {"rock", "paper", "scissors"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🎮 Welcome to Rock, Paper, Scissors!");
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        while (true) {
            System.out.print("\nChoose [rock, paper, scissors] or type 'exit' to quit: ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("exit")) {
                System.out.println("👋 Thanks for playing!");
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("❌ Invalid input. Try again.");
                continue;
            }

            int compIndex = random.nextInt(3);
            String computerMove = choices[compIndex];

            System.out.println(playerName + " chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("⚖ It's a tie!");
            } else if (
                (playerMove.equals("rock") && computerMove.equals("scissors")) ||
                (playerMove.equals("paper") && computerMove.equals("rock")) ||
                (playerMove.equals("scissors") && computerMove.equals("paper"))
            ) {
                System.out.println("🎉 " + playerName + " wins!");
            } else {
                System.out.println("💻 Computer wins!");
            }
        }

        scanner.close();
    }
}


