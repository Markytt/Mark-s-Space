import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[]args) {
        ArrayList<Employee> emp = new ArrayList<Employee>();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our payroll system. We can help you add employess and calculate their salaries.");
        byte option = 0;
        while (option != 4) {
            option = showMenu(input);
            if (option == 1) {
                emp.add(readNewFullTime());
            } else if (option == 2) {
                emp.add(readNewPartTime());
            } else if (option == 3) {
                calcPayroll(emp);
            }else if (option == 4) {
                System.out.println("Thank for using our program. We hope you will use us again.");
                break;
            }
        }
    }


    public void addEmployee(ArrayList<Employee> pArrEmp, Employee pEmp) {
        pArrEmp.add(pEmp);
    }

    public static void calcPayroll (ArrayList<Employee> pArrEmp) {
        double total = 0.0;
        for(int i = 0; i < pArrEmp.size(); i++) {
            for(int j = 0; j < 22; j++) {
                System.out.print("*");
            }
            if(pArrEmp.get(i) instanceof FullTime) {
                System.out.println("\nFull Time Employee");
            } else {
                System.out.println("\nPart Time Employee");
            }
            System.out.println("Employee Name: " + pArrEmp.get(i).getName());
            System.out.print("Has Vehicle: ");
            if(pArrEmp.get(i).getVehicle() != null) {
                System.out.println("Yes");
                System.out.println("Plate Number: " + pArrEmp.get(i).getVehicle().getPlateNumber());
                System.out.println("Color: " + pArrEmp.get(i).getVehicle().getColors());
            } else {
                System.out.println("No");
            }
            System.out.println("Take Home Pay: " + pArrEmp.get(i).calcPay());
            total += pArrEmp.get(i).calcPay();
        }

        for(int i = 0; i < 12; i++) {
            System.out.print("-");
        }
        System.out.println("\nTotal payroll of the company: " + total);
    }

    public static FullTime readNewFullTime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter Name: ");
        String name = input.next();
        String rand = input.nextLine();
        System.out.print("Enter Salary: ");
        double sal = input.nextDouble();
        System.out.print("Enter Bonus: ");
        double bonus = input.nextDouble();
        Vehicle v = getVehicle();
        return new FullTime(id, name, sal, bonus, v);
    }

    public static PartTime readNewPartTime() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = input.nextInt();
        System.out.print("Enter Name: ");
        String name = input.nextLine();
        String rand = input.nextLine();
        System.out.print("Enter Hourly Rate: ");
        double rate = input.nextDouble();
        System.out.print("Enter Number of Hours Worked: ");
        double hours = input.nextDouble();
        Vehicle v = getVehicle();
        return new PartTime(id, name, rate, hours, v);
    }

    public static Vehicle getVehicle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Does this Employee have a vehicle? Y/N : ");
        String choice = input.nextLine();
        if(choice.equals("Y")) {
            System.out.print("Enter plate number: ");
            String num = input.nextLine();
            System.out.print("Enter vehicle colour: ");
            String color = input.nextLine();
            return new Vehicle(num, color);
        }
        return null;
    }

    public static byte showMenu(Scanner input) {
        byte option;
        System.out.print("\n/* ");
        for(int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println("/");
        System.out.println("/* 1. Add FullTime Employee */\"");
        System.out.println("/* 2. Add PartTime Employee */\"");
        System.out.println("/* 3. Calculate Payroll */\"");
        System.out.println("/* 4. Exit */\"");
        System.out.print("/* ");

        for(int i = 0; i < 40; i++) {
            System.out.print("*");
        }

        System.out.println("/");
        System.out.print("Please enter a number between 1 and 4: ");
        option = input.nextByte();

        return option;
    }
}
