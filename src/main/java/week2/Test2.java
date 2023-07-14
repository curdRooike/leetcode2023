package week2;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2600. K 件物品的最大和
 * @date 2023/7/5 00:11:11
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().kItemsWithMaximumSum(6, 6, 6, 13));
    }
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if (k < numNegOnes)
            return k;
        else {
          if (k <= numOnes + numZeros )
              return numOnes;
          else{
              return numOnes - (k - (numOnes + numZeros));
          }
        }
    }
}
