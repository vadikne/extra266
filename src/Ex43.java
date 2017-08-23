/**
 * 43. Дан массив чисел. Найти сумму элементов массива,
 * расположенных между минимальным и максимальным элементами включительно.

 */
public class Ex43 {
    public static void main(String[] args) {
        int arr [] = new int[50];
        Ex1.fillRandomArray(arr);
        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int iMin=0;
        int iMax=0;
         for (int i=0;i<arr.length;i++){
            if (min>arr[i]){
                min = arr[i];
                iMin = i;
            }
            if (max<arr[i]){
                max=arr[i];
                iMax = i;
            }
        }
        if (iMin<iMax)for (int i=iMin;i<=iMax;i++)sum+=arr[i];
        if (iMin>iMax)for (int i=iMax;i<=iMin;i++)sum+=arr[i];
        System.out.println(iMin+" "+iMax+" "+ sum);
    }

}
