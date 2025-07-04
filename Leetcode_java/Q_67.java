
public class Q_67 {

    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c = 0;
        StringBuilder result = new StringBuilder();
        while (i >= 0 || j >= 0 || c > 0) {
            if (i >= 0) {
                c += a.charAt(i--) - '0';
            }
            if (j >= 0) {
                c += b.charAt(j--) - '0';
            }
            result.append(c % 2);
            c /= 2;
        }
        return result.reverse().toString();
    }
}
