class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DeleteLastNode {
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

        System.out.println("List before Modification: ");
        printList(head);

        System.out.println("List after modification: ");
        head = deleteLastNode(head);
        printList(head);
    }

    private static Node deleteLastNode(Node head) {
        if(head==null||head.next==null) {
            return null;
        }

        Node temp = head;

        while(temp.next.next!=null) {
            temp = temp.next;
        }
        temp.next.prev = null;
        temp.next = null;

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
