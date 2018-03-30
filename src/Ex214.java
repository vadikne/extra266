/**
 * Created by owner on 19.03.2018.
 * 214. Дана строка. Найти в ней те слова, которые начинаются и оканчиваются одной и той же буквой.
 */
public class Ex214 {
    public static void main(String[] args) {
        String str = new String("мой дядяд самых честных правил когда не в шутку занемог");
        String [] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
           if (arr[i].charAt(0)==arr[i].charAt(arr[i].length()-1)) System.out.println(arr[i]);
        }
    }
}
