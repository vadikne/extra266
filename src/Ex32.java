/**
 * 32. Секретный замок для сейфа состоит из 10 расположенных
 * в ряд ячеек, в которые надо вставить игральные кубики. Но
 * дверь открывается только в том случае, когда в любых трех
 * соседних ячейках сумма точек на передних гранях кубиков равна 10.
 * (Игральный кубик имеет на каждой грани от 1 до 6 точек.) Напишите
 * программу, которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.

 */
public class Ex32 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 5;
        for (int i = 2; i < arr.length; i++) {
            arr[i] =10-arr[i-1]-arr[i-2];
            System.out.println(arr[i-2]+" "+arr[i-1]+" "+arr[i]);
        }
    }
}
