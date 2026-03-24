import java.util.*;
//[1,2,3,4,5]
//5,4
//1st approch: using two pass in one pass check max ele and also store idx then 2nd pass check seclar and check seclar != max && seclar idx not match with max idx
//tc=o(n),sc=o(1)

//2nd approch: using one pass if curr ele > max update max else check curr ele > sec && sec!=max then update sec
//tc=o(n),sc=o(1) preffered sol

public class second_largest_element {

    public static int findsec(int[]arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]> max) {
                sec = max;
                max = arr[i];
            }
            else if(arr[i] > sec && arr[i] != max)sec = arr[i];
        }
        return sec;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int ans = findsec(arr);
        System.out.println(ans);
    }
}

