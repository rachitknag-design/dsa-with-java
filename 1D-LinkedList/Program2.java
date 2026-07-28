class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Program2 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};


        Node head = new Node(arr[0]);
    
        Node temp = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        System.out.println("before adding at the head:");
        printLinkedList(head);

        int data = 100;
        System.out.println("After adding at head:");
        head = insertAtHead(head,data);
        printLinkedList(head);

    }

    static void printLinkedList(Node head) {
        if(head == null) return;

        Node temp = head;

        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node insertAtHead(Node head, int data) {
        if(head==null) {
            return new Node(data);
        }

        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        return head;
    }

}
