
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Rupee");
        System.out.println("2 Euro");
        System.out.println("3 Dollar");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Chose the currency");
            int choice = sc.nextInt();
            System.out.println("Enter the Amount");
            Double amount = sc.nextDouble();
            switch (choice) {
                case 1 ->
                    Rupee_to_other(amount);
                case 2 ->
                    Euro_to_other(amount);
                case 3 ->
                    Dollar_to_other(amount);
                default ->
                    System.out.println("Invalid choice");
            }
        }
    }

    public static void Rupee_to_other(Double amt) {
        System.out.println("1 Rupee = " + 0.0119 + " Dollar");
        System.out.println();

        System.out.println(amt + " Rupee = " + (0.0119 * amt) + " Dollar");
        System.out.println();

        System.out.println("1 Rupee = " + 0.0111 + " Euro");
        System.out.println();

        System.out.println(amt + " Rupee = " + (0.0111 * amt) + " Euro");
        System.out.println();
    }

    public static void Euro_to_other(Double amt) {
        System.out.println("1 Euro = " + 89.9002 + " Rupee");
        System.out.println();

        System.out.println(amt + " Euro = " + (89.9002 * amt) + " Rupee");
        System.out.println();

        System.out.println("1 Euro = " + 1.076 + " Dollar");
        System.out.println();

        System.out.println(amt + " Euro = " + (1.076 * amt) + " Dollar");
        System.out.println();
    }

    public static void Dollar_to_other(Double amt) {
        System.out.println("1 Dollar = " + 83.5187 + " Rupee");
        System.out.println();

        System.out.println(amt + " Dollar = " + (83.5187 * amt) + " Rupee");
        System.out.println();

        System.out.println("1 Dollar = " + 0.929023 + " Euro");
        System.out.println();

        System.out.println(amt + " Dollar = " + (0.929023 * amt) + " Euro");
        System.out.println();
    }
}
