/**
 * 51. В одномерном массиве с четным количеством элементов (2N)
 * находятся координаты N точек плоскости. Они располагаются в
 * следующем порядке: x1, y1, х2, y2, x3, y3, и т.д. Определить
 * минимальный радиус круга с центром в начале координат, который
 * содержит все точки.

 */
public class Ex51 {
    public static void main(String[] args) {
        int arr[] = new int[20];
        Ex1.fillRandomArray(arr);
        double maxR=0;
        for (int i=0;i<arr.length-1;i++){
            if (maxR<(double) Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2)))maxR=(double) Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2));
            //System.out.println(Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2)));
            }
        System.out.println(maxR);
    }
}
