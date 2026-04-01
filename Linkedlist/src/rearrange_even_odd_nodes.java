import java.util.*;

class Node567 {
    int val;
    Node next;

    Node567(int d) {
        val = d;
        next = null;
    }
}

class LinkedList900 {
    Node head, tail;

    void push(Node new_node) {
        if (head == null) {
            head = tail = new_node;
            return;
        }
        tail.next = new_node;
        tail = new_node;
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    public static LinkedListNode sort01(LinkedListNode head) {

    }

    public Node rearrangeList(Node head) {

        Node even = new Node(-1);
        Node odd = new Node(-1);

        Node curreven = even;
        Node currodd = odd;
        Node curr = head;

        while (curr != null) {
            if (curr.data % 2 == 0) {
                curreven.next = curr;
                curreven = curreven.next;
            } else {
                currodd.next = curr;
                currodd = currodd.next;
            }
            curr = curr.next;
        }

        curreven.next = odd.next;
        currodd.next = null;

        return even.next;
    }

    public Node rotate(Node head, int k) {
        if (head == null || head.next == null) return head;

        Node curr = head;
        int len = 1;

        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        curr.next = head; // make circular

        k = k % len;
        int steps = len - k;

        Node newTail = head;
        for (int i = 1; i < steps; i++) {
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}

public class rearrange_even_odd_nodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList llist = new LinkedList();

        int h1 = sc.nextInt();
        Node head = new Node(h1);
        llist.push(head);

        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            llist.push(new Node(data));
        }

        Solution obj = new Solution();
        head = obj.rearrangeList(head);

        llist.printList(head);
        sc.close();
    }
}