
import java.util.Scanner;

public class ArithmeticOperation {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 ADDITION");
            System.out.println("2 SUBTRACTION");
            System.out.println("3 MULTIPLY");
            System.out.println("4 DIVISION");
            System.out.println("5 REMINDER");
            System.out.println("Chose the Arithmetic Operation number ");
            int choice = sc.nextInt();
            System.out.println("Enter NUMBER A : ");
            int A = sc.nextInt();
            System.out.println("Enter Number B : ");
            int B = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    int ADDITION = A + B;
                    System.out.println(ADDITION);
                }
                case 2 -> {
                    int SUBTRACTION = A - B;
                    System.out.println(SUBTRACTION);
                }
                case 3 -> {
                    int MULTIPLY = A * B;
                    System.out.println(MULTIPLY);
                }
                case 4 -> {
                    int DIVISION = A / B;
                    System.out.println(DIVISION);
                }
                case 5 -> {
                    int MODULUS = A % B;
                    System.out.println(MODULUS);
                }
                default ->
                    System.out.println("ERROR");
            }
        }
    }
}
