/*
 * Greets user's and asks them for inputs into a FrozenYogurt object, then prints a description of that variable
 * and bids the user farewell
 * @author  Mark Wang
 * @version 1.0
 */
import java.util.*;

public class FrozenYogurtDriverWithMixIn {
    /*
     * Asks for user inputs into FrozenYogurt object, then prints the objects description
     * @param   args    takes in commands from the command line
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FrozenYogurt yog = new FrozenYogurt();
        String input = "";
        String yesno = "";
        String irr = "";
        double price = 0.0;
        System.out.println("Welcome to the Frozen Yogurt (with mix-ins) Selector\n");

        System.out.print("Would you like to add a frozen yogurt (yes/no)? ");
        yesno = in.nextLine();
        returnIn(yesno);
        while(!(yesno.equals("yes") || yesno.equals("no"))) {
            System.out.println("Sorry, \""+ yesno + "\" is neither yes nor no");
            System.out.print("Would you like to add a frozen yogurt (yes/no)? ");
            yesno = in.nextLine();
        }

        if(yesno.equals("yes")) {
            System.out.print("Please enter the name of the frozen yogurt: ");
            input = in.nextLine();
            returnIn(input);
            yog.setName(input);

            System.out.print("Please enter the price for the " + yog.getName() + ": ");
            price = in.nextDouble();
            returnIn("" + price);


            while (!yog.setPrice(price).equals("")) {
                System.out.println(yog.setPrice(price));
                System.out.print("Please enter the price for the " + yog.getName() + ": ");
                price = in.nextDouble();
                returnIn("" + price);
            }

            irr = in.nextLine();
            System.out.print("Please enter the base yogurt flavor for " + yog.getName() + ": ");
            input = in.nextLine();
            returnIn(input);

            while (!yog.setYogurtFlavor(input).equals("")) {
                System.out.println(yog.setYogurtFlavor(input));
                System.out.print("Please enter the base yogurt flavor for " + yog.getName() + ": ");
                input = in.nextLine();
                returnIn(input);
            }

            System.out.print("Please enter the topping to add to " + yog.getName() + ": ");
            input = in.nextLine();
            returnIn(input);
            yog.addTopping(input);

            do {
                System.out.print("Would you like to add another topping frozen yogurt(yes/no) ? ");
                yesno = in.nextLine();
                while (!(yesno.equals("yes") || yesno.equals("no"))) {
                    System.out.println("Sorry, \"" + yesno + "\" is neither yes nor no");
                    System.out.print("Would you like to add another topping frozen yogurt(yes/no)? ");
                    yesno = in.nextLine();
                }
                if(yesno.equals("yes")) {
                    System.out.print("Please enter the additional topping to add to " + yog.getName() + ": ");
                    input = in.nextLine();
                    returnIn(input);
                    yog.addTopping(input);
                }
            } while(yesno.equals("yes"));

            yog.description();

            System.out.println("\nThank you!");
        }

    }

    /*
     * Prints out a message back to the user with their input
     * @param   input   the input the user entered into a scanner
     */
    public static void returnIn(String input) {
        System.out.println("You entered: " + input);
    }


}