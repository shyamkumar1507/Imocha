import java.util.HashSet;
import java.util.Set;

public class StringManipulation {
/*
        There are two strings A and B of unequal length. Strings should be made same by deleting
        a substring from the larger string.
        Check and return the number of ways to make the strings equal. or print 0 if not possible

       Note:if the string is divided into two parts then the two parts get concatenated eg. after deleting 'xy'
       from 'axyb' the remaining string becomes 'ab'.

       Two ways are considered different if the substrings deleted in them are different
         */


    public static int countWaysToMakeStringsEqual(String A, String B) {
        // Ensure A is the larger string and B is the smaller string
        if (A.length() < B.length()) {
            String temp = A;
            A = B;
            B = temp;
        }

        // If the smaller string is not a substring of the larger string, return 0
        if (!A.contains(B)) {
            return 0;
        }

        Set<String> uniqueWays = new HashSet<>();
        int n = A.length();

        // Iterate through all possible substrings of A
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                // Remove the substring A[i:j] and check if the result equals B
                String modifiedA = A.substring(0, i) + A.substring(j);
                if (modifiedA.equals(B)) {
                    uniqueWays.add(A.substring(i, j)); // Add the deleted substring to the set
                }
            }
        }

        // Return the number of unique ways
        return uniqueWays.size();
    }

    public static void main(String[] args) {
        String A = "abcdabcdabcdabcdabcd";
        String B = "abcdabcd";

        int result = countWaysToMakeStringsEqual(A, B);
        System.out.println("Number of ways to make strings equal: " + result);
    }
}