import java.util.*;
//approch: using iteration I can do just check is this row even then just print forward else backward
//2nd approch using recursion I can do but stack space it will take
public class alternate_Manner_matrix_traversal {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][]arr = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        alternateprint(arr, n,m);
    }

    public static void  alternateprint(int[][]arr, int n, int m){

        for(int i=0;i<n;i++){

            if(i % 2==0){
                for(int j=0;j<n;j++){
                  System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=n-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }



}
