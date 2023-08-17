package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2682. 找出转圈游戏输家
 * @date 2023/8/16 21:20:26
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new Test7().circularGameLosers(5, 2)));
    }
    public int[] circularGameLosers(int n, int k) {
        boolean[] visit = new boolean[n];
        for (int i = k, j = 0; !visit[j]; i += k) {
            visit[j] = true;
            j = (j + i) % n;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                list.add(i + 1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
