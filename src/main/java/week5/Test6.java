package week5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2050. 并行课程 III
 * @date 2023/7/28 00:53:46
 *
 */
public class Test6 {
    public static void main(String[] args) {
        System.out.println(new Test6()
                .minimumTime(3, new int[][]{{1, 3}, {2, 3}}, new int[]{3, 2, 5}));
    }
    public int minimumTime(int n, int[][] relations, int[] time) {
        int mx = 0;
        List<Integer>[] prev = new List[n + 1];
        for (int i = 0; i <= n; i++) {
            prev[i] = new ArrayList<Integer>();
        }
        for (int[] relation : relations) {
            int x = relation[0], y = relation[1];
            prev[y].add(x);
        }
        Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            mx = Math.max(mx, dp(i, time, prev, memo));
        }
        return mx;
    }

    public int dp(int i, int[] time, List<Integer>[] prev, Map<Integer, Integer> memo) {
        if (!memo.containsKey(i)) {
            int cur = 0;
            for (int p : prev[i]) {
                cur = Math.max(cur, dp(p, time, prev, memo));
            }
            cur += time[i - 1];
            memo.put(i, cur);
        }
        return memo.get(i);
    }
}
