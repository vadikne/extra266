/**
 * 97. Составить программу, которая заполняет квадратную матрицу
 * порядка n натуральными числами 1, 2, 3, ..., n2, записывая их
 * в нее "по спирали". Например, для n = 5 получаем следующую матрицу:

 */
public class Ex97 {
    public static void main(String[] args) {
        int n=5;
        int k=0; //счетчик проходов по горизонту
        int l=1; // счетчик по вертикали
        int m=0; //для индекса рядов
        int p=0; //для индекса столбцов
        int i=1;
        int [][]arr = new int[n][n];
        while (i<=n*n){
            for (int j=k;j<n-k;j++)arr[m][j]=i++; //верхний
            k++;
            for (int j=l;j<=n-l;j++){arr[j][n-1-p]=i++;}//правый
            for (int j=n-1-k;j>=k-1;j--)arr[n-1-m][j]=i++; //нижний
            for (int j=n-1-l;j>=l;j--)arr[j][p]=i++; //левый
            m++;
            p++;
            l++;

        }
    Ex80.printArr(arr);
    }
}