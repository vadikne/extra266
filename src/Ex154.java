import java.util.Arrays;

/**
 * Created by owner on 15.01.2018.
 * 154. Сформировать массив X(n), n-й член которого определяется формулой  X(n) = 1 / n! .
 */
public class Ex154 {
    public static void main(String[] args) {
        double [] arr = new double[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(double) 1/Ex150.factorial(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}

