package week7;

import java.util.Arrays;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 833. 字符串中的查找与替换
 * @date 2023/8/15 16:52:23
 */
public class Test6 {
    public static void main(String[] args) {

        System.out.println(new Test6().findReplaceString("abcd", new int[]{0,2}
        , new String[]{"a","cd"},new String[]{"eee","ffff"}));
    }
    public String findReplaceString(String s, int[] indices,
                                    String[] sources, String[] targets) {
        int n = s.length();
        var replaceStr = new String[n]; // 替换后的字符串
        var replaceLen = new int[n];    // 被替换的长度
        Arrays.fill(replaceLen, 1);     // 无需替换时 i+=1
        for (int i = 0; i < indices.length; i++) {
            int idx = indices[i];
            if (s.startsWith(sources[i], idx)) {
                replaceStr[idx] = targets[i];
                replaceLen[idx] = sources[i].length();
            }
        }
        System.out.println(Arrays.toString(replaceStr));
        System.out.println(Arrays.toString(replaceLen));
        var ans = new StringBuilder();
        for (int i = 0; i < n; i += replaceLen[i]) { // 无需替换时 i+=1
            if (replaceStr[i] == null) {
                ans.append(s.charAt(i));
            } else {
                ans.append(replaceStr[i]);
            }
        }
        return ans.toString();
    }
}
