package Hash.q1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjingyu
 * @version V1.0
 * @Title: Solution2
 * @Package Hash.q1
 * @Description: 一次 Hash
 * @date 2020/8/12 17:04
 */
public class Solution2 {
    /**
     * @param nums
     * @param target
     * @return int[]
     * @Title twoSum
     * @Description //TODO
     * @author zhangjingyu
     * @date 17:04 2020/8/12
     * @version V1.0.0
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
