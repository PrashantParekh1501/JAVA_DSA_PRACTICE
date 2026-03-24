import java.util.*;

//approch : transpose mean row convert to col and col convert to row so using two for loops tranverse
//just swap rows with col tc=o(n*m, sc=o(1)
public class transpose_matrix {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][]arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        doittrans(arr,n);
    }
    public static void doittrans(int[][]arr, int n){

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


}
