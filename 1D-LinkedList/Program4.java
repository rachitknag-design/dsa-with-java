//Find the Length of a Linked List

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        Node head = new Node(arr[0]);

        Node curr = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            curr.next = newNode;
            curr = newNode;
        }

       
        printList(head);

        
        int length = findLengthOfList(head);
        System.out.println("Length of the list is: "+length);
    }

    private static int findLengthOfList(Node head) {

        int length = 0;
        Node curr = head;

        while(curr!=null) {
            length++;
            curr = curr.next;
        }
       
        return length;
    }

    private static void printList(Node head) {
        if(head==null) {
            return;
        }

        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
