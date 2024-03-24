public class Vehicle {
    private String color = "";
    private String plateNumber = "";

    public Vehicle() {
    }

    public Vehicle(String plateNum, String colour) {
        plateNumber = plateNum;
        color = colour;
    }

    public void setColor(String colour) {
        color = colour;
    }

    public void setPlateNumber(String plateNum) {
        plateNumber = plateNum;
    }

    public String getColors() {
        return color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}
