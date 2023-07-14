package week3;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 121. 买卖股票的最佳时机
 * @date 2023/7/12 17:30:35
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
    public int maxProfit(int[] prices) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int price : prices) {
            if (price < minprice) {
                minprice = price;
            } else if (price - minprice > maxprofit) {
                maxprofit = price - minprice;
            }
        }
        return maxprofit;
    }
}
