/**
 * Created by owner on 24.01.2018.
 * 179. Написать программу, определяющую сумму n-значных чисел,
 * содержащих только нечетные цифры. Определить также, сколько четных цифр в найденной сумме.

 */
public class Ex179 {
    public static void main(String[] args) {
        int n=4;
        int sumNumbers=0, sumOddDigits=0; // для 5 и больше надо переделать на double
        for (int i = (int)Math.pow(10,n); i < (int)Math.pow(10,n+1)-1; i++) {
            int iTmp=i;
            boolean checkOdd=true;
            for (int j = 0; j <= n; j++) {
                if (Ex161.separLastDig(iTmp)%2==0)iTmp/=10;
                else {
                    checkOdd=false;
                    break;
                }
            }

            if (checkOdd){
                sumNumbers+=i;
            }
            if (sumNumbers<0)System.exit(0);
        }
        System.out.println(sumNumbers);
        int tmpSumNum=sumNumbers;
        for (int i = 0; i <Ex161.countDigits(sumNumbers) ; i++) {

            if (Ex161.separLastDig(tmpSumNum)!=0 && Ex161.separLastDig(tmpSumNum)%2==0){
                sumOddDigits++;
                tmpSumNum/=10;
            }
            else tmpSumNum/=10;
        }
        System.out.println(sumOddDigits);
    }
}
