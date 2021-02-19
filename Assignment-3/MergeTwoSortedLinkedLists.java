package LinkedList;

public class MergeTwoSortedLinkedLists{

    public static Node sortedMerge(Node list1, Node list2)
        {
            if(list1 == null)
                return list2;
            if(list2 == null)
                return list1;
            if(list1.data < list2.data)
            {
                list1.next = sortedMerge(list1.next, list2);
                return list1;
            }
            else
            {
                list2.next = sortedMerge(list1, list2.next);
                return list2;
            }
        }

        public static void main(String []args)
        {
            Node head = new Node(10);
            head.next = new Node(20);
            head.next.next = new Node(30);
            System.out.println("first list: ");
            Node.printList(head);
            
            Node head2 = new Node(5);
            head2.next = new Node(15);
            head2.next.next = new Node(25);
            System.out.println("Second list: ");
            Node.printList(head2);

            Node result = sortedMerge(head,head2);

            System.out.println("Merged sorted list: ");
            Node.printList(result);


        }
    }


