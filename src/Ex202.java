import java.util.Arrays;

/**
 * Created by owner on 05.03.2018.
 * 202. Дана строка, содержащая текст. Найти длины самого короткого и самого длинного слов.

 */
public class Ex202 {
    public static void main(String[] args) {
        String str = new String("new old banan trap bird three champ krot");
        int min=100, max=0;
        String arrStr[]= str.split(" ");
        System.out.println(Arrays.toString(arrStr));
        for (int i = 0; i < arrStr.length; i++) {
            if (min>arrStr[i].length())min=arrStr[i].length();
            if (max<arrStr[i].length())max=arrStr[i].length();
        }
        System.out.println(max+" "+min);
    }
}
