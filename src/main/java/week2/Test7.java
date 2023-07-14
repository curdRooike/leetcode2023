package week2;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1911. 最大子序列交替和
 * @date 2023/7/11 00:28:24
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7()
                .maxAlternatingSum(new int[]{5,6,7,8}));
    }
    public long maxAlternatingSum(int[] nums) {
        long ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ret += Math.max(0, nums[i] - nums[i - 1]);
            System.out.println(ret);
        }
        return ret;
    }
}
