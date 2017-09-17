import java.util.Arrays;

/**
 * 70. В одномерном массиве с четным количеством элементов (2N)
 * находятся координаты N точек плоскости. Они располагаются в
 * следующем порядке: x1, y1, х2, y2, x3, y3, и т.д. Определить
 * три точки, которые являются вершинами треугольника, для которого
 * разность числа точек вне его и внутри является минимальной.

 */
public class Ex70 {
    public static void main(String[] args) {
        int arr[]= new int[100];
        int existCount=0;
        int noExistCount=0;
        int min=65535;
        int difference;
        int x1=0;int x2=0;int x3=0;
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i+=2){
            for (int j=0; j<arr.length;j+=2){ //отрезок ко второй точке
               if (i!=j){
                   for (int m=0;m<arr.length;m+=2){//третья точка
                       if (m!=j&&m!=i){
                          // area(arr[i],arr[i+1],arr[j],arr[j+1],arr[m],arr[m+1]);
                          // System.out.println(i+" "+j+" "+m);
                           existCount=0;
                           noExistCount=0;
                           for (int n=0;n<arr.length;n+=2){
                               if (n!=i&&n!=j&&n!=m){
                                if(exist(arr[n],arr[n+1],arr[i],arr[i+1],arr[j],arr[j+1],arr[m],arr[m+1]))existCount++;
                                else noExistCount++;
                               }
                           }
                          // System.out.println("exist="+existCount+" noExist="+noExistCount);
                           difference=Math.abs(existCount-noExistCount);
                           if (min>difference){
                               min=difference;
                               x1=i; x2=j;x3=m;
                           }
                       }
                   }
               }
            }
        }
        System.out.println("минимальная разница="+min+"для треугольника x1="+x1+" x2="+x2+" x3="+ x3);
    }
    public static double area(int x1,int y1,int x2,int y2,int x3,int y3){
        double a=lineLenght(x1,y1,x2,y2);
        double b=lineLenght(x2,y2,x3,y3);
        double c=lineLenght(x1,y1,x3,y3);
        double p=round((a+b+c)/2);
        double s=round(Math.sqrt(p*(p-a)*(p-b)*(p-c)));
        //System.out.println("s="+s+" p="+p+" a="+a+" b="+b+" c="+c);
        return s;
    }
    public static boolean exist(int x,int y, int x1,int y1,int x2,int y2,int x3,int y3){
        boolean ex;
        double s=round(area(x1,y1,x2,y2,x3,y3));
        double s1=round(area(x,y,x1,y1,x2,y2));
        double s2=round(area(x,y,x2,y2,x3,y3));
        double s3=round(area(x,y,x1,y1,x3,y3));
        if (s==s1+s2+s3){
           // System.out.println("равны-------------------------");
            ex=true;
        }
        else ex=false;
        return ex;
    }
    public static double lineLenght(int x1,int y1,int x2,int y2){
        double l=0;
        l=round(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
        return l;
    }
    public static double round(double x){
        x=Math.round(x*1)/1.00; // можно было int
        return x;
    }
}
