public class MaxArray {
    static int max(int A[]) {
        int temp = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > temp) {
                temp = A[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int A[] = { 1, 12, 4, 21, 3, 4, 23, 2, 12, 3, 21 };
        System.out.println(max(A));
    }
}
