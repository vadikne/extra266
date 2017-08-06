import java.util.Arrays;

/**
 * 35. Дан целочисленный массив с количеством элементов n.
 * "Сожмите" массив, выбросив из него каждый второй элемент
 * (дополнительный массив при этом не использовать).

 */
public class Ex35 {
    public static void main(String[] args) {
        int [] arr = new int[40];
        Ex1.fillRandomArray(arr);
        int j=1;
        System.out.println(Arrays.toString(arr));
        for(int i=2;i<arr.length;i+=2){
            arr[j]=arr[i];
            j++;
        }
        for(int i=j;i<arr.length;i++)arr[i]=0;
        System.out.println(Arrays.toString(arr));
    }
}
