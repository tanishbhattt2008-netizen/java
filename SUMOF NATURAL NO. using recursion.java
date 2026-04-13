import java.util.Scanner;
class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = sumOfNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }

    public static int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1; 
        }
        return n + sumOfNaturalNumbers(n - 1); 
    }
}