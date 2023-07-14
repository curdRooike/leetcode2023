package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 122. 买卖股票的最佳时机 II
 * @date 2023/7/12 17:38:42
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3()
                .maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
    public int maxProfit(int[] arr) {
        int ans = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {  // 卖出有利可图
                ans += (arr[i] - arr[i-1]);
            }
        }

        return ans;

    }
}
