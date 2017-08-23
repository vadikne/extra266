/**
 * 38. Дана последовательность целых чисел a1, a2, ..., аn.
 * Указать пары чисел аi, аj, таких, что аi + аj = m.

 */
public class Ex38 {
    public static void main(String[] args) {
        int [] arr= new int[50];
        Ex1.fillRandomArray(arr);
        int m=79;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==m) System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
