package week2;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 16. 最接近的三数之和
 * @date 2023/7/10 02:08:06
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6()
                .threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, ans = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 2; i++) {
            int x = nums[i];
            if (i > 0 && x == nums[i - 1]) continue;
            int s = x + nums[i + 1] + nums[i + 2];
            if (s > target){
                if (s - target < min) {
                    ans = s;
                }
                break;
            }
            s = x + nums[n - 2] + nums[n - 1];
            if (s < target){
                if (target - s < min){
                    min = target - s;
                    ans = s;
                }
                continue;
            }
            // 双指针
            int j = i + 1, k = n - 1;
            while (j < k){
                s = x + nums[j] + nums[k];
                if (s == target)
                    return target;
                if (s > target){
                    if (s - target < min) {
                        min = s - target;
                        ans = s;
                    }
                    k--;
                }else {
                    if (target - s < min) {
                        min = target - s;
                        ans = s;
                    }
                    j++;
                }
            }
        }
        return ans;
    }
}
