import java.util.Arrays;

/**
 * Created by owner on 16.01.2018.
 * 158. Дан массив A(n) (n – четное). Сформировать массив B(m), элементами
 * которого являются средние арифметические соседних пар рядом стоящих в массиве A чисел.
 * Например, массив A состоит из элементов 1, 3, 5, -2, 0, 4, 0, 3.
 * Элементами массива B будут 2; 1,5; 2; 1,5 .
 */
public class Ex158 {
    public static void main(String[] args) {
        int [] arr=new int[10];
        double [] brr= new double[arr.length/2];
        Ex1.fillRandomArray(arr);
        for (int i = 0; i < arr.length; i+=2) {
            brr[i/2]=average(arr[i],arr[i+1]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    }
    public static double average(int a,int b){
        return (a+b)/2;
    }
}
