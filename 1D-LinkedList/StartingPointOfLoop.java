class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        next = null;
    }


}

public class StartingPointOfLoop {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};

        ListNode head = new ListNode(arr[0]);

        ListNode temp = head;
        ListNode cyc = null;
        for(int i=1;i<arr.length;i++) {
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            temp = newNode;

            if(i==2) {
                cyc = newNode;
            }
        }

        temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = cyc;

        // printList(head);

        ListNode start = findStartOfLoop(head);
        if(start!=null) {
            System.out.println("Start of loop is: "+start.data);
        } else {
            System.out.println("NO CYCLE");
        }
        
    }

    private static ListNode findStartOfLoop(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find the starting node of the cycle
                ListNode ptr = head;

                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }

                return ptr;
            }
        }

        // No cycle found
        return null;
    }

    private static void printList(ListNode head) {
        if(head==null) {
            return;
        }
        ListNode temp = head;
        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
