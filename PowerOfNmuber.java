import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, power = 1;

        System.out.print("Enter base number: ");
        a = sc.nextInt();

        System.out.print("Enter power: ");
        b = sc.nextInt();

        for(int i = 1; i <= b; i++) {
            power = power * a;
        }

        System.out.println("Answer = " + power);
    }
}