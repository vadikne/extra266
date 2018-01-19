import java.util.Arrays;

/**
 * Created by owner on 18.01.2018.
 * 168. Написать программу вычисления суммы    для заданного числа n. Дробь
 * p/q  должно быть несократимой (p, q – натуральные).
 */
public class Ex168 {
    public static void main(String[] args) {
        int n=7;
        int rezUp=0,rezDown=1;
        for (int i = 1; i <=n ; i++) {
            int rezUpTemp= sumOfFractions(rezUp,rezDown,(int)Math.pow((-1),i+1),i)[0];
            rezDown = sumOfFractions(rezUp,rezDown,(int)Math.pow((-1),i+1),i)[1];
            rezUp =rezUpTemp;
        }
        System.out.println(rezUp+"/"+rezDown);
    }
    public static int[] sumOfFractions(int a1,int b1, int a2, int b2){
        int []arr = new int[2];
        arr[0]=a1*(Ex78.nok(b1,b2)/b1)+ a2*(Ex78.nok(b1,b2)/b2); // домножаем на общ множ
        arr[1]= b1*(Ex78.nok(b1,b2)/b1);
        int arrTmp=arr[0];
        arr[0]/=Ex78.nod(arr[0],arr[1]); //сокращаем
        arr[1]/=Ex78.nod(arrTmp,arr[1]);
        return arr;
    }
}
