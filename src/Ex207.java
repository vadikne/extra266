/**
 * Created by owner on 17.03.2018.
 * 207. Дана строка. Подсчитать количество букв k в последнем ее слове.
 */
public class Ex207 {
    public static void main(String[] args) {
        String str = new String("мой дядя самых честных пкравилк.");
        String arr [] = str.split(" ");
        byte count=0;
        for (int i = 0; i < arr[arr.length-1].length(); i++) {
            if (arr[arr.length-1].charAt(i)=='k')count++;
        }
        System.out.println(count);
    }
}
