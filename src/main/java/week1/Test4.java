package week1;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 1186. 删除一次得到子数组最大和
 * @date 2023/7/1 01:05:39
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(new Test4().maximumSum(new int[]{1, -2}));
    }
    public int maximumSum(int[] arr) {
        int dp0 = arr[0], dp1 = 0, res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            dp1 = Math.max(dp0, dp1 + arr[i]);
            System.out.println("dp 1: "+dp1);
            dp0 = Math.max(dp0, 0) + arr[i];
            System.out.println("dp 0: "+dp0);
            res = Math.max(res, Math.max(dp0, dp1));
        }
        return res;
    }
}
