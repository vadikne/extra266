/**
 * 31. У прилавка магазина выстроилась очередь из n покупателей.
 * Время обслуживания i-того покупателя равно tj (i = 1, …, n).
 * Определить время Ci пребывания i-гo покупателя в очереди.

 */
public class Ex31 {
    public static void main(String[] args) {
    int t=2;
    int n=25;
    int c=0;
    for (int i=1;i<=n;i++){
        System.out.println("C("+i+")="+i*t+"минут");
    }
    }
}
