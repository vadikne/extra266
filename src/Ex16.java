import java.util.Arrays;

/**
 * 16. В одномерном массиве размещены: в первых элементах значения аргумента,
 * в следующих – соответствующие им значения функции.
 * Напечатать элементы этого массива в n параллельных столбцов (аргумент и значения функции).

 */
public class Ex16 {
    public static void main(String[] args) {
        int [] arr= new int[19];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i+1<arr.length;i=i+2){
            System.out.println(arr[i]+" - "+arr[i+1]);
        }
    }
}
