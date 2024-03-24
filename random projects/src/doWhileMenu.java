import java.util.Scanner;

public class doWhileMenu {
    public static void main (String[]args) {
        String option = "";
        Scanner input = new Scanner (System.in);
        do {
            System.out.println("Welcom to Dave's Burgers. What food do you want to order? ");
            System.out.println("1. Cheeseburger");
            System.out.println("2. Chickenburger");
            System.out.println("3. French Fries");
            System.out.println("X. Quit");
            System.out.print("Enter your order: ");
            option = input.nextLine();

            switch(option) {
                case "1":
                    System.out.println("You ordered a cheeseburger\n");
                    break;

                case "2":
                    System.out.println("You ordered a chickenburger\n");
                    break;

                case "3":
                    System.out.println("You ordered french fries\n");
                    break;

                case "X":
                    System.out.println("Thank you for coming to Dave's Burgers. We hope to see you again!");
                    break;
            }

        }

        while(!option.equals("X"));
    }
}
