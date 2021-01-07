package cn.zhjynet.lcof.offer03;

import java.util.HashSet;
import java.util.Set;

/**
 * @version: V1.0
 * @author: zhangjy
 * @className: Solution1
 * @packageName: cn.zhjynet.lcof.offer03
 * @description: 数组中重复的数字 Solution1
 * @data: 2021-01-07 10:20
 **/
public class Solution1 {
    /**
     * @title: findRepeatNumber
     * @description: TODO
     * @author: zhangjy
     * @date: 2021/1/7 10:20
     * @param: [nums]
     * @return: int
     */
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
