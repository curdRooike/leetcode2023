package week4;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 860. 柠檬水找零
 * @date 2023/7/22 12:48:21
 */
public class Test7 {
    public static void main(String[] args) {
        System.out.println(new Test7().lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }
    public boolean lemonadeChange(int[] bills) {
        int i = 0,j = 0;
        for (int bill : bills) {
            if (bill == 5){
                i++;
            }else if (bill == 10){
                j++;
                if (i-- < 1)
                    return false;
            }else {
                if (i > 0 && j > 0){
                    i--;
                    j--;
                }else if (i >= 3){
                    i -= 3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
