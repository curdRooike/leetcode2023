package guye;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1、2、3台阶题
 * @date 2023/7/28 16:27:35
 */
public class Staircase {

    static List<List<Integer>> result = new ArrayList<>();
    static List<Integer> path = new ArrayList<>();

    public static void main(String[] args) {
        int n = 7;
        backtrack(n, 0);
        System.out.println(n + "级台阶的走法有：" + result.size() + "种走法 分别是");
        result.forEach(steps -> {
            AtomicInteger i = new AtomicInteger(); //原子操作
            StringBuilder sb = new StringBuilder();
            steps.forEach(step -> {
                sb.append(step);
                if (i.incrementAndGet() < steps.size())
                    sb.append(" -> ");
            });
            System.out.println(sb.toString());
        });
    }

    private static void backtrack(int n, int sum) {
        if (sum == n) {
            result.add(new ArrayList<>(path));
            return;
        }
        if (sum > n) {
            return;
        }

        for (int i = 1; i <= 3; i++) {
            if (sum >= 6 && i == 1) {
                continue; // 如果前三步加起来>=6阶则下一步可以后退1阶
            }
            path.add(i);
            backtrack(n, sum + i);
            path.remove(path.size() - 1);
        }
    }
}
