package LinkedList;

public class IntersectionPointLinkedList {

    public static Node getIntersectionNode(Node list1, Node list2) {
        if(list1==null || list2==null) return null;
        Node ptr1 = list1;
        Node ptr2 = list2;
        int x = 0;
        while(x<3){
            while(ptr1!=null && ptr2!=null){
                if(ptr1.data ==ptr2.data) return ptr1;
                ptr2 = ptr2.next;
                ptr1 = ptr1.next;
            }
            if(ptr1  == null )  ptr1 = list2;
            else ptr2 = list1;
            x++;
        }
        return null;
    }

    public static void main(String[] args)
    {
        Node node1 = new Node(3);
        node1.next = new Node(6);
        node1.next.next = new Node(9);
        node1.next.next.next = new Node(15);
        node1.next.next.next.next = new Node(30);

        Node node2 = new Node(10);
        node2.next = new Node(15);
        node2.next.next = new Node(30);

        Node result = getIntersectionNode(node1,node2);
        System.out.println("The node of intersection is " + result.data);
    }
}
