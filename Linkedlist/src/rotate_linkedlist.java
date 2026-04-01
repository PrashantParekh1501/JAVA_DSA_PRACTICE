import java.util.*;
//approch
//1st base case is if head is null or head.next is null ret head,
//iterate find len, make circular, find new tail, then make newhead by newtail.next, then newtail.next=null
//tc=O(n),sc=O(1)


public class rotate_linkedlist {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList llist= new LinkedList();
        int a1=sc.nextInt();
        Node head= new Node(a1);
        llist.addToTheLast(head);
        for (int i = 1; i < n; i++)
        {
            int a = sc.nextInt();
            llist.addToTheLast(new Node(a));
        }
        int k = sc.nextInt();
        Solution A = new Solution();
        llist.head = A.rotate(llist.head, k);
        llist.printList(head);

    }
}

class Node5
{
    int data;
    Node next;
    Node5(int d) {data = d; next = null; }
}

class Solution33
{
    public static Node rotate(Node head, int k){
      if(head ==null || head.next == null)return head;

       //find len
        int len = 1;
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
            len++;
        }

        if(len == k)return head;

        //make as circular
        curr.next = head;

        //steps times itarte
        Node newtail = head;
        k = k%len;
        k = len - k;

        int steps = len - k;
        for(int i=1;i<steps;i++){
            newtail = newtail.next;
        }

        //create newhead;
        Node newhead = newtail.next;
        newtail.next = null;

        return newhead;
    }
}