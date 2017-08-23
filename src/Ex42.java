/**
 * 42. Даны координаты n точек на плоскости: (Х1, Y2), ..., (Хn, Yn) (n ≤ 30).
 * Найти номера пары точек, расстояние между которыми наибольшее (считать, что такая пара единственная).

 */
public class Ex42 {
    public static void main(String[] args) {
        int arr [][] = new int[30][2];
        for (int i=0;i<arr.length;i++){
            arr[i][0]=(int)(Math.random()*100);
            arr[i][1]=(int)(Math.random()*100);
           // System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    double sMax=0;
    int xOne=0;
    int xTwo=0;
         for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (i!=j && sMax<Math.sqrt(Math.pow(arr[i][0]-arr[j][0],2)+Math.pow(arr[i][1]-arr[j][1],2))){
                    sMax=Math.sqrt(Math.pow(arr[i][0]-arr[j][0],2)+Math.pow(arr[i][1]-arr[j][1],2));
                    xOne=i;
                    xTwo=j;
                     }
             // if (i!=j) System.out.format("%.2f%n",(Math.sqrt(Math.pow(arr[i][0]-arr[j][0],2)+Math.pow(arr[i][1]-arr[j][1],2))));
            }
        }
        System.out.format("%.2f%n",sMax);
        System.out.println(xOne+" "+xTwo);
    }
}
