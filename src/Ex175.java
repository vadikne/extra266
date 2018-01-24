/**
 * Created by owner on 22.01.2018.
 * 175. Составить программу для нахождения чисел из интервала [M; N], имеющих наибольшее количество делителей.

 */
public class Ex175 {
    public static void main(String[] args) {
        int m=5,n=550;
        int maxNumOfDividers=0;
        for (int i = m; i < n; i++) {
            if (maxNumOfDividers<countDividers(i))maxNumOfDividers=countDividers(i);
        }
        for (int i = m; i < n; i++) {
            if (maxNumOfDividers==countDividers(i)) System.out.println(i+" "+maxNumOfDividers);;
        }
    }
    public static int countDividers(int num){
        int res=0;
        for (int i = num; i > 0; i--) {
            if (num%i==0)res++;
        }
        return res;
    }
}
