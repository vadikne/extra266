/**
 * Created by owner on 24.10.2017.
 */
public class Ex105 {
    public static void main(String[] args) {
        int n=5,sum=0,count=0;
        int [][] arr = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                arr[i][j]=(int) (Math.random()*10);
                if (j%3==0)arr[i][j]*=-1;
                if (j>i){
                    if (arr[i][j]>0){
                        sum+=arr[i][j];
                        count++;
                    }
                }
            }

        }
        Ex80.printArr(arr);
        System.out.println(sum+" "+count);
    }
}
