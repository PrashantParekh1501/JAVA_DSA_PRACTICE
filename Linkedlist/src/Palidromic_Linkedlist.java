import java.util.*;
//1st appeoch add all ele into array and solve using two pointer tc=o(n),sc=O(n)
//2nd approch: using slow,fast find the mid, then rev second half, then compare both halves,tc=O(n),sc=O(1)
public class Palidromic_Linkedlist {
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

        hellosol A = new hellosol();
        A.checkLinkedListPalindrome(llist.head);

    }
}

class Node6
{
    int data;
    Node next;
    Node6(int d) {data = d; next = null; }
}

class LinkedList
{
    Node head;
    Node tail;
    public void addToTheLast(Node node)
    {
        if (head == null)
        {
            head = node;
            tail = node;
        }
        else
        {
            tail.next = node;
            tail = node;
        }
    }
    void printList(Node head)
    {
        Node temp = this.head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void makeLoop(Node head, int pos) {
        if (pos == 0)
            return;
        Node curr = head;
        Node last = head;

        int currentPosition = 1;
        while (currentPosition < pos)
        {
            curr = curr.next;
            currentPosition++;
        }

        while (last.next != null)
            last = last.next;
        last.next = curr;
    }

    public void push(Node head) {

    }
}


class hellosol
{
    static void checkLinkedListPalindrome(Node head)
    {
        //find the mid
       Node slow = head;
       Node fast = head;

       while(fast!=null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }

       //rev second half
        Node prev = null;
       while(slow !=null){
          Node next = slow.next;
          slow.next = prev;
          prev = slow;
          slow= next;
       }

       Node first = head;
       Node sec = prev;
      boolean is = false;

       while(sec != null){
           if(first .data != sec.data){
               is = true;
               System.out.println("NO");
               return;
           }
           first = first.next;
           sec = sec.next;
       }

     if(!is)  System.out.print("YES");

    }

}