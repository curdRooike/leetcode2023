package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2544. 交替数字和
 * @date 2023/7/12 12:59:10
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(new Test1().alternateDigitSum(521));
    }
    public int alternateDigitSum(int n) {
        int ans = 0, flag = 1;
        while (n > 0){
            ans += flag * (n % 10);
            flag = -flag;
            n /= 10;
        }
        return ans * -flag;
    }
}
