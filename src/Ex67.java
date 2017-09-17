import java.util.Arrays;

/**
 * 67. Дан массив А. Циклически сдвинуть элементы массива на K элементов вправо (влево).

 */
public class Ex67 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int k=3;
       for (int i=0;i<k;i++){
        moveOnOneLeft(arr);
           System.out.println(Arrays.toString(arr));
       }

    }

    public static int[] moveOnOneRight(int arr[]){
        int a=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--) arr[i+1]=arr[i];
        arr[0]=a;
        return arr;
    }

    public static int[] moveOnOneLeft(int arr[]){
        int a=arr[0];
        for (int i=1;i<arr.length;i++) arr[i-1]=arr[i];
        arr[arr.length-1]=a;
        return arr;
    }

}



