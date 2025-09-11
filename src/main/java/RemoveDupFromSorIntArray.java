public class RemoveDupFromSorIntArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return 1;
        }

        for(int i = 0; i < len-1; i++) {
            for(int j = i+1; j < len; j++) {
                if(nums[i] == nums[j]) {
                    nums[j] = Integer.MAX_VALUE;
                }
            }
        }
        int length = 0;

        return length;
    }

    public static void rotate(int[] nums, int base) {
        for(int j = base; j < nums.length; j++) {
            if(j == nums.length - 1) {
                nums[j] = Integer.MAX_VALUE;
                break;
            }
            nums[j] = nums[j+1];
        }
    }
}
