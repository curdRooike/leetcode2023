package week1;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2485. 找出中枢整数
 * @date 2023/6/26 01:28:40
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().pivotInteger(8));
    }
    public int pivotInteger(int n) {
        int res = -1;
        for (int i = 1; i <= n; i++) {
            /*System.out.println((i * (i + 1)) / 2);
            System.out.println(((n - i + 1) * (n + i)) / 2);*/
            if ((i * (i + 1)) / 2 == ((n - i + 1) * (n + i)) / 2) {
                return i;
            }
        }
        return res;
    }
}
