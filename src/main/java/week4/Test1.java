package week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 18. 四数之和
 * @date 2023/7/15 20:15:02
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().
                fourSum(new int[]{5,5,3,5,1,-5,1,-2}, 4));
    }
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3; i++) {
            long x = nums[i]; // 使用 long 避免溢出
            if (i > 0 && x == nums[i - 1]) continue;
            if (x + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break; // 优化一
            if (x + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue; // 优化二
            for (int j = i + 1; j < n - 2; j++) { // 枚举第二个数
                long y = nums[j];
                if (j > i + 1 && y == nums[j - 1]) continue;
                if (x + y + nums[j + 1] + nums[j + 2] > target) break; // 优化一
                if (x + y + nums[n - 2] + nums[n - 1] < target) continue; // 优化二
                int k = j + 1, o = n - 1;
                while (k < o){
                    long s = x + y + nums[k] + nums[o];
                    if (s < target)
                        k++;
                    else if (s > target)
                        o--;
                    else{
                        ans.add(List.of((int) x, (int) y, nums[k], nums[o]));
                        for (k++; k < o && nums[k] == nums[k - 1]; k++);
                        for (o--; k < o && nums[o] == nums[o + 1]; o++);
                    }
                }
            }
        }
        return ans;
    }
}
