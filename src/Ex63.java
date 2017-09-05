import java.util.Arrays;

/**
 * 63. Дан целочисленный массив А и число М. Найти такое
 * подмножество подряд идущих элементов массива,
 * сумма значений элементов, которых равна М.

 */
public class Ex63 {
    public static void main(String[] args) {
        int arr[] = new int[5000];
        Ex1.fillRandomArray(arr);
        ///System.out.println(Arrays.toString(arr));
        int m=1087;
        int indOne;
        int indTwo=0;
        int s;
        for (int i=0;i<arr.length;i++){
            indOne=i;
            s=0;
           for (int j=i;j<arr.length;j++){
               s+=arr[j];
               if (s==m) {
                   indTwo=j;
                   System.out.println("сумма елементов с"+indOne+" по "+indTwo+" равна: "+s);
                   break;
               }
               if (s>m)break;
           }
            //System.out.println(indOne+" "+indTwo+" "+s);

        }
    }
}
