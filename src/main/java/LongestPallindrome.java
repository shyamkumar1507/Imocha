public class LongestPallindrome {

    public static String longestPalindrome(String s) {
        for (int currLength = s.length(); currLength > 0; currLength--) {
            for (int startIdx = 0; startIdx <= s.length() - currLength; startIdx++) {
                int endIdx = startIdx + currLength;
                if (isPalindrome(startIdx, endIdx, s)) {
                    return s.substring(startIdx, endIdx);
                }
            }
        }
        return "";
    }

    private static boolean isPalindrome(int startIdx, int endIdx, String s) {
        int left = startIdx;
        int right = endIdx - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "abaabadcdbd1";
        String palindrome = longestPalindrome(str);
        System.out.println("Longest palindrome string is: " + palindrome);
    }
}

