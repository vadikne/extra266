/**
 * 9. Дан массив действительных чисел, размерность которого N.
 * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Ex9 {
    public static void main(String[] args) {
        int [] arr= {1,2,5,8,-1,0,-6,3,-6,0,1,1,4};
        int plus=0;
        int minus=0;
        int zero=0;
        for(int a:arr){
            if(a>0)plus++;
            if(a<0)minus++;
            if(a==0)zero++;
        }
        System.out.println(plus + " "+minus+" "+zero);
    }
}
