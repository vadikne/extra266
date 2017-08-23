import java.util.Arrays;

/**
 * 36. Задан массив, содержащий несколько нулевых элементов. Сжать его, выбросив эти элементы.

 */
public class Ex36 {
    public static void main(String[] args) {


        int[] arr = new int[20];
        Ex1.fillRandomArray(arr);
        for(int i=0;i<arr.length;i++)if(i%3==0)arr[i]=0;
        System.out.println(Arrays.toString(arr));
        int m=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                m=i;
                for(int j=i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
        for (int i=m+1;i<arr.length;i++)arr[i]=0;
        System.out.println(Arrays.toString(arr));
    }
}