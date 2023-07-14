package util;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 树
 * @date 2023/7/14 18:52:58
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;



    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}