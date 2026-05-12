import java.util.*;

class Largest {
    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a >= b && a >= c) {
            System.out.println("Largest number is: " + a);
        } 
        else if(b >= a && b >= c) {
            System.out.println("Largest number is: " + b);
        } 
        else {
            System.out.println("Largest number is: " + c);
        }
    }
}