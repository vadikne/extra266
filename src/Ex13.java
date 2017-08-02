import java.util.Arrays;

/**
 * 13. В заданном одномерном массиве поменять местами соседние элементы,
 * стоящие на четных местах, с элементами, стоящими на нечетных.
 */
public class Ex13 {
    public static void main(String[] args) {
        int [] arr= new int[50];
        int temp=0;
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length && i+2 <= arr.length;i=i+2){
          temp = arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
