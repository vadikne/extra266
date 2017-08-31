/**
 *  54. В одномерном массиве с четным количеством элементов (2N) находятся
 *  координаты N точек плоскости. Они располагаются в следующем порядке: x1,
 *  y1, х2, y2, x3, y3, и т.д. Определить номера точек, которые могут являться
 *  вершинами равнобедренного треугольника.

 */
public class Ex54 {
    public static void main(String[] args) {
        int arr [] = new int[20];
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length-1;i+=2){
            int line1=0;
            for (int j=i;j<arr.length-1;j+=2){
                if (j!=i){
                    line1=(int)lengthLine(arr,i,i+1, j, j+1);
                    // System.out.println("line1= "+line1+"  x1= "+i+" y1= "+(i+1)+" x2= "+j+" y2= " +(j+1));
                    int line2=0;
                    for (int k=0;k<arr.length-1;k+=2){
                        if (k!=j && k!=i){
                            line2=(int)lengthLine(arr,j,j+1,k,k+1);
                            //System.out.println("line2= "+line2+"  x1= "+j+" y1= "+(j+1)+" x2= "+k+" y2= " +(k+1));
                            if (line1==line2) {
                                //System.out.println("line1= "+line1+"  x1= "+i+" y1= "+(i+1)+" x2= "+j+" y2= " +(j+1)+"   line2= "+line2+"  x1= "+j+" y1= "+(j+1)+" x2= "+k+" y2= " +(k+1));

                                System.out.println(line1);
                                System.out.println(arr[i] + " " + arr[i + 1] + " - " + arr[j] + " " + arr[j + 1]);
                                System.out.println(arr[j] + " " + arr[j + 1] + " - " + arr[k] + " " + arr[k + 1]);

                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }




    public static double  lengthLine(int arr [],int x1,int y1,int x2,int y2){
        double l=Math.sqrt(Math.pow((double)(arr[x1]-arr[x2]),2)+Math.pow((double)(arr[y1]-arr[y2]),2));
        return  l;
    }
}