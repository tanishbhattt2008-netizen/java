import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str1, str2;

        System.out.print("Enter first string: ");
        str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        str2 = sc.nextLine();

        if(str1.equals(str2)) {
            System.out.println("Strings are Equal");
        }
        else {
            System.out.println("Strings are Not Equal");
        }
    }
}