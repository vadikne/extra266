import java.util.Arrays;

/**
 * Created by owner on 01.02.2018.
 * 186. Реализовать набор подпрограмм для выполнения следующих
 * операций над натуральными числами в P-ичной системе счисления
 * (2 ≤ Р ≤ 9) :  а) сложение, вычитании, умножение, деление;
 * б)перевод из десятичной системы счисления в P-ичную;
 * в) перевод из P-ичной системы счисления в десятичную;
 * г) функция проверки правильности записи числа в P-ичной системе счисления;
 * д) функции, реализующие операции отношения (равно, не равно, больше или равно, меньше или равно, больше, меньше).
 * 1) Возвести число в степень (основание и показатель степени записаны в P-ичной системе счисления).
 * Ответ выдать в P-ичной и десятичной системах счисления.
 2) Дан массив A – массив чисел, записанных в P-ичной системе счисления.
 Отсортировать его в порядке убывания. Ответ выдать в P-ичной и десятичной системах счисления.


 */
public class Ex186 {
    public static void main(String[] args) {
        int p=3;
        int a=3, b=3,c=9;
        String aStr=Integer.toString(a,p);
        String bStr=Integer.toString(b,p);
        // 1.
        double rez1=Math.pow(Integer.parseInt(aStr,p),Integer.parseInt(bStr,p));
        System.out.println((int)rez1+" "+Integer.toString((int)rez1,p));
        //2.
        System.out.println("часть 2");
        int [] brr = new int[5];
        String[] arr=new String[5];
        Ex1.fillRandomArray(brr);
        System.out.println(Arrays.toString(brr));
        for (int i = 0; i <brr.length ; i++) {
            arr[i]=Integer.toString(brr[i],p);
        }
        System.out.println(Arrays.toString(arr));
        int i=1;
        while (i<arr.length){
            if (!moreLess(arr[i-1],arr[i],p)){
                String strTmp=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=strTmp;
                i=0;
            }
            i++;
        }

        System.out.println(Arrays.toString(arr));
        for (String arStr:arr
             ) {
            System.out.print(Integer.parseInt(arStr,p)+" ");
        }
    }
    public static boolean equalOrNo (String a, String b, int radix){
        if (Integer.parseInt(a,radix)==Integer.parseInt(b,radix))return true;
        return false;
    }
    public static boolean bigggestOrEqual (String a, String b, int radix){
        if (Integer.parseInt(a,radix)>=Integer.parseInt(b,radix))return true;
        return false;
    }
    public static boolean smallerOrEqual (String a, String b, int radix){
        if (Integer.parseInt(a,radix)<=Integer.parseInt(b,radix))return true;
        return false;
    }
    public static boolean moreLess (String a, String b, int radix){
        if (Integer.parseInt(a,radix)>Integer.parseInt(b,radix))return true;
        return false;
    }

    public static String sum(String a, String b, int radix){
        return Integer.toString(Integer.parseInt(a,radix)+Integer.parseInt(b,radix),radix);
    }
    public static String dif(String a, String b, int radix){
        return Integer.toString(Integer.parseInt(a,radix)-Integer.parseInt(b,radix),radix);
    }
    public static String mult(String a, String b, int radix){
        return Integer.toString(Integer.parseInt(a,radix)*Integer.parseInt(b,radix),radix);
    }
    public static String div(String a, String b, int radix){
        return Integer.toString(Integer.parseInt(a,radix)/Integer.parseInt(b,radix),radix);
    }
    public static String convertToP(int a, int radix){
        char buf[]=new char[10];
        int charPos=buf.length-1;
        while (a>=radix){
            buf[charPos--]=Character.forDigit (a%radix,10);
            a/=radix;
        }
        buf[charPos]=Character.forDigit(a,10);
        return new String(buf,charPos,(buf.length-charPos));
    }
    public static int convertPToD (String numP, int radix){
       int rez=0;
        for (int i = 0; i < numP.length(); i++) {
            rez+=Character.getNumericValue(numP.charAt(i))*Math.pow(radix,(numP.length()-1-i));
        }
        return rez;
    }


}
