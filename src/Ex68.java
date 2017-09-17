/**
 * 68. На плоскости n точек заданы своими координатами
 * и также дана окружность радиуса R с центром в начале
 * координат. Указать множество всех треугольников с
 * вершинами в заданных точках, пересекающихся с
 * окружностью; множество всех треугольников,
 * содержащихся внутри окружности.
 */
public class Ex68 {
    public static void main(String[] args) {
        int []arr=new int[60];
        int r=60;
        int r1=0;
        int r2=0;
        int r3=0;
        Ex1.fillRandomArray(arr);
        for (int i=0;i<arr.length;i+=2){
            for (int j=0;j<arr.length;j+=2){
                if(i!=j){
                    for (int m=0;m<arr.length;m+=2){
                        if (m!=j&&m!=i){
                           // System.out.println("i= "+i+" j= "+j+" m="+m);
                            r1=lineLenght(arr[i],arr[i+1],0,0);
                            r2=lineLenght(arr[j],arr[j+1],0,0);
                            r3=lineLenght(arr[m],arr[m+1],0,0);
                            if (r1<r && r2<r && r3<r) System.out.println("содержится");
                            else System.out.println("пересекает "+r1+" "+r2+" "+r3);
                        }
                    }
                }

            }

        }

    }
    public static int lineLenght(int x1,int y1,int x2,int y2){
        int l=0;
        l=(int)Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        return l;
    }
}
