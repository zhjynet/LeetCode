package cn.zhjynet.lcof.offer03;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhangjingyu
 * @version V1.0
 * @Title: Solution1
 * @Package cn.zhjynet.lcof.offer03
 * @Description: //TODO
 * @date 2021/1/6 19:12
 */
public class Solution1 {
    /**
     * @return int
     * @Author zhangjingyu
     * @Description //TODO
     * @Date 20:45 2021/1/6
     * @Param [nums]
     **/
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
