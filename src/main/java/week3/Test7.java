package week3;


import util.TreeNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 979. 在二叉树中分配硬币
 * @date 2023/7/14 18:52:18
 */
public class Test7 {
    int ans = 0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return ans;
    }
    private int dfs(TreeNode node) {
        if (node == null)
            return 0;
        int d = dfs(node.left) + dfs(node.right) + node.val - 1;
        ans += Math.abs(d);
        return d;
    }

}
