package week7;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 80. 删除有序数组中的重复项
 * @date 2023/8/14 16:25:03
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().
                removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
    }
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n){
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
