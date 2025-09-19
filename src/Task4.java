import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        int age;
        int MIN_AGE = 21;

        //Asks user for their age.
        System.out.println("How old are you?(Please enter a whole number.)");

        //Chacks age and gives out wristbands to those over 21.
        if (scan.hasNextInt()) {
            age = scan.nextInt();

            if (age >= MIN_AGE) {
                System.out.println("You get a paper wristband.");
            }

        } else {
            System.out.println("Invalid age, please try again.");
            System.exit(0);
        }

    }
}
