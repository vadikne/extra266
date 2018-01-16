import java.util.Arrays;

/**
 * Created by owner on 16.01.2018.
 * 157. Дан массив A(n). Сформировать массив B(m), элементами которого
 * являются большие из рядом стоящих в массиве A чисел.
 * Например, массив A состоит из элементов 1, 3, 5, -2, 0, 4, 0. Элементами массива B будут 3, 5, 4.
 */
public class Ex157 {
    public static void main(String[] args) {
        int []arr = {9, 1, 3, 5, -2, 0, 4, 0};
        int[] brr = new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (checkMore(arr,i))brr[j++]=arr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
    public static boolean checkMore(int[]arr,int i){
        if (i<arr.length-1 && arr[i]!=0 && arr[i]>arr[i+1])return true;
        if (i>0 && arr[i]!=0 && arr[i]>arr[i-1])return true;
        return false;
    }
}
