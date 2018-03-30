import java.util.HashMap;
import java.util.Map;

/**
 * Created by owner on 20.03.2018.
 * 225. Строка символов представляет собой предложение, написанное на русском языке.
 * Предложение заканчивается точкой. Подсчитать и вывести количество различных букв,
 * которые входят в это предложение. Ответ должен приводиться в грамматически правильной
 * форме, например: а – 25 раз, к – 3 раза и т.д.

 */
public class Ex225 {
    public static void main(String[] args) {
        String str = new String("мой дядя самых честных правил.");
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))){
                Integer tmp = map.get(str.charAt(i));
                tmp++;
                map.put(str.charAt(i),tmp);
            }
            else {
                map.put(str.charAt(i),1);
            }
        }
        for (Map.Entry<Character,Integer> pair:map.entrySet()) {
            System.out.println(pair.getKey()+" - "+ pair.getValue()+" раз");
        }
    }
}
