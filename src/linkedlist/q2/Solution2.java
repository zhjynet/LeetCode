package linkedlist.q2;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Solution2
 * @Package linkedlist.q2
 * @Description: 理解链表新增和预先指针
 * @date 2020/8/14 10:37
 */
public class Solution2 {
    /**
     * @param l1
     * @param l2
     * @return linkedlist.q2.ListNode
     * @Title addTwoNumbers
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/14 10:38
     * @version V1.0.0
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode fir = new ListNode(0);
        ListNode node = fir;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            node.next = new ListNode(sum % 10);
            node = node.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

        }
        if (carry > 0) {
            node.next = new ListNode(carry);
        }
        return fir.next;
    }

//    public static void main(String[] args) {
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = l1;
//        l2.next = new ListNode(1);
//        System.out.println(l1.next);
//        System.out.println(l2.next);
//        l2 = l2.next;
//        System.out.println(l1);
//        System.out.println(l2);
//    }
}
