import java.util.Arrays;

/**
 * Created by owner on 15.01.2018.
 * 152. На плоскости заданы своими координатами n точек.
 * Создать матрицу, элементами которой являются расстояние между каждой парой точек.
 */
public class Ex152 {
    public static void main(String[] args) {
        int [] arr =new int[10];
        int size =(int)(Math.pow(arr.length/2,2));
        int [] brr = new int[size];
        int indOfBrr=0;
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i+=2) {
            for (int j = 0; j < arr.length; j+=2) {
                if (i!=j){
                    brr[indOfBrr]=Ex68.lineLenght(i,i+1,j,j+1);
                    indOfBrr++;
                }

            }

        }
        System.out.println(Arrays.toString(brr));
    }
}
