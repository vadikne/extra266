import java.util.HashMap;
import java.util.Map;

/**
 * Created by owner on 19.03.2018.
 * 219. Определить, сколько раз в строке встречается заданное слово.
 */
public class Ex219 {
    public static void main(String[] args) {
        String str = new String("боб год дог тор кот мот дог");
        String str2 = "дог";
        String [] arr = str.split(" ");
        int counter=0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i].equals(str2))counter++;
        }
        System.out.println(str2+" "+counter);
    }
}
