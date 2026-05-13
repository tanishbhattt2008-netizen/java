import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str;

        System.out.print("Enter a string: ");
        str = sc.nextLine();

        str = str.replace(" ", "");

        System.out.println("String After Removing Spaces = " + str);
    }
}