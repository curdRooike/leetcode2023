package week1;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 2490. 回环句
 * @date 2023/6/30 16:16:56
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(new Test3().isCircularSentence("leetcode exercises sound delightful"));
    }
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n - 1)) {
            return false;
        }
        for (int i = 0; i < n; i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
               return false;
            }
        }
        return true;
    }
}
