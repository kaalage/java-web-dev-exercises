package exercises.class1;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is the rectangle length? ");
        double length = input.nextDouble();

        System.out.println("What is the rectangle width? ");
        double width = input.nextDouble();

        double area = length*width;

        System.out.println("The are of the rectangle is " + area);

    }
}
