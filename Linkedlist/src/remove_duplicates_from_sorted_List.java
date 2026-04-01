import java.util.*;
//approch
//iterate and chekc if curr data == curr.next data eql then skip curr point to next.next, else one time next
//tc=o(n),sc=O(1)
class Node {
    public boolean val;
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class remove_duplicates_from_sorted_list {
    static Node head;
    static Node temp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a1 = sc.nextInt();
        head = null;
        temp = null;
        addToTheLast(a1);

        for (int i = 1; i < n; i++) {
            int data = sc.nextInt();
            addToTheLast(data);
        }
        Solution ans = new Solution();
//        Node node = ans.solve555(head);
//        printList(node);
        System.out.println();
        sc.close();
    }

    public static void addToTheLast(int data) {
        if (head == null) {
            head = new Node(data);
            temp = head;
            return;
        } else {
            Node new_node = new Node(data);
            temp.next = new_node;
            temp = temp.next;
            return;
        }
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

class Solution78 {
    public Node solve555(Node head) {
       if(head ==null && head.next ==null)return head;

       Node curr = head;
       while(curr.next != null){
           if(curr.data == curr.next.data){
               curr.next = curr.next.next;
           }
           else{
               curr = curr.next;
           }
       }
       return head;
    }
}
