
import java.util.Arrays;

/*2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов. */
public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[50];
        int counter =0;
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0) counter=counter+1;
            System.out.print(arr[i]+"-"+i+" ");
        }
        System.out.println();
        int[] rez = new int[counter];
        int j=0;
        for (int i=0;i<arr.length;i++){
                  System.out.print(arr[i] +"-"+i+" ");
           if (arr[i]==0){
               rez[j]=i;
               j++;
           }
        }
        System.out.println();
        System.out.println(Arrays.toString(rez));
    }
}

