/**
 * Created by owner on 15.01.2018.
 * 149. Проверить, являются ли данные три числа взаимно простыми.
 */
public class Ex149 {
    public static void main(String[] args) {
        int a=3, b=5, c=7;
        if (Ex78.nod(a,b)!=1 ||Ex78.nod(a,c)!=1 ||Ex78.nod(c,b)!=1) System.out.println("Нет");
        else System.out.println("да");
    }
}
