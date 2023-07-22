package week4;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 874. 模拟行走机器人
 * @date 2023/7/19 09:55:39
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().robotSim(new int[]{4, -1, 3}, new int[][]{}));
    }
    public int robotSim(int[] commands, int[][] obstacles) {
        int[] dirs = {0, 1, 0, -1, 0};
        Set<Integer> s = new HashSet<>(obstacles.length);
        for (var e : obstacles) {
            s.add(f(e[0], e[1]));
        }
        int ans = 0, k = 0;
        int x = 0, y = 0;
        for (int c : commands) {
            if (c == -2) {
                k = (k + 3) % 4;
            } else if (c == -1) {
                k = (k + 1) % 4;
            } else {
                while (c-- > 0){
                    int nx = x + dirs[k], ny = y + dirs[k + 1];
                    if (s.contains(f(nx, ny))) {
                        break;
                    }
                    x = nx;
                    y = ny;
                    ans = Math.max(ans, x * x + y * y);
                }
            }
        }
        return ans;
    }
    private int f(int x, int y) {
        return x * 60010 + y;
    }
}
