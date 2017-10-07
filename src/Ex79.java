import java.util.Arrays;

/**
 * 79. Алгоритм фон Неймана. Упорядочить массив а1, а2, ..., аn по
 * неубыванию с помощью алгоритма сортировки слияниями: каждая пара
 * соседних элементов сливается в одну группу из двух элементов
 * (последняя группа может состоять из одного элемента), затем
 * каждая пара соседних двухэлементных групп сливается в одну
 * четырехэлементную группу и т.д. При каждом слиянии новая
 * укрупненная группа упорядочивается. (Странное изложение концепции фон Неймана.)

 */
public class Ex79 {
    public static void main(String[] args) {
        int arr[]=new int[16];
        Ex1.fillRandomArray(arr);
        System.out.println(Arrays.toString(arr));
        int i=2;
        while (arr.length/i>=1){
            for (int j=0;j<arr.length;j+=i){
                int l=j, tmp;
                while (l<j+i && l<arr.length-1 && l>=j){
                    System.out.println("l="+l);
                    if (arr[l]<=arr[l+1])l++;
                    else {
                        tmp=arr[l+1];
                        arr[l+1]=arr[l];
                        arr[l]=tmp;
                        if (l>j)l--;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
