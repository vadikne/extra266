/**
 * Created by owner on 19.03.2018.
 * 221. Дана строка из n символов. Преобразовать ее, заменив точками
 * все двоеточия (:), встречающиеся среди первых n/2 символов, и все
 * восклицательные знаки, встречающиеся среди символов, стоящих после n/2 символов.

 */
public class Ex221 {
    public static void main(String[] args) {
        String str = new String("qweq:qwe:Qw!e:qwq!wew:!sd!");
        int n=str.length();
        String str1=str.substring(0,n/2);
        String str2=str.substring(n/2+1);
        str=str1.replaceAll(":",".")+str2.replaceAll("!",".");
        System.out.println(str);
    }
}
