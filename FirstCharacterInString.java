import java.util.Scanner;

public class FirstCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("First Character = " + str.charAt(0));
    }
}