/**
 * Created by owner on 15.01.2018.
 * 151. Даны две дроби A/B и C/D (А, В, С, D – натуральные числа). Составить программу:
 – деления дроби на дробь;
 – умножения дроби на дробь;
 – сложения этих дробей.
 Ответ должен быть несократимой дробью.

 */
public class Ex151 {
    public static void main(String[] args) {
        int a=3, b=5, c=4, d=7;
        System.out.println("Деление: "+a*d+"/"+b*c);
        System.out.println("Умножение: "+a*c+"/"+ b*d);
        System.out.println("Сложение: "+(a*Ex78.nok(b,d)/b+c*Ex78.nok(b,d)/d)+"/"+ Ex78.nok(b,d) );
    }

}
