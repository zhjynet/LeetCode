package cn.zhjynet.lcof.offer04;

/**
 * @version: V1.0
 * @author: zhangjy
 * @className: Solution1
 * @packageName: cn.zhjynet.lcof.offer04
 * @description: 二维数组中的查找 Solution1
 * @data: 2021-01-07 10:16
 **/
public class Solution1 {
    /**
     * @title: findNumberIn2DArray
     * @description: 从二维数组的右上方（或左下方）走，保证左小右大（或左大右小）
     * @author: zhangjy
     * @date: 2021/1/7 10:18
     * @param: [matrix, target]
     * @return: boolean
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i = 0;
        int j = columns - 1;
        while (i < rows && j >= 0) {
            int num = matrix[i][j];
            if (num == target) {
                return true;
            } else if (num > target) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
