package week7;

import util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 23. 合并 K 个升序链表
 * @date 2023/8/12 20:04:01
 */
public class Test2 {
    /* 分治法
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length);
    }

    // 合并从 lists[i] 到 lists[j-1] 的链表
    private ListNode mergeKLists(ListNode[] lists, int i, int j) {
        int m = j - i;
        if (m == 0) return null; // 注意输入的 lists 可能是空的
        if (m == 1) return lists[i]; // 无需合并，直接返回
        ListNode left = mergeKLists(lists, i, i + m / 2); // 合并左半部分
        ListNode right = mergeKLists(lists, i + m / 2, j); // 合并右半部分
        return mergeTwoLists(left, right); // 最后把左半和右半合并
    }

    // 21. 合并两个有序链表
    private ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(); // 用哨兵节点简化代码逻辑
        ListNode cur = dummy; // cur 指向新链表的末尾
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1; // 把 list1 加到新链表中
                list1 = list1.next;
            } else { // 注：相等的情况加哪个节点都是可以的
                cur.next = list2; // 把 list2 加到新链表中
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2; // 拼接剩余链表
        return dummy.next;
    }*/
    public ListNode mergeKLists(ListNode[] lists) {//最小堆
        PriorityQueue<ListNode> pq = new PriorityQueue<>
                (Comparator.comparingInt(a -> a.val));
        for (ListNode head : lists)
            if (head != null)
                pq.offer(head);
        for (ListNode listNode : pq) {
            System.out.println(listNode.val);
        }
        ListNode dummy = new ListNode(); // 哨兵节点，作为合并后链表头节点的前一个节点
        ListNode cur = dummy;
        while (!pq.isEmpty()) { // 循环直到堆为空
            ListNode node = pq.poll(); // 剩余节点中的最小节点
            if (node.next != null) // 下一个节点不为空
                pq.offer(node.next); // 下一个节点有可能是最小节点，入堆
            cur.next = node; // 合并到新链表中
            cur = cur.next; // 准备合并下一个节点
        }
        System.out.println(pq);
        return dummy.next; // 哨兵节点的下一个节点就是新链表的头节点
    }

}
