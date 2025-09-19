import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        String partyAffiliation;

        // Asks user for party affiliation. checks it, and prints out their animal.
        System.out.println("What is your party affliction?(D, R, or I)");
        partyAffiliation = scan.nextLine();

        // Checks party affiliation, and prints out their assosaited animal.
        if (partyAffiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (partyAffiliation.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("Invalid party affiliation, please try again.");
            System.exit(0);
        }

    }
}
