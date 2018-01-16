/**
 * Created by owner on 16.01.2018.
 * 160. Составить функцию для нахождения наименьшего
 * натурального делителя k (k ≠ 1) любого заданного натурального числа n.
 */
public class Ex160 {
    public static void main(String[] args) {
        System.out.println(divider(21));
    }
    public static int divider(int a){
        for (int i = 2; i <= a; i++) {
            if (a%i==0)return i;
        }
        return 1;
    }
}
