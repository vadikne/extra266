/**
 * Created by owner on 19.03.2018.
 * 212. Дан набор слов, разделенных точкой с запятой (;).
 * Набор заканчивается двоеточием (:). Определить, сколько в нем слов, заканчивающихся буквой а.

 *
 */
public class Ex212 {
    public static void main(String[] args) {
        String str = new String("мой дядя самых честных правил когда не в шутку занемог:");
        str = str.replace(" ",";");
        String [] arr = str.split(";");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(arr[i].length()-1)=='а') System.out.println(arr[i]);
        }
    }
}
