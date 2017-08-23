import java.util.Arrays;

/**
 * 37. Задан массив с количеством элементов N. Сформируйте два массива:
 * в первый включите элементы исходного массива с четными номерами, а во второй – с нечетными.
 */
public class Ex37 {
    public static void main(String[] args) {
        int []arr = new int[30];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int arr1 [] =new int[arr.length/2];
        int arr2 [] = new int [arr.length/2];
        for(int i=0;i<arr.length-1;i+=2){
        arr2[i/2]=arr[i];
        arr1[i/2]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));
    }
}
