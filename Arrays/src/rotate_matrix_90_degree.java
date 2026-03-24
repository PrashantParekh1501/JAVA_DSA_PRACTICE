import java.util.*;

import static java.util.Collections.rotate;
//[1,2,3]      [7,4,1]
//[4,5,6] -->  [8,5,2]
//[7,8,9]      [9,6,3]
//approch : first i will transpose and then rev each rows so tc=o(n*M), sc=O(1)

public class rotate_matrix_90_degree {

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
        rotate(arr, n, m);

        // print
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][]rotate(int[][]arr, int n , int m){
        //step1 transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<m;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //step2 rev each rows
        for(int i=0;i<n;i++){
            int l =0;
            int r = n-1;

            while(l<r){
                int temp = arr[i][l];
                arr[i][l] = arr[i][r];
                arr[i][r] = temp;
                l++;
                r--;
            }
        }
        return arr;
    }
}
