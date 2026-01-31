import java.util.ArrayList;
import java.util.List;

public class StringInSequence {

    public static void main(String[] args) {
        String s = "abcdefgh";

        List<String> list = new ArrayList<>();
        list.add("abcd");
        list.add("efgh");
        list.add("deab");
        list.add("ghab");
        list.add("abgh");
        list.add("habc");

        isStringInSequence(s, list);
    }

    public static void isStringInSequence(String s, List<String> list) {
        for (String str : list) {
            String input = s+s;
            if (!input.contains(str)) {
                System.out.println(str + ": Is not in sequence");
                continue;
            }
            System.out.println(str + ": Is a sequence");
        }
    }
}
