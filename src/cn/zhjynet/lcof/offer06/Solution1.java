package cn.zhjynet.lcof.offer06;

import java.util.Stack;

/**
 * @version: V1.0
 * @author: zhangjy
 * @className: Solution1
 * @packageName: cn.zhjynet.lcof.offer06
 * @description: 从尾到头打印链表-辅助栈法
 * @data: 2021-01-07 14:26
 **/
public class Solution1 {
    /**
     * @title: reversePrint
     * @description: TODO
     * @author: zhangjy
     * @date: 2021/1/7 14:40
     * @param: [head]
     * @return: int[]
     */
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        int size = stack.size();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = stack.pop().val;
        }
        return result;
    }
}
