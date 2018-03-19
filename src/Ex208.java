import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by owner on 17.03.2018.
 * 208. Дана строка. Подсчитать, сколько различных символов встречаются в ней. Вывести их на экран.
 */
public class Ex208 {
    public static void main(String[] args) {
        Map map= new HashMap<Character,Integer>();
        String str = new String("мой дядя самых честных правил.");
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                Integer tmp = (Integer) map.get(str.charAt(i));
                tmp++;
                map.put(str.charAt(i),tmp);
            }
            else map.put(str.charAt(i),1);
        }
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry entry : set){
            System.out.println(entry.getKey() + " количество: " + entry.getValue());
        }

    }
}
