
import java.util.Arrays;

public class Q_14 {

    public String commom_fx(String[] strs) {
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] second = strs[strs.length - 1].toCharArray();
        StringBuilder x = new StringBuilder();
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]) {
                x.append(first[i]);
            } else {
                break;
            }
        }
        return x.toString();
    }
}
