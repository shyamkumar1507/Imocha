import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombOfPhoneNum {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public static List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        Map<String, Character[]> map = new HashMap<>();
        map.put("2", new Character[]{'a', 'b', 'c'});
        map.put("3", new Character[]{'d', 'e', 'f'});
        map.put("4", new Character[]{'g', 'h', 'i'});
        map.put("5", new Character[]{'j', 'k', 'l'});
        map.put("6", new Character[]{'m', 'n', 'o'});
        map.put("7", new Character[]{'p', 'q', 'r', 's'});
        map.put("8", new Character[]{'t', 'u', 'v'});
        map.put("9", new Character[]{'w', 'x', 'y', 'z'});

        List<String> result = new ArrayList<>();
        char[] ch = digits.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            Character[] curChar = map.get(String.valueOf(ch[i]));
            Character[] nextChar = map.get(String.valueOf(ch[i+1]));
            for (Character c : curChar) {
                for (Character n : nextChar) {
                    result.add(c + "" + n);
                }
            }
        }
        return result;
    }


}
