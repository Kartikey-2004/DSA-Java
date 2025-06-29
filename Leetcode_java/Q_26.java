
public class Q_26 {

    public int rem_dub(int[] num) {
        int i = 0;
        for (int j = 0; j < num.length; j++) {
            if (num[i] != num[j]) {
                num[++i] = num[j];
            }

        }
        return ++i;
    }
}
