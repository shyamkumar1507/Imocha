import java.util.ArrayList;
import java.util.List;

public class CalculateValidParanthesis {

    //Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
    public static void main(String[] args) {
        int n = 3; // Example input
        generateParenthesis(n);
    }

    public static void generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper(result, "", 0, 0, n);
        System.out.println(result);
    }

    private static void generateParenthesisHelper(List<String> result, String s, int i, int i1, int n) {
        if (i == n && i1 == n) {
            result.add(s);
            return;
        }
        if (i < n) {
            generateParenthesisHelper(result, s + "(", i + 1, i1, n);
        }
        if (i1 < i) {
            generateParenthesisHelper(result, s + ")", i, i1 + 1, n);
        }
    }
}
