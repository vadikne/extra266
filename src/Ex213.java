/**
 * Created by owner on 19.03.2018.
 * 213. Дана строка. Указать те слова, которые содержат хотя бы одну букву k.
 */
public class Ex213 {
    public static void main(String[] args) {
        String str = new String("мой дядя самых честных правил когда не в шутку занемог");
        String [] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf('к')>=0) System.out.println(arr[i]);
        }
    }
}
