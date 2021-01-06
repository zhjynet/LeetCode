package cn.zhjynet.linkedlist.q206;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Solution2
 * @Package cn.zhjynet.linkedlist.q206
 * @Description: TODO
 * @date 2020/8/15 17:55
 */
public class Solution2 {
    /**
     * @param head 头结点
     * @return cn.zhjynet.linkedlist.q206.ListNode
     * @Title reverseList
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/15 18:03
     * @version V1.0.0
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return cur;
    }
}
