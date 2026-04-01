import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx
    }
}

public class Stock_Span_Problem{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] a) {

    }
}