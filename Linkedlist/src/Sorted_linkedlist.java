import java.util.*;
//approch
//iterate and check if curr data is more than my curr.next data ret false;
//else ret true//tc=O(n),sc=O(1)
public class Sorted_linkedlist {
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

        Accio A = new Accio();
        boolean issorted = A.checkListSorted(llist.head);
        System.out.print(issorted? "YES" : "NO");

    }
}

class Node10
{
    int data;
    Node next;
    Node10(int d) {data = d; next = null; }
}

class LinkedList2
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
    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}

class Accio
{
    static boolean checkListSorted(Node head)  //TC = O(n), sc =o(1)
    {
        Node curr = head;

        while(curr.next!=null){
            if(curr.data > curr.next.data)return false;
            curr = curr.next;
        }
        return true;
    }
}