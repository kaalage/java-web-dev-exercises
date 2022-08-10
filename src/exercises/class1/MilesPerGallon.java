package exercises.class1;
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        double miles = input.nextDouble();

        System.out.println("How much gas have you consumed? ");
        double gas = input.nextDouble();

        double consumed = miles*gas;

        System.out.println("Your miles-per-gallon is " + consumed);

    }



}
