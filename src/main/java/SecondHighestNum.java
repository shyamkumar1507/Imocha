public class SecondHighestNum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 9, 9};
        System.out.println(secondHighest(nums));
    }

    private static int secondHighest(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > first) {
                second = first;
                first = num;
            }
            if (num > second && num < first) {
                second = num;
            }
            if (num < second) {
                continue;
            }

        }
        return second;
    }
}
