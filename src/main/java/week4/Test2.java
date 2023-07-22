package week4;



/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 415. 字符串相加
 * @date 2023/7/17 00:38:58
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(new Test2().addStrings("11", "123"));
    }
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1 , j = num2.length() - 1, add = 0;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || add > 0){
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;j--;
        }
        return ans.reverse().toString();
    }


}
