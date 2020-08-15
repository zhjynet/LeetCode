package linkedlist.q2;

import java.math.BigDecimal;

/**
 * @author zhangjingyu
 * @version V1.0
 * @Title: Solution1
 * @Package LinkedList.q2
 * @Description: 暴力解法
 * @date 2020/8/12 22:22
 */
public class Solution1 {
    /**
     * @param l1
     * @param l2
     * @return LinkedList.q2.ListNode
     * @Title addTwoNumbers
     * @Description //TODO
     * @author zhangjingyu
     * @date 00:01 2020/8/13
     * @version V1.0.0
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        BigDecimal a = new BigDecimal(0);
        BigDecimal b = new BigDecimal(0);
        BigDecimal sum = a.add(b);
        BigDecimal c = new BigDecimal(1);
        while (l1 != null) {
            a = a.add(c.multiply(new BigDecimal(l1.val)));
            c = c.multiply(new BigDecimal(10));
            l1 = l1.next;
        }
        c = new BigDecimal(1);
        ;
        while (l2 != null) {
            b = b.add(c.multiply(new BigDecimal(l2.val)));
            c = c.multiply(new BigDecimal(10));
            l2 = l2.next;
        }
        sum = a.add(b);
        ListNode fir = null;
        String sumString = sum + "";
        for (int i = 0; i < sumString.length(); i++) {
            ListNode node = new ListNode(Integer.parseInt(sumString.charAt(i) + ""));
            node.next = fir;
            fir = node;
        }
        return fir;
    }
}
