// Search an element in a Linked List

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class Program5 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};

        Node head = new Node(arr[0]);

        Node temp = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        printList(head);
        int val = 60;

        boolean isPresent = valueIsPresent(head,val);

        System.out.println("The value "+val+" is present in the List: "+isPresent);

    }

    private static boolean valueIsPresent(Node head, int val) {

        Node curr = head;

        while(curr!=null) {
            if(curr.data==val) {
                return true;
            }
            curr = curr.next;
        }
        return false;
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
