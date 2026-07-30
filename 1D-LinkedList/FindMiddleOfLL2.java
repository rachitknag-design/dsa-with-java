// Uses slow–fast pointers (1 step vs 2 steps).
// Stops when fast can’t move two steps.
// slow is then at the middle.
// Odd length → exact middle; even length → second middle.
// Time: O(n), Space: O(1).

class Node  {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}
public class FindMiddleOfLL2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        Node head = new Node(arr[0]);

        Node temp = head;
        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        System.out.println("Printing List: ");
        printList(head);

        Node middleNode = findMiddleNode(head);
        System.out.println("The middle node is: "+middleNode.data+".");
    }   

    private static Node findMiddleNode(Node head) {
        if(head==null||head.next==null) {
            return head;
        }

        Node slow = head;
        Node fast = head;
        
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private static void printList(Node head){
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
