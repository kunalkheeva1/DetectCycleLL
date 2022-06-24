public class DetectCycleLL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node detectCycleLL(Node head){

        Node slow =head, fast= head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(fast== slow){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;

                }return slow;

            }
        }return null;
    }

    public static void main(String[] args) {

    }
}
