package week1;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 189. 轮转数组
 * @date 2023/6/25 02:10:41
 */
public class Test1 {
    public static void main(String[] args) {
        new Test1().rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0 , n - 1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums, 0 , k - 1);
        //System.out.println(Arrays.toString(nums));
        reverse(nums, k , n - 1);
        //System.out.println(Arrays.toString(nums));
    }
    private void reverse(int[] nums, int s, int e){
        for (int i = s, j = e; i < j; i++, j--) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
    }
}
