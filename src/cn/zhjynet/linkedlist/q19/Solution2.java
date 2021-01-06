package cn.zhjynet.linkedlist.q19;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Solution2
 * @Package cn.zhjynet.linkedlist.q19
 * @Description: TODO
 * @date 2020/8/15 16:19
 */
public class Solution2 {
    /**
     * @param head
     * @param n
     * @return cn.zhjynet.linkedlist.q19.ListNode
     * @Title removeNthFromEnd
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/15 16:19
     * @version V1.0.0
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = head;
        int length = 0;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        while (length > 0){
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;

    }
}
