package util;



import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author 古丶野
 * @version 1.0
 * @project leetcode2023
 * @description 函数式编程
 * @date 2023/7/17 15:03:31
 */
public class ConsumerTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("sun", "hao");
        forEach(list, System.out::println);
    }
    public static void forEach(List<String> list, Consumer<String> consumer){
        for (String s : list) {
            consumer.accept(s);
        }
    }


}
