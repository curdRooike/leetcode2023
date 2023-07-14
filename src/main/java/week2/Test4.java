package week2;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 167. 两数之和 II - 输入有序数组
 * @date 2023/7/8 12:01:34
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Test4()
                .twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j){
            int nums = numbers[i] + numbers[j];
            if (nums == target)
                return new int[]{i + 1, j + 1};
            else if (nums > target)
                j--;
            else i++;
        }
        return new int[]{-1, -1};
    }
}
