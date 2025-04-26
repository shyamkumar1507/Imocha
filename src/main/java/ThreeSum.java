import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

       public static List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> intList = new ArrayList<>();
            Arrays.sort(nums);
            for(int i=0; i<nums.length && nums[i] <=0; ++i){
                if(i == 0 || nums[i - 1] != nums[i]) {
                    twoSumsII(nums, i, intList);
                }
            }
            return intList;
        }

        static void twoSumsII(int[] nums, int i, List<List<Integer>> res) {
            int lo = i + 1, hi = nums.length - 1;

            while(lo < hi) {
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum < 0) {
                    ++lo;
                } else if(sum > 0) {
                    --hi;
                } else {
                    res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                    while(lo < hi && nums[lo] == nums[lo - 1]) ++lo;
                }
            }
        }
    }
