/**
 * Created by owner on 13.11.2017.
 * 127. В данной действительной квадратной матрице
 * порядка n найти наибольший по модулю элемент.
 * Получить квадратную матрицу порядка n – 1 путем
 * отбрасывания(исключения?) из исходной матрицы строки и столбца,
 * на пересечении которых расположен элемент с найденным значением.
 */
public class Ex127 {
    public static void main(String[] args) {
        int n=5,max,iMax=0,jMax=0;
        int [][]arr = new int[n][n];
        int [][]brr = new int[n-1][n-1];
        for (int i = 0; i < n; i++) {
            Ex1.fillRandomArray(arr[i]);
        }
        Ex80.printArr(arr);
        max=arr[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    iMax=i;
                    jMax=j;
                }
            }
        }
        System.out.println(iMax+" "+jMax);
        int iBrr=0,jBrr=0;
        for (int i = 0; i < n; i++) {
            if (i!=iMax){
            for (int j = 0; j < n; j++) {
                if (j!=jMax) {
                brr[iBrr][jBrr]=arr[i][j];
                jBrr++;
                }
                }
                jBrr=0;
                iBrr++;
            }
        }
        Ex80.printArr(brr);
    }
}
