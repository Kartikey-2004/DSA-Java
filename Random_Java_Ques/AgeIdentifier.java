
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeIdentifier {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your Birth Date (YYYY-MM-DD) : ");
            String date = sc.nextLine();
            LocalDate DOB = LocalDate.parse(date);
            LocalDate today = LocalDate.now();
            int age = calculateAge(DOB, today);
            System.out.println("Age = " + age);
            if (age <= 0) {
                System.out.println("Not Define");
            } else if (age > 0 && age < 18) {
                System.out.println("Minor");
            } else if (age >= 18 && age < 60) {
                System.out.println("Younger");
            } else {
                System.out.println("Senior");
            }
        }
    }

    private static int calculateAge(LocalDate DOB, LocalDate today) {
        Period period = Period.between(DOB, today);
        return period.getYears();
    }
}
