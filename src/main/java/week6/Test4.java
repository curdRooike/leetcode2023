package week6;

import util.ListNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 21. 合并两个有序链表
 * @date 2023/8/5 13:16:51
 */
public class Test4 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(-1);

        ListNode ans = node;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val){
                node.next = l1;
                l1 = l1.next;
            }else {
                node.next = l2;
                l2 = l2.next;
            }
            node = node.next;
        }
        node.next = l1 != null ? l1 : l2;
        return ans.next;
    }
}
