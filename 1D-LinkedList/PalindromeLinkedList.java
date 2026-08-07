import java.util.Stack;

class ListNode {
    int data;
    ListNode next;

    public ListNode(int data) {
        this.data = data;
        next = null;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        int[] arr = {10,10,20,10};
        ListNode head = new ListNode(arr[0]);

        ListNode temp = head;

        for(int i=1;i<arr.length;i++) {
            ListNode newNode = new ListNode(arr[i]);
            temp.next = newNode;
            temp = newNode;
        }

        // printList(head);

        boolean res = isPalindrome(head);
        System.out.println("is palindrome: "+res);
    }

    private static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        Stack<Integer> st = new Stack<>();

        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        while(slow!=null) {
            st.push(slow.data);
            slow = slow.next;
        }

        ListNode temp = head;
        while (!st.isEmpty()) {
            if(temp.data!=st.pop()){
                return false;
            }
            temp = temp.next;
        }
        return true;
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