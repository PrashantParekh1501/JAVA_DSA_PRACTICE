import java.util.*;

//1st approch: 1st pass totalsum then 2nd pass ans[i]= totalsum - currele;
//tc=o(n),sc=o(n)
public class sum_of_array_except_self {


    private static int[] findsum(int[] arr) {
        int n = arr.length;
        int[]ans = new int[n];
        int totalsum = 0;

        for(int a: arr)totalsum += a;

        for(int i=0;i<n;i++){
            ans[i] = totalsum - arr[i];
        }
        return ans;

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int[]ans = findsum(arr);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }

}
