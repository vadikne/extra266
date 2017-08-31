import java.util.Arrays;

/**
 * 50. В одномерном массиве переставить элементы так,
 * чтобы сначала располагались отрицательные элементы,
 * потом нулевые, а затем положительные. Относительное
 * расположение элементов не изменять.

 */
public class Ex50 {
    public static void main(String[] args) {
        int arr [] = new int[30];
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length;i+=3){
            arr[i]*=-1;
            if (i%5==0)arr[i]=0;
        }
        System.out.println(Arrays.toString(arr));
        int tmp;
        int tmp1;
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<0){
                    tmp = arr[j];
                    for (int k=j;k>i;k--) {
                        arr[k]=arr[k-1];
                       }
                       arr[i]=tmp;
                    count++;
                    break;
                }
            }
        }
        for (int i=count;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]==0){
                    tmp = arr[j];
                    for (int k=j;k>i;k--) {
                        arr[k]=arr[k-1];
                    }
                    arr[i]=tmp;
                    count++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
