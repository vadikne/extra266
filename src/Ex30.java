import java.util.Arrays;

/**
 * 30. Дана последовательность целых чисел a1, a2, ..., аn.
 * Образовать новую последовательность, выбросив из исходной
 * те члены, которые равны  min(a1, a2, ..., аn).

 */
public class Ex30 {
    public static void main(String[] args) {
        int arr[] = new int[50];
        int counter=0;
        Ex1.fillRandomArray(arr);
        int min=arr[0];
        System.out.println(Arrays.toString(arr));
        for (int a:arr) {
            if(min>a)min=a;
        }
        System.out.println("min= "+min);
        for (int a:arr
             ) {
            if(a==min)counter++;
        }
        System.out.println("в количестве - "+counter);
        int arr1[]=new int[arr.length-counter];
        int j=0;
        for(int i=0;i<arr.length;i++){
            arr1[j]=arr[i];
            if (arr1[j]==min)j--;
            j++;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
