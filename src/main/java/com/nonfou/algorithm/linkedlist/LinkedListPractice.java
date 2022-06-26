package com.nonfou.algorithm.linkedlist;

/**
 * 链表
 */
public class LinkedListPractice {
  public static void main(String[] args) {

  }

  /**
   * <html><a href="https://leetcode.cn/problems/remove-duplicates-from-sorted-list/">...</a></html>
   * 删除 链表的重复元素
   *
   * @param head 头元素
   * @return 链表
   */
  public static ListNode deleteDuplicates(ListNode head) {
    if (head == null) {
      return null;
    }

    // Set<Integer> valSet = new HashSet<>();
    // valSet.add(head.val);

    ListNode pre = head;
    ListNode cur = head.next;


    while (cur != null) {
      int val = cur.val;
      // if (valSet.contains(val)) {
      if (pre.val == val) {
        // 移除
        ListNode second = cur.next;
        pre.next = second;
        cur = second;
      } else {

        // valSet.add(val);
        pre = cur;
        cur = cur.next;
      }
    }

    return head;
  }


  /**
   * <html><a href="https://leetcode.cn/problems/remove-linked-list-elements/">...</a></html>
   * 删除链表中的值
   *
   * @param head 输入链表
   * @param val  要删除的值
   * @return 输出链表
   */
  public static ListNode removeElements(ListNode head, int val) {
    if (head == null) {
      return null;
    }

    // 虚拟节点
    ListNode virtualNode = new ListNode();
    virtualNode.next = head;

    ListNode pre = virtualNode;
    ListNode cur = virtualNode.next;

    while (cur != null) {
      if (cur.val == val) {
        pre.next = cur.next;
      } else {
        pre = cur;
      }

      cur = cur.next;
    }

    return virtualNode.next;
  }

  /**
   * <html><a href="https://leetcode.cn/problems/reverse-linked-list/">...</a></html>
   * 反转链接
   *
   * @param head 输入链表
   * @return 反转后的链表
   */
  public static ListNode reverseList(ListNode head) {
    ListNode loopNode = head;

    ListNode pre = null;
    ListNode cur = loopNode;

    while (loopNode != null) {

      loopNode = cur.next;

      cur.next = pre;
      pre = cur;
      cur = loopNode;
    }

    return pre;
  }

  public static class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
