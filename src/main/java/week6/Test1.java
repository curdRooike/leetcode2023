package week6;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 822. 翻转卡片游戏
 * @date 2023/8/2 00:35:22
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().flipgame
                (new int[]{0, 2, 4, 4, 7}, new int[]{1, 3, 4, 1, 3}));
    }
    public int flipgame(int[] fronts, int[] backs) {
        Set<Integer> same = new HashSet();
        for (int i = 0; i < fronts.length; ++i) {
            if (fronts[i] == backs[i]) {
                same.add(fronts[i]);
            }
        }
        System.out.println(same);
        int res = 3000;
        for (int x : fronts) {
            if (x < res && !same.contains(x)){
                res = x;
            }
        }
        System.out.println(res);
        for (int x : backs) {
            if (x < res && !same.contains(x)) {
                res = x;
            }
        }
        return res % 3000;
    }
}
