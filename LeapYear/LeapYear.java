import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter number year");

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }
    }
}
