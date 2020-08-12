package Hash.q387;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjingyu
 * @version V1.0
 * @Title: Solution1
 * @Package Hash.q387
 * @Description: TODO
 * @date 2020/8/12 17:32
 */
public class Solution1 {
    /**
     * @param s
     * @return int
     * @Title firstUniqChar
     * @Description //TODO
     * @author zhangjingyu
     * @date 17:33 2020/8/12
     * @version V1.0.0
     */
    public int firstUniqChar(String s) {
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < length; i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
