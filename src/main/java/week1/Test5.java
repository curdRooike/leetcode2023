package week1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1253. 重构 2 行二进制矩阵
 * @date 2023/7/1 16:19:02
 */
public class Test5 {
    public static void main(String[] args) {
        System.out.println(new Test5()
                .reconstructMatrix(2, 1, new int[]{1, 1, 1}));
    }
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int n = colsum.length;
        List<Integer> first = new ArrayList<>();
        List<Integer> second = new ArrayList<>();
        for (int j : colsum) {
            int a = 0, b = 0;
            if (j == 2) {
                upper--;
                lower--;
                a = b = 1;
            } else if (j == 1) {
                if (upper > lower) {
                    upper--;
                    a = 1;
                } else {
                    lower--;
                    b = 1;
                }
            }
            if (upper < 0 || lower < 0)
                return List.of();
            first.add(a);
            second.add(b);
        }
        return upper == 0 && lower == 0 ? List.of(first, second) : List.of();
    }
}
