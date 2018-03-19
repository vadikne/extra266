/**
 * Created by owner on 05.03.2018.
 * 205. Дана строка. Преобразовать ее, удалив каждый символ * и повторив каждый символ, отличный от *.
 */
public class Ex205 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("asds*ad*fgt*ththy*qq");
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='*')str.deleteCharAt(i);

        }
        for (int i = 0; i < str.length(); i++) {
            str2.append(str.charAt(i)).append(str.charAt(i));
        }
        System.out.println(str);
        System.out.println(str2);
    }
}
