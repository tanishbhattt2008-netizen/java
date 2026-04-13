import java.util.Scanner;

public class InchToCm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value in inches: ");
        double inches = sc.nextDouble();

        double cm = inches * 2.54;

        System.out.println("Value in centimeters = " + cm);

        sc.close();
    }
}