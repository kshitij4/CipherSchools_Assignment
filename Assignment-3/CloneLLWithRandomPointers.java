package LinkedList;

public class CloneLLWithRandomPointers {
    public static Node createClone(Node head) {

        Node node = head;

        while(node != null && node.next != null) {
            Node clone = new Node(node.data);
            Node next = node.next;
            node.next = clone;
            clone.next = next;
            node = node.next.next;
        }
        node.next = new Node(node.data);

        node = head;

        while(node != null && node.next != null) {

            if(node.random != null) {
                node.next.random = node.random.next;
            }
            node = node.next.next;
        }

        node = head;
        Node clone = head.next;
        Node cloneHead = head.next;


        while(node.next != null && clone.next != null) {
            node.next = node.next.next;
            clone.next = clone.next.next;
            node = node.next;
            clone = clone.next;
        }

        node.next = null;

        return cloneHead;

    }

    public static void printRandomList(Node head) {
        Node current = head;

        while(current != null) {
            System.out.println(current.data  + " Random pointer : " + current.random.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.next = node2;
        head.random = node3;

        node2.next = node3;
        node2.random = node3;

        node3.random = head;

        Node newClonedHead = createClone(head);

        printRandomList(newClonedHead);
    }
}
