import java.util.Scanner;

public class LastCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        System.out.println("Last Character = " + str.charAt(str.length() - 1));
    }
}