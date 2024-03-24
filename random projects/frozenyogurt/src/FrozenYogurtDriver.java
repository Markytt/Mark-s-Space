import java.util.*;

public class FrozenYogurtDriver {
    //Asks for user to input values to input in Frozen Yogurt variables, then outputs the orders
    public static void main(String[] args) {
        String nouse;
        String name1;
        String name2;
        double price1;
        double price2;
        String topping1;
        String topping2;
        String flavor1;
        String flavor2;
        String option;
        Scanner in = new Scanner(System.in);
        FrozenYogurt order1;
        FrozenYogurt order2;

        System.out.print("Please enter the name of the first frozen yogurt: ");
        name1 = in.nextLine();
        System.out.println("You entered: " + name1);
        System.out.print("Please enter the name of the second frozen yogurt: ");
        name2 = in.nextLine();
        System.out.println("You entered: " + name2);
        System.out.print("Please enter the price for the " + name1 + ": ");
        price1 = in.nextDouble();
        System.out.println("You entered: " + price1);
        System.out.print("Please enter the price for the " + name2 + ": ");
        price2 = in.nextDouble();
        nouse = in.nextLine();
        System.out.println("You entered: " + price2);
        System.out.print("Please enter the base yogurt flavor for " + name1 + ": ");
        flavor1 = in.nextLine();
        System.out.println("You entered: " + flavor1);
        System.out.print("Please enter the base yogurt flavor for " + name2 + ": ");
        flavor2 = in.nextLine();
        System.out.println("You entered: " + flavor2);
        System.out.print("Please enter the topping to add to " + name1 + ": ");
        topping1 = in.nextLine();
        System.out.println("You entered: " + topping1);
        System.out.print("Please enter the topping to add to " + name2 + ": ");
        topping2 = in.nextLine();
        System.out.println("You entered: " + topping2);
        order1 = new FrozenYogurt(name1, price1, flavor1, topping1);
        order2 = new FrozenYogurt(name2, price2, flavor2, topping2);
        System.out.print("Do you want to change your order for the first frozen yogurt? (Y/N) ");
        option = in.nextLine();
        if(option.equals("Y")) {
            order1.setChange();
        }
        System.out.print("Do you want to change your order for the second frozen yogurt? (Y/N) ");
        option = in.nextLine();
        if(option.equals("Y")) {
            order2.setChange();
        }
        System.out.println("Here are your orders");
        System.out.println(order1.description());
        System.out.println("\n" + order2.description());
        System.out.println("\nThank You");

    }
}