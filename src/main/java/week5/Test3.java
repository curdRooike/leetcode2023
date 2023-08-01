package week5;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2208. 将数组和减半的最少操作次数
 * @date 2023/7/25 16:28:15
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3()
                .halveArray(new int[]{5, 19, 8, 1}));
    }
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>
                (Comparator.reverseOrder());
        int res = 0;
        double sum = 0;
        for (int num : nums) {
            pq.offer((double) num);
            sum += num;
        }
        double sum2 = 0.0;
        while (sum2 < sum / 2){
            Double x = pq.poll();
            sum2 += x / 2;
            pq.offer(x / 2);
            res++;
        }
        return res;
    }
}
