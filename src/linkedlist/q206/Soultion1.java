package linkedlist.q206;

/**
 * @author zhangjingyu
 * @version V1.0.0
 * @Title: Soultion1
 * @Package linkedlist.q206
 * @Description: 双指针迭代
 * @date 2020/8/15 17:06
 */
public class Soultion1 {
    /**
     * @param head
     * @return linkedlist.q206.ListNode
     * @Title reverseList
     * @Description //TODO
     * @author zhangjingyu
     * @date 2020/8/15 17:06
     * @version V1.0.0
     */
    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode first = head;
        ListNode temp = null;
        while (first != null) {
            temp = first.next;
            first.next = result;
            result = first;
            first = temp;
        }
        return result;
    }
}
