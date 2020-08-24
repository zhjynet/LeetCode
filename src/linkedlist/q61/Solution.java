package linkedlist.q61;


/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Solution
 * @Package linkedlist.q61
 * @Description: TODO
 * @date 2020/8/19 16:03
 */
public class Solution {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        if (head.next == null) return head;
        ListNode first = head;
        int length = 0;
        while (first != null) {
            first = first.next;
            length++;
        }
        first = head;
        int i = k % length;
        while (i != 0) {
            ListNode tempa = new ListNode(0);
            tempa.next = first;
            ListNode tempb = first;
            while (tempb.next != null) {
                tempa = tempa.next;
                tempb = tempb.next;
            }
            tempa.next = tempb.next;
            tempb.next = first;
            first = tempb;
            i--;
        }
        return first;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(2);
        a.next.next = new ListNode(3);
        rotateRight(a, 2);

    }
}
