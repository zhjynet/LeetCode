package Hash.q1;

/**
 * @author zhangjingyu
 * @version V1.0
 * @Title: Solution1
 * @Package Hash.q1
 * @Description: TODO
 * @date 2020/8/12 16:19
 */
public class Solution1 {
    /**
     * @param nums
     * @param target
     * @return int[]
     * @Title twoSum
     * @Description //TODO
     * @author zhangjingyu
     * @date 16:56 2020/8/12
     * @version V1.0.0
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
