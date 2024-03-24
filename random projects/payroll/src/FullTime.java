public class FullTime extends Employee{
    private int id;
    private String name;
    private double sal;
    private double hourAndHalf;
    private Vehicle vehicle;

    public FullTime(int id, String name, double sal, double hourAndHalf, Vehicle vehicle) {
        super(id, name, vehicle);
        this.sal = sal;
        this.hourAndHalf = hourAndHalf;
    }

    public double calcPay() {
        return sal + hourAndHalf;
    }

    public double getSalary() {
        return sal;
    }

    public void setSalary(double sal) {
        this.sal = sal;
    }

    public double getOvertime() {
        return hourAndHalf;
    }

    public void setOverTime(double overTime) {
        hourAndHalf = overTime;
    }
}