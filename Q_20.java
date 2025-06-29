
import java.util.Stack;

public class Q_20 {

    public boolean isvalid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(')');
            } else if (c == '{') {
                st.push('}');
            } else if (c == '[') {
                st.push(']');
            } else if (st.isEmpty() || st.pop() != c) {
                return false;
            }
        }

        return st.isEmpty();
    }
}
