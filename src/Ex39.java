import java.util.Arrays;

/**
 * 39. Даны целые числа a1, a2, ..., аn. Наименьший член
 * этой последовательности заменить целой частью среднего
 * арифметического всех членов, остальные члены оставить
 * без изменения. Если в последовательности несколько
 * наименьших членов, то заменить последний по порядку.

 */
public class Ex39 {
    public static void main(String[] args) {
        int sum=0;
        int [] arr=new int[20];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int min= arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min)min=arr[i];
            sum+=arr[i];
        }
        for (int i=arr.length-1;i>=0;i--){
            if (arr[i]==min)arr[i]=sum/arr.length;
        }
        System.out.println(Arrays.toString(arr));
    }
}
