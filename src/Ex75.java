import java.util.Arrays;

/**
 * 75. Сортировка вставками. Дана последовательность чисел а1, а2, ..., аn.
 * Требуется переставить числа в порядке возрастания. Делается это следующим
 * образом. Пусть а1, а2, ..., аi – упорядоченная последовательность, т.е.
 * a1 ≤ a2 ≤ ... ≤ аi. Берется следующее число ai+1 и вставляется в
 * последовательность так, чтобы новая последовательность была также возрастающей.
 * Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.

 */
public class Ex75 {
    public static void main(String[] args) {
        //int arr[]={0,9,8,1,5,3};
        int arr[]= new int[40];
        Ex1.fillRandomArray(arr);
        arr[0]=0;
        System.out.println(Arrays.toString(arr));
        int place;
      //  while (determSize(arr)<arr.length){

            for (int i=determSize(arr)+1;i<arr.length;i++){
            if (arr[i]<arr[determSize(arr)]){
               place=locatePlace(arr,arr[i]);
               // System.out.println("place= "+place+"arr[i]="+arr[i]);
               insert(arr,place,i);
            }
                //System.out.println(Arrays.toString(arr));
        }
       // System.exit(0);
        //}
        System.out.println(Arrays.toString(arr));
   }
    public static int determSize(int[]arr){
        int size=0;
        for (int i=0;i<arr.length-1;i++){
           // System.out.println(arr[i+1]+" "+arr[i]);
            if (arr[i+1]<arr[i]){
                size=i;
                break;
            }
        }
       // System.out.println("size="+size);
       // System.exit(0);
        return size;
    }
    public static int  locatePlace(int [] arr, int arrI){
        int place=0;
        for (int i=0;i<=determSize(arr);i++){
            if (arrI<arr[i]){
                place=i;
                break;
            }
        }
        return place;
    }
    public static int[] insert(int[]arr,int place,int i){
        int tmp=arr[i];
        for (int j=i;j>=place;j--){
            arr[j]=arr[j-1];
        }
        arr[place]=tmp;
        return arr;
    }
}
