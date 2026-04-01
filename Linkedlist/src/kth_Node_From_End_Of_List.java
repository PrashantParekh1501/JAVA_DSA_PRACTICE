import java.util.*;
 //approch
//first find size then find loop = size-k; loop times itarte and then ret curr node which is kth node from last
//tc=o(N),sc=O(1)
public class kth_Node_From_End_Of_List {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node a = head;
        for(int i=1;i<n;i++) {
            Node temp = new Node(sc.nextInt());
            a.next = temp;
            a = a.next;
        }
        Node ans = Solutionhell.findKthFromLast(head, k,n);
        System.out.println(ans.data);
    }
}

class Node3{
    int data;
    Node next;

    Node3(int data, Node next){
        this.data = data;
        next = null;
    }
}

class Solutionhell {
    static Node findKthFromLast(Node head, int k, int n) {
        int size = findsize(head);
        int loop = size - k;
        Node curr = head;

        while(loop > 0){
            curr = curr.next;
            loop--;
        }
        return curr;
    }
    public static int findsize(Node head){
        int n = 0;

        while(head != null){
            n++;
            head = head.next;
        }
        return n;
    }
}

