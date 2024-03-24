public class PartTime extends Employee {
    private int id;
    private String name;
    private double rate;
    private double hoursWorked2;
    private Vehicle v1;


    public PartTime(int id, String name, double rate, double hoursWorked2, Vehicle v1) {
        super(id, name, v1);
        this.rate = rate;
        this.hoursWorked2 = hoursWorked2;
    }

    public double calcPay () {
        return rate * hoursWorked2;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHoursWorked() {
        return hoursWorked2;
    }

    public void setHoursWorked(double hoursWorked2) {
        this.hoursWorked2 = hoursWorked2;
    }
}
