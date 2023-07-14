package util;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 测试取整
 * @date 2023/7/7 00:00:25
 */
public class MathTest {
    public static void main(String[] args) {
        float i = 4.1f;
       // System.out.println(i);
        float i1 = 4.5f;
        float i2 = 4.8f;
        int i3 = (int) i;
        System.out.println(i3);
        i3 = (int) i1;
        System.out.println(i3);
        i3 = (int) i2;
        System.out.println(i3);
        System.out.println(Math.ceil(11.3));
        System.out.println(Math.floor(11.3));
    }
}
