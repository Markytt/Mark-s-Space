public class FrozenYogurt {
    private String name;
    private double price;
    private String flavor;
    private String topping;

    //Constructor without parameters, initializes all variables with zero or nothing
    public FrozenYogurt() {
        name = "";
        price = 0.0;
        flavor = "";
        topping = "";
    }

    //Constructor with parameters, initializes variables with parameter values
    public FrozenYogurt(String name, double price, String flavor, String topping) {
        this.name = name;
        this.price = price;
        this.flavor = flavor;
        this.topping = topping;
    }

    //Accessor method that returns String name
    public String getName() {
        return name;
    }

    //Mutator method that sets name to a parameter value
    public void setName(String name) {
        this.name = name;
    }


    //Accessor method that returns double price
    public double getPrice() {
        return price;
    }

    //Mutator method that sets price to a parameter value
    public void setPrice(double price) {
        this.price = price;
    }

    //Accessor method that returns String flavor
    public String getYogurtFlavor() {
        return flavor;
    }

    //Mutator method that sets flavor to a parameter value
    public void setYogurtFlavor(String flavor) {
        this.flavor = flavor;
    }

    //Accessor method that returns String topping
    public String getTopping() {
        return topping;
    }

    //Mutator method that sets topping to a parameter value
    public void setTopping(String topping) {
        this.topping = topping;
    }

    //Prints all frozen yogurt order
    public String description() {
        String sum = "";
        sum = "Frozen Yogurt : " + name;
        sum += "\nPrice         : $" + price;
        sum += "\nYogurt        : " + flavor;
        sum += "\nTopping       : " + topping;

        return sum;
    }

    //Sets new values for all of the variables
    public void setChange() {
        name = "Vanilla";
        price = 4.99;
        flavor = "vanilla";
        topping = "Nothing";
    }
}
