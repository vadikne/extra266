import java.util.Arrays;

/**
 * 47. Дано действительное число x и массив A[n].
 * В массиве найти два члена, среднее арифметическое которых ближе всего к x.

 */
public class Ex47 {
    public static void main(String[] args) {
        int arr [] = new int[20];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int x = 47;
        double minSrAr=1.0;
        int i1=0;
        int i2=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if ((double)x/((double) (arr[i]+arr[j])/2)<minSrAr) {
                    minSrAr =(double) x/((double) (arr[i]+arr[j])/2);
                    i1=i;
                    i2=j;
                }
                System.out.println(i+" "+j+" "+(double) x/((double) (arr[i]+arr[j])/2));
            }
        }
        System.out.println(i1+" "+i2+" "+minSrAr);
    }

}
