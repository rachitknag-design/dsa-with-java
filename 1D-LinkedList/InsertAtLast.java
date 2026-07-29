// Insert at end of Doubly Linked List

class Node {
    int data;

    Node next;
    Node prev;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class InsertAtLast {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

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

        int key = 100;
        System.out.println("List after modification: ");
        head = insertAtLast(head,key);
        printList(head);
    }

    private static Node insertAtLast(Node head, int key) {
        Node newNode = new Node(key);

        if(head==null) {
            return newNode;
        }

        Node temp = head;

        while(temp.next!=null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;

        return head;
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
