import java.util.Arrays;

/**
 * 48. Даны две последовательности а1, а2, ..., аn и b1, b2, ..., bm (m < n).
 * В каждой из них члены различны. Верно, ли что все члены второй
 * последовательности входят в первую последовательность?

 */
public class Ex48 {
    public static void main(String[] args) {
        int [] arr = new int[100];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int brr [] = new int[5];
        Ex1.fillRandomArray(brr);
        System.out.println(Arrays.toString(brr));
        boolean x=true;
        for (int i = 0;i<brr.length && x;i++){
            for (int j=0;j<arr.length;j++){
                if (arr[j]==brr[i]){
                    System.out.println("есть"+brr[i]);
                    break;
                }
                else if (j==arr.length-1){
                    System.out.println("этого нету "+brr[i]);
                    x=false;
                }
            }
        }
        if (x) System.out.println("верно");
        else System.out.println("не верно");
    }
}
