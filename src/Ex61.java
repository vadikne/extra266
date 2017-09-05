import java.util.Arrays;

/**
 * 61. В массиве А каждый элемент равен 0, 1, 2. Переставить
 * элементы массива так, чтобы сначала располагались все нули,
 * затем все единицы, и, наконец все двойки.

 */
public class Ex61 {
    public static void main(String[] args) {
        int arr[] = {1,0,0,2,1,1,1,1,1,2,2,2,2,0,0};
        int tmpA;
        int ind=0;
        for (int i=0;i<arr.length;i++) {
            tmpA=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<tmpA){
                    tmpA=arr[j];
                    ind=j;
                }
            }
            arr[ind]=arr[i];
            arr[i]=tmpA;
        }
        System.out.println(Arrays.toString(arr));
    }
}
