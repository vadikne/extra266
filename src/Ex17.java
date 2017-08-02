import java.util.Arrays;

/**
 * 17. Пригодность детали оценивается по размеру B, который должен
 * соответствовать интервалу (A – δ, A + δ). Определить, имеются ли
 * в партии из N деталей бракованные.
 * Если да, то подсчитать их количество, иначе выдать отрицательный ответ.
 */
public class Ex17 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        int a=50;
        int b=2;
        int counter = 0;
        for(int i=0;i<arr.length;i++)arr[i]= (int)(Math.random()*11)+45; // диапазон 45 - 55
        System.out.println(Arrays.toString(arr));
        for (int ar:arr) if(ar<=a-b || a+b<=ar)counter++;
        if (counter>0) System.out.println(counter);
        else System.out.println("отрицательный ответ");
    }
}
