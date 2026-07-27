class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }


}

public class Program1 {
    
    public static void main(String[] args) {
        Node head = new Node(10);

        Node second = new Node(20);
        head.next = second;

        Node third = new Node(30);
        second.next = third;

        System.out.println("The linkedList elements are:"); 
        print(head);
    }

    private static void print(Node head) {
        if(head==null){
            return;
        }

        Node temp = head;

        while(temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
