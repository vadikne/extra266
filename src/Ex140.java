import java.util.Arrays;

/**
 * Created by owner on 07.12.2017.
 * 140. "Тестирование коллектива". Пусть целочисленная матрица размером n × m
 * содержит информацию об учениках некоторого класса из n человек. В первом
 * столбце проставлена масса (кг), во втором – рост (см), в третьем – успеваемость
 * (средний балл) и т.д. (используйте свои дополнительные показатели). Ученик
 * называется среднестатистическим по k-му параметру (уникальным по k-му параметру),
 * если на нем достигается минимум (максимум) модуля разности среднего арифметического
 * чисел из k-го столбца и значения k-го параметра этого ученика. Ученик называется
 * самым уникальным (самым средним), если он уникален (является среднестатистическим)
 * по самому большому количеству параметров.
 * По данной матрице определить самых уникальных учеников и самых средних.
 */
public class Ex140 {
    public static void main(String[] args) {
        double [][]arr={{56,170,9.5},{60,165,7.9},{59,171,8.7}};
        System.out.println(Arrays.deepToString(arr));
        int [][]brr=new int[3][2];

        for (int i = 0; i < arr[0].length; i++) {
            brr[indOfUnic(arr,i)][0]++;
            brr[indOfMiddle(arr,i)][1]++;
        }
        //System.out.println(Arrays.deepToString(brr));
        System.out.println("Таблица уникальности и среднестатистичности");
        Ex80.printArr(brr);
        System.out.println("самый уникальный № "+Ex110.indexMaxOfCol(brr,0)+"  самый средний № "+Ex110.indexMaxOfCol(brr,1));
    }
    public static double averageOfCol(double[][]arr,int numOfCol){
        double averageOfCol=0;
        for (int i = 0; i < arr.length; i++) {
            averageOfCol+=arr[i][numOfCol];
        }
        averageOfCol/=arr.length;
        return averageOfCol;
    }

    public static int indOfUnic(double[][]arr,int numOfCol){
        int indOfUnic=0;
        double max=0;
        for (int i = 0; i < arr.length; i++) {

            if (max<Math.abs(averageOfCol(arr,numOfCol)-arr[i][numOfCol])){
                max=Math.abs(averageOfCol(arr,numOfCol)-arr[i][numOfCol]);
                indOfUnic=i;
            }
        }
        return indOfUnic;
    }
    public static int indOfMiddle(double[][]arr,int numOfCol){
        int indOfMiddle=0;
        double min=100;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(Math.abs(averageOfCol(arr,numOfCol)-arr[i][numOfCol]));
            if (min>Math.abs(averageOfCol(arr,numOfCol)-arr[i][numOfCol])){
                min=Math.abs(averageOfCol(arr,numOfCol)-arr[i][numOfCol]);
                indOfMiddle=i;
            }
        }
        return indOfMiddle;
    }

}
