
import java.util.Scanner;

public class prime {
    static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number : ");
            int n = sc.nextInt();
            System.out.println("Prime Number : " + isPrime(n));
        }
    }
}
