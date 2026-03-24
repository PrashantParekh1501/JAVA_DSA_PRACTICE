import java.util.*;
//1st approch: using extra array sc=o(N)
//2nd approch: using two poinetr l= 0, r=n-1, swap num
//tc=o(N),sc=O(1)
public class reverse_of_array {

    public  int[] dorev(int[] arr) {
        int l= 0;
        int r = arr.length-1;

        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
        }

        return arr;
    }

    public void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int[]rev = dorev(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i] + " ");
        }
    }

    public static class largest_num_atleast_twice_of_others {

        private static int findidx(int[] arr) {
          int lar = Integer.MIN_VALUE;
          int idx = -1;

          for(int i=0;i<arr.length;i++){
              if(arr[i]>lar) {
                  lar = arr[i];
                  idx = i;
              }
          }

          boolean istwice = true;
          for(int j=0;j<arr.length;j++){
              if(j!=idx && 2*arr[j]>lar)istwice = false;break;
          }

          return (istwice)?idx:-1;
        }


        public static void main(String[]args){
             Scanner sc = new Scanner(System.in);
             int n = sc.nextInt();
             int[]arr = new int[n];
             for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
             }
             int ans = findidx(arr);
             System.out.print(ans);
         }


    }
}
