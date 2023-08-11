package week6;

import util.ListNode;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 24. 两两交换链表中的节点
 * @date 2023/8/6 17:20:09
 */
public class Test5 {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        ListNode p = new Test5().swapPairs(n1);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode t = res;
        while (t.next != null && t.next.next != null){
            ListNode p1 = t.next;
            ListNode p2 = t.next.next;
            t.next = p2;
            p1.next = p2.next;
            p2.next = p1;
            t = p1;
        }
        return res.next;
    }
}
