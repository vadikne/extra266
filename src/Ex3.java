/**3. Дана последовательность целых чисел a1, a2, ..., an.
 * Выяснить, какое число встречается раньше – положительное или отрицательное.
 */
public class Ex3 {
    public static void main(String[] args) {
    int [] arr  = {0,0,0,-1,5,9,-2};
    for(int a:arr){
        if(a>0){
            System.out.println(a+"положительное");
            break;
        }
        else {
            if(a<0){
                System.out.println(a+"отрицательное");
                break;
            }
        }
    }

    }
}