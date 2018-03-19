import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by owner on 05.03.2018.
 * 200. Дана строка. Подсчитать в ней количество вхождений букв r, k, t.
 */
public class Ex200 {
    public static void main(String[] args) {
        Character [] arr={'r','k','t'};
        String str = new String("new old banan trap bird three champ krot");
        int counter=0;

        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);

            if (Arrays.asList(arr).contains(str.charAt(i)))counter++;
        }
        System.out.println("количество вхождений букв r, k, t:" +counter);

    }
}
