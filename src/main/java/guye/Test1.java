package guye;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 台阶
 * @date 2023/7/27 10:30:48
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(step(8));
    }
    public static int step(int n) {
        int[] dp = new int[3];
        dp[0] = 1; // 1阶
        dp[1] = 2; // 2阶
        dp[2] = 4; // 3阶
        if (n < 4) {
            return dp[n - 1];
        }
        for (int i = 0; i < n - 3; ++i) {
            dp[i % 3] = (dp[0] + (dp[1] + dp[2]));

        }
        return dp[(n - 4) % 3];
    }
}
