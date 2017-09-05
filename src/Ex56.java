import java.util.Arrays;

/**
 * 56. Дан одномерный массив чисел. Найти количество различных чисел этого массива
 */
public class Ex56 {
    public static void main(String[] args) {
        int arr[] = new int[100];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int counter=0;
        for (int j=0;j<arr.length;j++){
            for (int i=0;i<arr.length;i++){
                if (arr[i]==arr[j] && i!=j)break;
                if (i==arr.length-1){
                    counter++;
                    System.out.println("число:"+arr[j]+" позиция:"+j);
                }
            }

        }
        System.out.println(counter);
    }
}
