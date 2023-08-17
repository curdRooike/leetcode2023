package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 删除有序数组中的重复项2
 * @date 2023/8/14 17:58:16
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5().
                removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n) {
            if (nums[slow - 2] != nums[fast]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;

    }
}
