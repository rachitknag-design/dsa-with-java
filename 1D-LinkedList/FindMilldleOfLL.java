// 1. Count nodes to get size.

// 2. Compute middle position as (size + 1) / 2.

// 3. Traverse again to that position and return the node.

// Two passes, O(n) time, O(1) space.

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next = null;
    }
}

public class FindMilldleOfLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};

        Node head = new Node(arr[0]);

        Node temp = head;

        for(int i=1;i<arr.length;i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        printList(head);
        int size = findSizeOfLL(head);

        Node middleNode = findMiddleNode(head,size);
        System.out.println("The middle node is: "+middleNode.data+".");

    }


    private static Node findMiddleNode(Node head, int size) {
        if(head==null || head.next ==null) {
            return head;
        }
        int pos = (size+1)/2;

        int cnt = 0;
        Node temp = head;
        Node res = null;
        while (temp!=null) {
            cnt++;
            if(cnt==pos) {
                res = temp;
                break;
            }
            temp = temp.next;
        }
        return res;

    }

    private static int findSizeOfLL(Node head) {
        int cnt = 0;

        Node temp = head;
        while(temp!=null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }

    private static void printList(Node head) {
        if(head==null) {
            return;
        }

        Node temp = head;

        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;            
        }
        System.out.println();
    }
}
