package week5;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 771. 宝石与石头
 * @date 2023/7/24 11:37:40
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2()
                .numJewelsInStones("aA", "aAAbbbb"));
    }
    public int numJewelsInStones(String jewels, String stones) {
        // 把 jewels 转换成字符集合 mask
        long mask = 0;
        for (char c : jewels.toCharArray())
            mask |= 1L << (c & 63);
        // 统计有多少 stones[i] 在集合 mask 中
        int ans = 0;
        for (char c : stones.toCharArray())
            ans += mask >> (c & 63) & 1;
        return ans;
    }
}
