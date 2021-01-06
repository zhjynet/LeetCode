package cn.zhjynet.linkedlist.q206;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Solution1
 * @Package cn.zhjynet.linkedlist.q206
 * @Description: 双指针迭代
 * @date 2020/8/15 17:06
 */
public class Solution1 {
    /**
     * @param head 传入节点
     * @return cn.zhjynet.linkedlist.q206.ListNode
     * @Title reverseList
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/15 17:06
     * @version V1.0.0
     */
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode first = head;
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
