package com.nonfou.algorithm.linkedlist;

/**
 * <html><a href="https://leetcode.cn/problems/design-linked-list/">...</a></html>
 * 设计自己的链表结构
 */
public class MyLinkedList {

    private final ListNode virtualNode;

    public MyLinkedList() {
        virtualNode = new ListNode();
    }

    public int get(int index) {
        if (index >= 0) {
            ListNode cur = virtualNode.next;

            int loop = 0;
            while (cur != null) {
                if (loop == index) {
                    return cur.val;
                } else {
                    loop++;
                    cur = cur.next;
                }
            }
        }

        return -1;
    }

    public void addAtHead(int val) {
        ListNode oldHead = virtualNode.next;

        ListNode newHead = new ListNode(val);

        virtualNode.next = newHead;
        newHead.next = oldHead;
    }

    public void addAtTail(int val) {
        ListNode pre = virtualNode;
        ListNode cur = virtualNode.next;
        while (cur != null) {
            pre = cur;
            cur = cur.next;
        }

        pre.next = new ListNode(val);
    }

    public void addAtIndex(int index, int val) {
        ListNode pre = virtualNode;

        int loop = 0;
        while (pre != null && loop <= index) {
            if (loop == index) {

                ListNode oldNext = pre.next;

                ListNode newNode = new ListNode(val);

                pre.next = newNode;
                newNode.next = oldNext;
            } else {
                pre = pre.next;
            }

            loop++;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode pre = virtualNode;
        ListNode cur = virtualNode.next;

        int loop = 0;
        while (cur != null && loop <= index) {
            if (loop == index) {
                pre.next = cur.next;
            } else {
                pre = cur;
                cur = cur.next;
            }

            loop++;
        }
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }
    }
}
