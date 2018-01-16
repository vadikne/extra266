/**
 * Created by owner on 16.01.2018.
 * 159. Дано простое число. Составить функцию, которая будет выводить следующее за ним простое число.
 */
public class Ex159 {
    public static void main(String[] args) {

        System.out.println(seekNextSimple(13));

    }
    public static int seekNextSimple(int a){
        int b=0;
        a++;
        boolean check=false;
        while (!check){
            for (int i = a-1; i >1 ; i--) {
                if (a%i==0 ){
                    a++;
                    break;
                }
                else if (i==2){
                    b=a;
                    check=true;
                }
            }

        }
        return b;
    }
}
