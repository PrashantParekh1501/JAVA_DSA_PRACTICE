import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//approch
//1st approch
//iterate using two for loops and check i<j && arr[i]+arr[j]%k count++, tc=o(n2),sc=O(1)
//apprpch2 : using freq arry of size k then itarte on array and find r after find req =(k-r)%k, count it freq[need] and freq[r]++ so tc=o(n), sc=o(k)
public class divisible_sum_pairs {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = countpairs(arr, n, k);
        System.out.print(x);
    }

    public static int countpairs(int[] arr, int n, int k){
//           int count = 0;
//
//           for(int i=0;i<n;i++){
//              int sum = 0;
//
//              for(int j=i+1;j<n;j++){
//                  sum = arr[i]+arr[j];
//
//                  if(sum % k ==0)count++;
//              }
//           }
//           return count;

        //optimal approch
        int count = 0;
        int[]freq = new int[k];

        for(int i=0;i<n;i++){

            int r = arr[i]%k;

            int req = (k-r)%k;

            count += freq[req];

            freq[r]++;
        }
        return count;
    }
}
