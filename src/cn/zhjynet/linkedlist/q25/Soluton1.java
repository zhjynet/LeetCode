package cn.zhjynet.linkedlist.q25;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Soluton1
 * @Package cn.zhjynet.linkedlist.q25
 * @Description: TODO
 * @date 2020/8/17 09:59
 */
public class Soluton1 {
    /**
     * @param head 传入头结点
     * @param k    正整数
     * @return cn.zhjynet.linkedlist.q25.ListNode
     * @Title reverseKGroup
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/17 10:00
     * @version V1.0.0
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;

        while (end.next != null) {
            for (int i = 0; i < k & end != null; i++){
                end = end.next;
            }
            if (end == null){
                break;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            pre.next = reverse(start);
            start.next = next;
            pre = start;
            end = pre;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode first = head;
        ListNode result = null;
        ListNode temp;
        while (first != null) {
            temp = first.next;
            first.next = result;
            result = first;
            first = temp;
        }
        return result;
    }
}
