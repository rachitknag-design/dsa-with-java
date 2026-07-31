// Reverse a Linked List

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class ReverseAnLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,70};

        Node head = new Node(arr[0]);

        Node temp = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }
        System.out.println("Original List:");
        printList(head);

        System.out.println("Reversed List:");
        head = reverseList(head);
        printList(head);
    }

    private static Node reverseList(Node head) {

        Node prev = null;
        Node temp = head;

        while(temp!=null) {
            Node front = temp.next;
            temp.next = prev;

            prev = temp;
            temp = front;
        }

        return prev;
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
