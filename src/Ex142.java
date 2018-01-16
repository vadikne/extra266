/**
 * Created by owner on 12.01.2018.
 * 2.  Подпрограммы
 Во всех задачах этого раздела необходимо использовать подпрограммы.
 2.1.  Нерекурсивные  подпрограммы
 А
 142. Треугольник задан координатами своих вершин. Составить программу вычисления его площади.

 */
public class Ex142 {
    public static void main(String[] args) {
        int []arr = new int[6];
        Ex1.fillRandomArray(arr);
        System.out.println(Ex70.area(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5]));
    }
}
