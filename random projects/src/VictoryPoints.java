import java.util.Scanner;

public class VictoryPoints {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int first = 0;
        int second = 0;
        boolean firstStarted = false;
        int player = 0;
        int winner = 0;

        System.out.print("Player1 enter a score: ");
        first = input.nextInt();
        System.out.println("Score is " + first);
        System.out.print("Player2 enter a score: ");
        second = input.nextInt();
        System.out.println("Score is " + second);

        System.out.print("Who moved first (Enter 1 or 2): ");
        player = input.nextInt();

        if(player == 1) {
            firstStarted = true;
            System.out.println("Player1 started.");
        } else {
            System.out.println("Player2 started.");
        }

        if(first > second) {
            winner = 1;
        } else if (second > first) {
            winner = 2;
        } else {
            if (firstStarted) {
                winner = 2;
            } else {
                winner = 1;
            }
        }

        System.out.println("Player1 scored: " + first + " points." + " Player2 scored: " + second + " points.");
        System.out.println("The winner was Player" + winner + "!");


    }
}

