import java.util.Arrays;

/**
 * 27. Дан массив действительных чисел. Среди них есть равные.
 * Найти первый максимальный элемент массива и заменить его нулем.

 */
public class Ex27 {
    public static void main(String[] args) {
        int arr[] = new int[50];
        Ex1.fillRandomArray(arr);
        int counter=0;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
                counter = i;
            }
        }
        System.out.println(counter);
        arr[counter]=0;
        System.out.println(Arrays.toString(arr));
    }
}
