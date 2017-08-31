/**
 * 52. В одномерном массиве с четным количеством элементов (2N)
 * находятся координаты N точек плоскости. Они располагаются в
 * следующем порядке: x1, y1, х2, y2, x3, y3, и т.д. Определить
 * кольцо с центром в начале координат, которое содержит все точки.

 */
public class Ex52 {
    public static void main(String[] args) {
        int arr [] = new int[40];
        Ex1.fillRandomArray(arr);
        double maxR=0;
        double minR=(double) Math.sqrt(Math.pow(arr[0],2)+Math.pow(arr[1],2));
        int xMin=-1;
        int yMin=-1;
        for (int i=0;i<arr.length-1;i++){

            if (maxR<(double) Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2)))maxR=(double) Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2));
            if (minR>(double) Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2))){
                minR=(double) Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2));
                xMin=i;
                yMin=i+1;
            }
           // System.out.println(Math.sqrt(Math.pow(arr[i],2)+Math.pow(arr[i+1],2)));
        }
       // System.out.println("x= "+xMin+" y= "+yMin);
        System.out.println(minR+" "+maxR);
    }
}
