import java.util.Arrays;

/**
 *77. Пусть даны неубывающая последовательность действительных чисел
 * a1 ≤ a2 ≤ ... ≤ аn и действительные числа b1 ≤ b2 ≤ ... ≤ bm.
 * Требуется указать те места, на которые нужно вставлять элементы
 * последовательности b1, b2, ..., bm в первую последовательность так,
 * чтобы новая последовательность оставалась возрастающей.

 */
public class Ex77 {
    public static void main(String[] args) {
    int arr[]=new int[20];
    int brr[]=new int[5];
    for (int i=0;i<arr.length;i++) arr[i]=i*3;
    for (int i=0;i<brr.length;i++) brr[i]=i*4;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
    int j=0;
    for (int i=0;i<arr.length-1;i++){

        while (j<brr.length && arr[i+1]>brr[j]){
            System.out.println(j+"й элемент="+brr[j]+" вставляем на "+i+" место перед"+arr[i+1]);
            j++;
        }

    }

    }
}
