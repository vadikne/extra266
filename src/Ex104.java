/**
 * Created by owner on 24.10.2017.
 * 104. Магическим квадратом порядка n называется квадратная матрица
 * размера n × n, составленная из чисел 1, 2, ..., n2 так, что суммы
 * по каждому столбцу, каждой строке и каждой из двух больших диагоналей
 * равны между собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 * метод альфила, для нечетных N:

 */
public class Ex104 {
    public static void main(String[] args) {
        int n=7,x,y;
        int [][] arr = new int[n][n];
        for (int i=1;i<=n*n;i++){
            x=2*i-((i-1)/n)-2;
           x=checkShift(x,n);
            y=2*i+((i-1)/n)-1;
            y=checkShift(y,n);
         if (arr[y][x]==0)arr[y][x]=i;
        }
        Ex80.printArr(arr);
    }
    public static int checkShift(int a,int n){
        int rez=a<n?a:checkShift(a-n,n);
        return rez;
    }
}
