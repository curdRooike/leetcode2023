package week6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1431. 拥有最多糖果的孩子
 * @date 2023/8/4 14:21:26
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3()
                .kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            max = Math.max(max, candy);
        }
        ArrayList<Boolean> ams = new ArrayList<>();
        for (int candy : candies) {
            if (candy + extraCandies >= max)
                ams.add(true);
            else
                ams.add(false);
        }
        return ams;
    }
}
