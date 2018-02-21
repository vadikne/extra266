import java.util.ArrayList;
import java.util.List;

/**
 * Created by owner on 25.01.2018.
 * 182. Дано натуральное число n. Найти все меньшие n числа Мерсена.
 * Простое число называется числом Мерсена, если оно может быть представлено в виде  2^P – 1 ,
 * где p – тоже простое число. Например,  31 = 2^5 – 1  – число Мерсена.
 */
public class Ex182 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>(20);
        int n=99999999;
        int degr=1,counter=0;
        while (degr<n){
            arrList.add(degr);
            degr*=2;
        }
        for (int i = 2; i < arrList.size(); i++) {
            if (Ex172.checkSimple(arrList.get(i)-1) && Ex172.checkSimple(i)) System.out.println(arrList.get(i)-1);
        }
    }
}
