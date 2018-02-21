import java.util.Arrays;

/**
 * Created by owner on 26.01.2018.
 * 184. Реализовать набор подпрограмм для выполнения следующих операций над обыкновенными
 * дробями вида p/q (p – целое, q – натуральное):  а) сложение; б) вычитание; в) умножение;
 * г) деление; д) сокращение дроби; е) возведение дроби в степень n (n – натуральное);
 * ж) функции, реализующие операции отношения (равно, не равно, больше или равно, меньше или равно, больше, меньше).
 1) Дан, массив A – массив обыкновенных дробей. Найти сумму всех дробей и вычислить их среднее арифметическое,
 результаты представить в виде несократимых дробей.
 2) Дан массив A – массив обыкновенных дробей. Отсортировать его в порядке возрастания.

 */
public class Ex184 {
    public static void main(String[] args) {
        //2
        int [][]arr={{3,1,2},{4,4,4}};
       boolean test=true;
       int i=0, tmp, tmp1;
        while (i<arr[0].length-1){
            if (compareOfFractionsBiggerOrLess(arr[0][i],arr[1][i],arr[0][i+1],arr[1][i+1])){
               tmp=arr[0][i]; tmp1=arr[1][i];
               arr[0][i]=arr[0][i+1]; arr[1][i]=arr[1][i+1];
               arr[0][i+1]=tmp; arr[1][i+1]=tmp1;
                i=0;
            }
           i++;
       }
        Ex80.printArr(arr);
        //1
        int sum1=0,sum2=1;
        for (int j = 0; j < arr[0].length; j++) {
            sum1=Ex168.sumOfFractions(sum1,sum2,arr[0][j],arr[1][j])[0];
            sum2=Ex168.sumOfFractions(sum1,sum2,arr[0][j],arr[1][j])[1];
        }
        System.out.println("Сумма ="+sum1+"/"+sum2);
        System.out.println("Ср.ариф.="+sum1/arr[0].length+"/"+sum2);


    }

    public static int[] difOfFractions(int a1, int b1, int a2, int b2) {
        a2 *= -1;
        return Ex168.sumOfFractions(a1, b1, a2, b2);
    }
    public static int[] reductionToCommonDenominator(int a1, int b1, int a2, int b2){
        int []arr=new int[3];
        arr[0]=a1*(Ex78.nok(b1,b2)/b1);
        arr[1]=a2*(Ex78.nok(b1,b2)/b2);
        arr[2]= b1*(Ex78.nok(b1,b2)/b1);
        return arr;
    }
    public static int[] multiplyOfFractions(int a1, int b1, int a2, int b2) {
        int[] arr = new int[2];
        arr[0] = a1 * a2;
        arr[1] = b1 * b2;
        return arr;
    }

    public static int[] divideOfFractions(int a1, int b1, int a2, int b2) {
        int[] arr = new int[2];
        arr[0] = a1 * b2;
        arr[1] = b1 * a2;
        return arr;
    }

    public static int[] reductionOfFractions(int a1, int b1) {
        int[] arr = new int[2];
        arr[0] = a1;
        arr[1] = b1;
        arr[0] /= Ex78.nod(a1, b1); //сокращаем
        arr[1] /= Ex78.nod(a1, b1);
        return arr;
    }

    public static int[] exponentiationOfFractions(int a1, int b1, int pow) {
        int[] arr = new int[2];
        arr[0] = (int) Math.pow(a1, pow);
        arr[1] = (int) Math.pow(b1, pow);
        return arr;
    }

    public static boolean compareOfFractionsEqualOrNot(int a1, int b1, int a2, int b2) {
        if (reductionToCommonDenominator(a1, b1, a2, b2)[0]==reductionToCommonDenominator(a1, b1, a2, b2)[1])return true;
        return false;
    }
    public static boolean compareOfFractionsMoreOrEqual(int a1, int b1, int a2, int b2) {
        if (reductionToCommonDenominator(a1, b1, a2, b2)[0]>=reductionToCommonDenominator(a1, b1, a2, b2)[1])return true;
        return false;
    }
    public static boolean compareOfFractionsLessOrEqual(int a1, int b1, int a2, int b2) {
        if (reductionToCommonDenominator(a1, b1, a2, b2)[0] <= reductionToCommonDenominator(a1, b1, a2, b2)[1])
            return true;
        return false;
    }
    public static boolean compareOfFractionsBiggerOrLess(int a1, int b1, int a2, int b2) {
        if (reductionToCommonDenominator(a1, b1, a2, b2)[0] > reductionToCommonDenominator(a1, b1, a2, b2)[1])
            return true;
        return false;
    }
}
