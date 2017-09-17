import java.util.Arrays;

/**
 * 72. Даны две последовательности a1 ≤ a2 ≤ ... ≤ аn и b1 ≤ b2 ≤ ... ≤ bn.
 * Образовать из них новую последовательность чисел так, чтобы она тоже была
 * неубывающей (дополнительный массив не использовать).

 */
public class Ex72 {
    public static void main(String[] args) {
        int arr[]=new int[20];
        for (int i=0;i<10;i++)arr[i]=i*3;
        System.out.println(Arrays.toString(arr));
        int brr[]={2,4,6,9,19};
        int j=0;
        for (int i=0;i<arr.length;i++){
            if(j==brr.length)break;
            if (arr[i]>brr[j]){
                int quantityOfSecondPart;
                int quatityOfZero=arr.length-Ex71.lastEmptyFromEnd(arr);
                quantityOfSecondPart=arr.length-quatityOfZero-i;
                Ex71.moveOnOne(arr,quantityOfSecondPart);
                arr[i]=brr[j++];
                }

            }
        System.out.println(Arrays.toString(arr));
        }

}

