package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 474. 一和零
 * @date 2023/7/26 15:56:42
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().findMaxForm(
                new String[]{"10", "0001", "111001", "1", "0"}, 5, 3));
    }

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int[] zerosOnes = getZerosOnes(str);
            int zeros = zerosOnes[0], ones = zerosOnes[1];
            for (int j = m; j >= zeros; j--) {
                for (int k = n; k >= ones; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - zeros][k - ones] + 1);
                }
            }
        }
        return dp[m][n];
    }

    public int[] getZerosOnes(String str) {
        int[] zerosOnes = new int[2];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            zerosOnes[str.charAt(i) - '0']++;
        }
        return zerosOnes;
    }
}
