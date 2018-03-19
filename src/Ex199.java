/**
 * Created by owner on 05.03.2018.
 * 199. Дана строка, содержащая английский текст. Найти количество слов, начинающихся с буквы b.

 */
public class Ex199 {
    public static void main(String[] args) {
        String str = new String("new old banan trap bird three champ b");
        int counter=0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==' ' && str.charAt(i+1)=='b') counter++;
        }
        System.out.println(counter);
    }
}
