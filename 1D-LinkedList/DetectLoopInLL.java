// Detect a Cycle in a Linked List

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        next = null;
    }
}

public class DetectLoopInLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        ListNode cyc = null;

        for(int i=1;i<arr.length;i++) {
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            temp = temp.next;
            if(i==3){
                cyc = newNode;
            }
        }
        temp = head;
        while(temp.next!=null) {
            temp = temp.next;
        }
        temp.next = cyc;

    
        // printList(head);

        boolean isCycle1 = detectCycleInLL1(head);
        System.out.println("The LinkedList has cycle(Approach 1): "+isCycle1+".");

        boolean isCycle2 = detectCycleInLL2(head);
        System.out.println("The LinkedList has cycle(Approach 2): "+isCycle2+".");

    }

    private static boolean detectCycleInLL2(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;

             if(slow==fast){ return true;}
        }
        return false;
    }

    private static boolean detectCycleInLL1(ListNode head) {
        if(head==null || head.next ==null) {
            return false;
        }

        Set<ListNode> st = new HashSet<>();
        ListNode temp = head;
        while(temp!=null) {
            if(st.contains(temp)){
                return true;
            }
            st.add(temp);
            temp = temp.next;
        }
        return false;
    }
}
