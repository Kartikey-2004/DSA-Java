
import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            int rev = 0;
            int m = num;
            int r;
            while (num > 0) {
                r = num % 10;
                rev = rev * 10 + r;
                num /= 10;
            }
            System.out.println("The reverse of the number is " + rev);

            if (rev == m) {
                System.out.println("The Number is palindrome");
            } else {
                System.out.println("The Number is not palindrome");
            }
        }
    }
}
