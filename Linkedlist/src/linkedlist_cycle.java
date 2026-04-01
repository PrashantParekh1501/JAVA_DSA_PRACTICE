//import java.util.*;
//
//class Node555 {
//    int val;
//    Node next;
//
//    Node555(int d) {
//        val = d;
//        next = null;
//    }
//}
//
//class LinkedList789 {
//    Node head, tail;
//
//    void push(Node new_node) {
//        if (head == null && tail == null) {
//            head = tail = new_node;
//            return;
//        }
//        tail.next = new_node;
//        tail = new_node;
//    }
//
//    void printList(Node head) {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//    }
//}
//
//class Solution {
//
////    public Node solve555(Node head) {
////        Node evenDummy = new Node(-1);
////        Node oddDummy = new Node(-1);
////
////        Node even = evenDummy;
////        Node odd = oddDummy;
////
////        Node curr = head;
////
////        while(curr != null){
////            if(curr.data % 2 == 0){
////                even.next = curr;
////                even = even.next;
////            } else {
////                odd.next = curr;
////                odd = odd.next;
////            }
////            curr = curr.next;
////        }
////
////        // important: break last links
////        even.next = oddDummy.next;
////        odd.next = null;
////
////        return evenDummy.next;
////    }
//
//    public Node rearrangeList(Node head) {
//        Node evenDummy = new Node(-1);
//        Node oddDummy = new Node(-1);
//
//        Node even = evenDummy;
//        Node odd = oddDummy;
//
//        Node curr = head;
//
//        while(curr != null){
//            if((curr.data % 2) == 0){
//                even.next = curr;
//                even = even.next;
//            } else {
//                odd.next = curr;
//                odd = odd.next;
//            }
//            curr = curr.next;
//        }
//
//        // important: break last links
//        even.next = oddDummy.next;
//        odd.next = null;
//
//        return evenDummy.next;
//    }
//
//    public Node rotate(Node head, int k) {
//    }
//}
//
//public class linkedlist_cycle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        LinkedList llist = new LinkedList();
//        int h1 = sc.nextInt();
//        Node head = new Node(h1);
//        llist.push(head);
//        for (int i = 1; i < n; i++) {
//            int data = sc.nextInt();
//            llist.push(new Node(data));
//        }
//        llist.printList(head);
//        Solution Obj = new Solution();
//        head = Obj.rearrangeList(head);
//        sc.close();
//    }
//}