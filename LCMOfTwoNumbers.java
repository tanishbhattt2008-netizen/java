import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, max, lcm;

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        max = (a > b) ? a : b;

        while(true) {
            if(max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max++;
        }

        System.out.println("LCM = " + lcm);
    }
}