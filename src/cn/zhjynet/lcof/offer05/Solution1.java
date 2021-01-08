package cn.zhjynet.lcof.offer05;

/**
 * @version: V1.0
 * @author: zhangjy
 * @className: Solution1
 * @packageName: cn.zhjynet.lcof.offer05
 * @description: 替换空格
 * @data: 2021-01-07 13:55
 **/
public class Solution1 {
    /**
     * @title: replaceSpace
     * @description: TODO
     * @author: zhangjy
     * @date: 2021/1/7 13:56
     * @param: [s]
     * @return: java.lang.String
     */
    public String replaceSpace(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isSpaceChar(c)) {
                result.append("%20");
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
