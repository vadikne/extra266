import java.util.Arrays;

/**
 * Created by owner on 29.01.2018.
 * 185. Реализовать набор подпрограмм для выполнения следующих операций над векторами:
 * а) сложение; б) вычитание; в) скалярное умножение векторов;
 * г) умножение вектора на число; д) нахождение длины вектора.
 1) Дан массив A – массив векторов. Отсортировать его в порядке убывания длин векторов.
 2) С помощью датчика случайных чисел сгенерировать 2N целых чисел.
 N пар этих чисел задают N точек координатной плоскости.
 Вывести номера тройки точек, которые являются координатами вершин треугольника с наибольшим углом.

 */
public class Ex185 {
    public static void main(String[] args) {
        //1
        int [][]arr={{3,4,5},{8,6,7}};
        { int i=0;
        int tmp1,tmp2;
        while (i<arr[0].length-1){
           if (lengthVector(arr[0][i],arr[1][i])<lengthVector(arr[0][i+1],arr[1][i+1])){
               tmp1=arr[0][i]; tmp2=arr[1][i];
               arr[0][i]=arr[0][i+1]; arr[1][i]=arr[1][i+1];
               arr[0][i+1]=tmp1; arr[1][i+1]=tmp2;
               i=0;
           }
           i++;
        }
        Ex80.printArr(arr);}
        //2
        System.out.println("часть 2");
        int n=5;
        int []brr = new int[n*2];
        Ex1.fillRandomArray(brr);
        System.out.println(Arrays.toString(brr));;
        double maxAngle=0;
        int [] maxIndex=new int[3];
        for (int i = 0; i < brr.length; i+=2) {
            for (int j = 0; j < brr.length; j+=2) {
                for (int k = 0; k < brr.length; k+=2) {
                    if (k!=j && j!=i && k!=i){
                        if (maxAngle<angleVectors(brr[i]-brr[j],brr[i+1]-brr[j+1],brr[j]-brr[k],brr[j+1]-brr[k+1])){
                           maxAngle=angleVectors(brr[i]-brr[j],brr[i+1]-brr[j+1],brr[j]-brr[k],brr[j+1]-brr[k+1]);
                           maxIndex[0]=i;
                           maxIndex[1]=j;
                           maxIndex[2]=k;
                       }
                    }
                }
            }
        }
        System.out.println(Arrays.toString(maxIndex)+"максимальный угол: "+(int)maxAngle);
        }


    public static int[] sumVectors(int aX, int aY, int bX, int bY){
        int []arr = new int[2];
        arr[0]=aX+bX;
        arr[1]=bY+bX;
        return arr;
    }
    public static int[] difVectors(int aX, int aY, int bX, int bY){
        int []arr = new int[2];
        arr[0]=aX-bX;
        arr[1]=bY-bX;
        return arr;
    }
    public static int multVectors(int aX, int aY, int bX, int bY){
        return aX*bX+aY*bY;
    }
    public static int[] multByNumVector(int aX, int aY, int num){
        int []arr = new int[2];
        arr[0]=aX*num;
        arr[1]=aY*num;
        return arr;
    }
    public static double lengthVector(int aX, int aY){
        return Math.sqrt(aX*aX+aY*aY);
    }
    public static double angleVectors(int aX, int aY, int bX, int bY){
        return  Math.acos(multVectors(aX,aY,bX,bY)/(lengthVector(aX,aY)*lengthVector(bX,bY)))*57.295779513082;
    }
}
