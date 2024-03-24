/* Creates a Frozen Yogurt class that stores multiple variables and some methods
 * @author  Mark Wang
 * @version 1.0
 */
public class FrozenYogurt {
    private String name;
    private double price;
    private String flavor;
    private StringBuilder topping;

    /*
     * Default constructor for FrozenYogurt
     * @param   nothing
     */
    public FrozenYogurt() {
        name    = "";
        price   = 0.00;
        flavor  = "";
        topping = new StringBuilder("");
    }

    /*
     * Parameterized constructor
     * @param   name    name of FrozenYogurt
     * @param   price   cost of FrozenYogurt
     * @param   flavor  Base flavor of FrozenYogurt
     * @param   topping One of the toppings of FrozenYogurt
     */
    public FrozenYogurt(String name, double price, String flavor, String topping) {
        this.name    = "";
        this.price   = price;
        this.flavor  = "";
        this.topping = new StringBuilder(topping);
    }


    /*
     * Adds string values to the topping variable and increases price by $ .49 for each additional topping
     * @param   topping a string value denoting one topping on a frozen yogurt
     */
    public void addTopping(String topping) {
        if(!(this.topping.toString().equals(""))) {
            this.topping.append(", " + topping);
            price += .49;
        } else {
            this.topping = new StringBuilder(topping);
        }
    }

    /*
     * Returns all the string values in topping separated with commas
     * @param   nothing
     * @return  returns the topping as a a string
     */
    public String getTopping() {
        return topping.toString();
    }

    /*
     * Sets the value of String variable flavor, denies any inputs that are not chocolate or vanilla
     * @param   flavor  the base flavor of the yogurt
     * @return  either an invalid input message, or an empty string
     */
    public String setYogurtFlavor(String flavor) {
        if(!(flavor.equals("chocolate")||flavor.equals("vanilla"))) {
            return "ALERT: " + flavor + " is not one of the valid yogurt flavors (chocolate or vanilla)!";
        }
        this.flavor = flavor;
        return "";
    }

    /*
     * Returns the base flavor of YogurtFlavor
     * @param   nothing
     * @return  the value of flavor
     */
    public String getYogurtFlavor() {
        return flavor;
    }

    /*
     * Sets the price of FrozenYogurt, and denies values less than 0 or greater than or equal to 100
     * @param   price   the value we want to set to price
     * @return  either alerts for entering invalid input, or an empty string
     */
    public String setPrice(double price) {
        if(price < 0) {
            return "ALERT: Unable to set " + name + "'s price to " + price + " (negative values are not allowed)";
        }
        if(price >= 100) {
            return "ALERT: Unable to set " + name + "'s price to " + price + " (value is too high (>=100.00))";
        }

        this.price = price;
        return "";
    }

    /*
     * returns the price variable
     * @param   nothing
     * @return the value of price
     */
    public double getPrice() {
        return price;
    }

    /*
     * Changes the name of frozen yogurt to what is input
     * @param   name    the desired string value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /*
     * Gets the current value of name variable
     * @param   nothing
     * @return  the value of name
     */
    public String getName() {
        return name;
    }

    /*
     * prints out a description of FrozenYogurt including all of its variables
     * @param   nothing
     */
    public void description() {
        System.out.println("\nFrozen Yogurt : " + this.getName());
        System.out.println("Price         : " + this.getPrice());
        System.out.println("Yogurt        : " + this.getYogurtFlavor());
        System.out.println("Topping(s)    : " + this.getTopping());
    }
}
