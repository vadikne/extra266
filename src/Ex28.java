import java.util.Arrays;

/**
 * 28. Дана последовательность действительных чисел a1 ≤ a2 ≤ ... ≤ аn.
 * Вставить действительное число b в нее так, чтобы последовательность осталась неубывающей.

 */
public class Ex28 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        int [] arr1= new int[arr.length+1];
        int b=25;
        boolean rez=true;
            for(int i=0;i<arr.length;i++)arr[i]=i*3;
        System.out.println(Arrays.toString(arr));
        int i=0;
        for(int j=0;j<arr1.length;j++){
            if(arr[i]>b&&rez){
                arr1[j]=b;
                rez=false;
            }
            else {arr1[j]=arr[i];
            i++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}
