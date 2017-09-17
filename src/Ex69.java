/**
 * 69. В одномерном массиве с четным количеством элементов (2N)
 * находятся координаты N точек плоскости. Они располагаются в
 * следующем порядке: x1, y1, х2, y2, x3, y3, и т.д. Найти номера
 * самых удаленных друг от друга точек и наименее удаленных друг от друга точек.

 */
public class Ex69 {
    public static void main(String[] args) {
        int [] arr = new int[40];
        Ex1.fillRandomArray(arr);
        int lMax=0;
        int lMin=Ex68.lineLenght(arr[0],arr[1],arr[2],arr[3]);
        int l=0;
        int n1Max=0;
        int n2Max=0;
        int n1Min=0;
        int n2Min=2;
        for (int i=0;i<arr.length;i+=2){
            for (int j=0;j<arr.length;j+=2){
                if (i!=j){
                l=Ex68.lineLenght(arr[i],arr[i+1],arr[j],arr[j+1]);
                if (lMax<l){
                    lMax=l;
                    n1Max=i; n2Max=j;
                }
                if (lMin>l){
                    lMin=l;
                    n1Min=i; n2Min=j;
                }
                }
            }
        }
        System.out.println("max= "+lMax+" n1= "+n1Max/2+" n2= "+n2Max/2);
        System.out.println("min= "+lMin+" n1= "+n1Min/2+" n2= "+n2Min/2);
    }
}
