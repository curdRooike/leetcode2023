package week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2178. 拆分成最多数目的正偶数之和
 * @date 2023/7/6 09:34:56
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().maximumEvenSplit(28));
    }
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> res = new ArrayList<>();
        if (finalSum % 2 != 0)
            return res;
        for (long cur = 2; cur <= finalSum; cur += 2) {
            res.add(cur);
            finalSum -= cur;
        }
       res.set(res.size() - 1, res.get(res.size() - 1) + finalSum);
        return res;
    }
}
