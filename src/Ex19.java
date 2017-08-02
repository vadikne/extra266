/**
 * 19. Дан целочисленный массив с количеством элементов n.
 * Напечатать те его элементы, индексы которых являются степенями двойки (1, 2, 4, 8, 16, ...).

 */
public class Ex19 {
    public static void main(String[] args) {
        int [] arr = new int[129];
        Ex1.fillRandomArray(arr);
        for(int i=1;i<arr.length;i=i*2) System.out.println(arr[i]+" - "+i);
    }
}
