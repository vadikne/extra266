/**
 * Created by owner on 05.03.2018.
 * 204. Дана строка, содержащая текст, заканчивающийся точкой. \
 * Вывести на экран слова, содержащие три буквы.
 */
public class Ex204 {
    public static void main(String[] args) {
        String str = new String("мой дядя самых честных правил.");
        String arr [] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()==3 && arr[arr.length-1]!=".") System.out.println(arr[i]);
        }

    }
}
