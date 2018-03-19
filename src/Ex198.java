import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by owner on 05.03.2018.
 * 198. Дана строка, заканчивающаяся точкой. Подсчитать, сколько в ней слов.
 */
public class Ex198 {
    public static void main(String[] args) {
        String str = new String("Мой дядя самых честных правил.");
        System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.split(" ").length);
    }
}
