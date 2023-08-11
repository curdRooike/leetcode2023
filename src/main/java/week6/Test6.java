package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1749. 任意子数组和的绝对值的最大值
 * @date 2023/8/8 20:41:48
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6()
                .maxAbsoluteSum(new int[]{1, -3 , 3}));
    }
    public int maxAbsoluteSum(int[] nums) {
        int s = 0, mx = 0, mn = 0;
        for (int num : nums) {
            s += num;
            if (s > mx) {
                mx = s;
            }else if (s < mn)
                mn = s;
        }
        System.out.println(mn);
        return mx - mn;
    }
}
