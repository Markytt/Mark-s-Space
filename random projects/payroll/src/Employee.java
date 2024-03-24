abstract public class Employee {
    private int EmpId;
    private String Name;
    private Vehicle V;
    private String Plate;
    private String Colour;

    public Employee () {

    }

    public Employee (int pEmpId, String pName, Vehicle pV) {
        EmpId = pEmpId;
        Name = pName;
        V = pV;
    }

    public Employee (int pEmpId, String pName, String pPlate, String pColor) {
        EmpId = pEmpId;
        Name = pName;
        Plate = pPlate;
        Colour = pColor;
    }
    public abstract double calcPay();

    public void setColor(String color) {
        Colour = color;
    }

    public void setPlate(String plate) {
        Plate = plate;
    }

    public void setVehicle(Vehicle v) {
        V = v;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getPlate() {
        return Plate;
    }

    public String getColour() {
        return Colour;
    }

    public Vehicle getVehicle() {
        return V;
    }

    public String getName() {
        return Name;
    }
    public int getEmpId () {
        return EmpId;
    }
}
