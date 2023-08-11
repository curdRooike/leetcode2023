package week6;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1281. 整数的各位积和之差
 * @date 2023/8/9 10:36:55
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().subtractProductAndSum(234));
    }
    public int subtractProductAndSum(int n) {
        int sum = 0, num = 1;
        while (n > 0) {
            sum += n % 10;
            num *= n % 10;
            n /= 10;
        }
        return sum > num ? sum - num : num - sum;
    }
}
