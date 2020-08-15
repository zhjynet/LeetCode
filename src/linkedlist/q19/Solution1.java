package linkedlist.q19;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Solution1
 * @Package linkedlist.q19
 * @Description: TODO
 * @date 2020/8/15 15:23
 */
public class Solution1 {
    /**
     * @param head
     * @param n
     * @return linkedlist.q19.ListNode
     * @Title removeNthFromEnd
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/15 15:23
     * @version V1.0.0
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        System.out.println(size);
        int tempNum = size - n;
        temp = head;
        int i = 0;
        while (temp != null) {
            if (tempNum == 0) {
                head = head.next;
                break;
            }
            if (i == tempNum - 1) {
                temp.next = temp.next.next;
                break;
            } else {
                temp = temp.next;
            }
            i++;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
        removeNthFromEnd(head, 1);
    }
}
