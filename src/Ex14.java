import java.util.Arrays;

/**
 *14. При поступлении в вуз абитуриенты, получившие "двойку" на первом экзамене,
 * ко второму не допускаются. В массиве A[n] записаны оценки экзаменующихся, полученные на первом экзамене.
 * Подсчитать, сколько человек не допущено ко второму экзамену.
 */
public class Ex14 {
    public static void main(String[] args) {
        int [] arr = new int[50];
        int counter = 0;
        for (int i=0; i<arr.length;i++){
            arr[i] = (int) (Math.random()*5)+1;
            if(arr[i]>2) counter ++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(counter);
    }
}
