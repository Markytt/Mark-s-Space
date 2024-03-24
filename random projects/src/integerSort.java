import java.util.Scanner;

public class integerSort {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int one = 0;
        int two = 0;
        int three = 0;
        int max = 0;
        int min = 0;
        int mid = 0;

        System.out.print("Please input int1: ");
        one = input.nextInt();
        System.out.print("Please enter int 2: ");
        two = input.nextInt();
        System.out.print("Please enter int 3: ");
        three = input.nextInt();

        max = one;
        if (two >= max) {
            max = two;
            min = one;
        } else {
            min = two;
        }

        if (three >= max) {
            max = three;
            if (one > two) {
                mid = one;
            } else {
                mid = two;
                min = one;
            }
        } else if (three <= min) {
            mid = min;
            min = three;
        } else {
            mid = three;
        }

        System.out.println(min + " <= " + mid + " <= " + max);

    }
}
