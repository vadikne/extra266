import java.util.Arrays;

/**
 * Created by owner on 16.01.2018.
 * 156. Заменить отрицательные элементы линейного массива их модулями,
 * не пользуясь стандартной функцией вычисления модуля.
 * Подсчитать количество произведенных замен.
 */
public class Ex156 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Ex1.fillRandomArray(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i%3==0)arr[i]*=-1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<1)arr[i]*=-1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static int modul(int a){
        return a>0 ? a : -a;
    }
}
