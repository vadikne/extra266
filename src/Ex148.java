/**
 * Created by owner on 15.01.2018.
 * 148. На плоскости заданы своими координатами n точек.
 * Составить программу, определяющую между какими из пар точек самое большое расстояние (координаты точек занести в массив).

 */
public class Ex148 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Ex1.fillRandomArray(arr);
        double max=0;
        int yMax=0,xMax=0,y1Max=0,x1Max=0;
        for (int i = 1; i < arr.length; i+=2) {
            for (int j = 1; j < arr.length; j+=2) {
                if (max<Ex70.lineLenght(arr[i-1],arr[i],arr[j-1],arr[j])) {
                    max = Ex70.lineLenght(arr[i - 1], arr[i], arr[j - 1], arr[j]);
                    yMax = i - 1;
                    xMax = i;
                    y1Max = j - 1;
                    x1Max = j;
                }
            }
        }
        System.out.println(max+" "+yMax+" "+xMax+" "+y1Max+" "+x1Max);
    }
}
