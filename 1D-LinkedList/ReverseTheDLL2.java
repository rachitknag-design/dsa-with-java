// Reverse a Doubly Linked List

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


public class ReverseTheDLL2 {
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
       if(head==null||head.next==null) {
        return head;
       }

       Node curr = head;
       Node prev = null;

       while(curr!=null) {

         // Save original next (to move forward in original list)
        Node newNext = curr.next;

        // Swap next and prev for current node
        curr.next = prev;
        curr.prev = newNext;

        // Move to next node in original list
        prev = curr;
        curr = newNext;
       }

        // prev is now the last node of original list → new head
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
