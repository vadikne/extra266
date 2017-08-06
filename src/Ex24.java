import java.util.Arrays;

/**
 * 24. Даны действительные числа a1, a2, ..., аn. Среди них
 * есть положительные и отрицательные. Заменить нулями те
 * числа, величина которых по модулю больше максимального
 * числа (|ai| > max{a1, a2, ..., аn}).

 */
public class Ex24 {
    public static void main(String[] args) {
        int [] arr = new int[40];
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length;i=i+2)arr[i]=arr[i]*(-1);
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        for (int a:arr
             ) {
            if (a>max)max = a;
            }
        System.out.println("max= "+max);
        for (int a:arr
             ) {
            if (Math.abs(a)>max){
                System.out.println(a);
                a=0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
