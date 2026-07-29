// Reverse a Doubly Linked List
//This is using stack 

import java.util.Stack;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}


public class ReverseTheDLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        Node head = new Node(arr[0]);

        Node temp = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            newNode.prev = temp;
            temp.next = newNode;
            temp = newNode;
        }

        System.out.println("List before modification: ");
        printList(head);

        System.out.println("List after modification: ");
        head = reverseList(head);
        printList(head);
    }

    private static Node reverseList(Node head) {
        if(head==null) {
            return null;
        }

        if(head.next == null) {
            return head;
        }

        Stack<Integer> st = new Stack<>();

        Node temp = head;
        while(temp!=null) {
            st.push(temp.data);
            temp = temp.next;
        }

        Node newHead = new Node(st.pop());
        Node temp1 = newHead;
        while(!st.isEmpty()) {
            Node newNode = new Node(st.pop());
            newNode.prev = temp1;
            temp1.next = newNode;
            temp1 = newNode;
        }
        return newHead;
    }

    private static void printList(Node head) {
        if(head==null) {
            return;
        }

        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
