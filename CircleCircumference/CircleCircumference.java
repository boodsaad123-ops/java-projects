import java.util.Scanner;

public class CircleCircumference {
    public static void main(String[] args) {
        System.out.println("Welcome to circle circumference calculator!");

        System.out.println("Enter radius:");
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();

        double circumference = 2 * 3.14 * r;

        System.out.println("equals");
        System.out.println(circumference);
    }
}
