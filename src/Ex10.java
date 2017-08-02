/**
 * 10. Даны действительные числа a1, a2, …, an. Поменять местами наибольший и наименьший элементы.
 */
public class Ex10 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        int minI =0;
        int maxI=0;
        Ex1.fillRandomArray(arr);
        int min = arr[0];
        int max = arr [0];
        for(int j = 0; j<arr.length; j++ ){
            if (min>arr[j] && arr[j]!=0){
                min=arr[j];
                minI=j;
            }
            if (max<arr[j]) {
                max=arr[j];
                maxI = j;
            }
        }
        System.out.println(arr[maxI]+"   "+arr[minI]);
        arr[maxI]=arr[maxI]-arr[minI];
        arr[minI]=arr[minI]+arr[maxI];
        arr[maxI]=arr[minI]-arr[maxI];
        System.out.println(arr[maxI]+"   "+arr[minI]);
    }
   }
