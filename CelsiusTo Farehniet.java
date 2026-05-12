import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float celsius, fahrenheit;

        System.out.print("Enter temperature in Celsius: ");
        celsius = sc.nextFloat();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }
}
}
