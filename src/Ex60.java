import java.util.Arrays;

/**
 * 60. Даны два упорядоченные массива А и В.
 * Образовать из элементов этих массивов упорядоченный массив С.

 */
public class Ex60 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        int brr[] = new int[arr.length];
        int crr[] = new int[arr.length+brr.length];
        for (int i=0;i<arr.length;i++){
            arr[i]=i*2;
            brr[i]=i*3;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        int m=0;
        int n=0;

        for (int i=0;i<crr.length;i++){
                if (m<arr.length && arr[m]<brr[n]){
                    crr[i]=arr[m];
                    m++;
                    System.out.println(crr[i]);
                }
                else {
                    crr[i]=brr[n];
                    n++;
                    System.out.println(crr[i]);
                }
        }
        System.out.println(Arrays.toString(crr));
    }
}
