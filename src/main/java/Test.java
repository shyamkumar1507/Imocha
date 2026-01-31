
//Write a program to count the frequency of each letters in "HELLO!! HOW ARE YOU DOING"

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        String str = "HELLO!! HOW ARE YOU DOING";

        char[] cArray = str.toCharArray();
        List<Character> charList = new ArrayList<>();

        for (Character ch: cArray) {
            charList.add(ch);
        }
        Map<Character, Integer> countMap = charList.stream().collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum));
    }
}
