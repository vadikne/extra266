/**
 * Created by owner on 19.03.2018.
 * 222. Строка содержит одно слово. Проверить, будет ли оно читаться
 * одинаково справа налево и слева направо (т.е. является ли оно палиндромом).
 */
public class Ex222 {
    public static void main(String[] args) {
        String str = new String("потоп");
        String str2 = new StringBuilder(str).reverse().toString();
        System.out.println(str + " "+ str2);
        if (str.equals(str2)) System.out.println(" да");
        else System.out.println("нет");
    }
}
