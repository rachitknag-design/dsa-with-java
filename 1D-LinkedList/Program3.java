//Delete Last Node of Linked List

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Program3 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        
        Node head = new Node(arr[0]);

        Node cur = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            cur.next = newNode;
            cur = newNode;
        }

        System.out.println("Orginal LinkedList: ");
        printList(head);

        System.out.println("LinkedList after deleteing last node: ");
        head = deleteLastNode(head);
        printList(head);
    }

    private static Node deleteLastNode(Node head) {
        if(head==null||head.next==null) {
            return null;
        }

        Node cur = head;

        while(cur.next.next!=null) {
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }

    private static void printList(Node head) {
        if(head==null) {
            return;
        }

        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
         System.out.println();
    }
}
