
import java.util.Scanner;

public class HCF {
    static int GCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of A : ");
            int A = sc.nextInt();
            System.out.print("Enter the value of B : ");
            int B = sc.nextInt();
            System.out.println(GCD(A, B));
        }
    }
}
