package week5;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 279. 完全平方数
 * @date 2023/8/1 02:15:44
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().numSquares(12));
    }
    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i - j * j]);
            }
            f[i] = minn + 1;
        }
        System.out.println(Arrays.toString(f));
        return f[n];

    }
}
