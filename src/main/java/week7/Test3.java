package week7;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 88. 合并两个有序数组
 * @date 2023/8/13 00:43:17
 */
public class Test3 {
    public static void main(String[] args) {
        new Test3().merge(new int[]{1,2,3,0,0,0},3,new int[]{2,5,6},3);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n > 0) System.arraycopy(nums2, 0, nums1, m, n);
        System.out.println(Arrays.toString(nums1));
        Arrays.sort(nums1);
    }
}
