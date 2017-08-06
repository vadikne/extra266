import java.util.Arrays;

/**
 * 23. Последовательность a1, a2, ..., аn состоит из нулей и единиц.
 * Поставить в начало этой последовательности нули, а затем единицы.

 */
public class Ex23 {
    public static void main(String[] args) {
        int [] arr= {1,0,1,1,0,0,0,1,1,1,0,1,0,1,0,1,0,1};
        //for (int i=0;i<arr.length;i++)
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if (arr[i]==1 && arr[j]==0){
                arr[i++]=0;
                arr[j--]=1;
            }
            if (arr[i]==0)i++;
            if (arr[j]==1) j--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
