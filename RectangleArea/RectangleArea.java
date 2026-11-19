import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        System.out.println("Welcome to rectangle area calculator!");

        System.out.println("Enter height:");
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        System.out.println("Enter width");
        int y = input.nextInt();

        int z = x * y;

        System.out.println("Area equals");
        System.out.println(z);
    }
}
