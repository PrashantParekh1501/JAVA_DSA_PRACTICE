import java.util.*;

class Solution5555 {
    static LinkedListNode sort01(LinkedListNode head){
        LinkedListNode curr = head;
        LinkedListNode zeros = new LinkedListNode(-1);
        LinkedListNode ones = new LinkedListNode(-1);
        LinkedListNode currzeros = zeros;
        LinkedListNode currones = ones;

        while(curr!=null){
            if(curr.data == 0){
                currzeros.next = curr;
                currzeros = currzeros.next;
            }
            else{
                currones.next = curr;
                currones = currones.next;
            }
            curr = curr.next;
        }
        currzeros.next = ones.next;
        currones.next = null;
        return zeros.next;

    }
}

class LinkedListNode  {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data)  {
        this.data = data;
    }
}

public class sort_of_os_1s {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode head = new LinkedListNode(sc.nextInt());
        LinkedListNode a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode temp = new LinkedListNode(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}