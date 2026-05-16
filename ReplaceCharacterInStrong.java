import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        str = str.replace('a', 'x');

        System.out.println("Updated String = " + str);
    }
}