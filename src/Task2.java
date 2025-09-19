import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        int birthMonth;

        //Asks user for birth month. checks number, and prints it out.
        System.out.println("What is your birth month? (1-12, not the name of month)");

        //Checks birth month, and prints birth month out.
        if (scan.hasNextInt()) {
            birthMonth = scan.nextInt();
            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("your birth month is " + birthMonth);
            } else {
                System.out.println("Invalid birth month, please try again.");
                System.exit(0);
            }
        } else {
            System.out.println("Invalid birth month, please try again.");
            System.exit(0);
        }

    }
}
