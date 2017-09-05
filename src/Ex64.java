import java.util.Arrays;

/**
 * 64. Даны два целочисленные массива. Определить, можно ли в
 * первом из них выбрать такие k идущих подряд элементов Xj, Xj+1, ..., Xk-1,
 * чтобы Xj = Y1, Xj+1 = Y2, ..., Xk-1 = Yk.
 * (найти совпадающие последовательности?)

 */
public class Ex64 {
    public static void main(String[] args) {
        int arr[]=new int[500];
        int brr[] = new int[500000];
        Ex1.fillRandomArray(arr);
        Ex1.fillRandomArray(brr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        int k=4;
        for (int i=0;i<arr.length-k;i++){
            for(int j=0;j<brr.length-k;j++){
                for (int m=0;m<k;m++){
                    //System.out.println("arr["+(i+m)+"]="+arr[i+m]+" brr["+(j+m)+"]="+brr[j+m]);
                    if (arr[i+m]!=brr[j+m]){
                        //System.out.println("arr["+(i+m)+"]="+arr[i+m]+" brr["+(j+m)+"]="+brr[j+m]);
                        break;
                    }
                    else if (m==k-1) {
                        for(int n=0;n<k;n++){
                            System.out.println(arr[i+n]+" "+brr[j+n]);

                        }System.out.println();
                    }
                    //System.out.println("arr["+(i+m)+"]="+arr[i+m]+" brr["+(j+m)+"]="+brr[j+m]);
                }

            }
        }
    }
}
