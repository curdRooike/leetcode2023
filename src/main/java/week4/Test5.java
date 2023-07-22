package week4;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 最大子序和
 * @date 2023/7/20 15:23:56
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5()
                .maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
    public int maxSubArray(int[] nums) {
        int p = 0, sum = nums[0];
        for (int num : nums) {
            p = Math.max(num, p + num);
            sum = Math.max(sum, p);
        }
        return sum;
    }
}
