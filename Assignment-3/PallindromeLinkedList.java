package day3;

import java.util.*;

public class PallindromeLinkedList {

    static boolean isPalindrome(Node head)
    {

        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();

        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }

        while (head != null) {

            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

    public static void main(String[] args) {
        Node one = new Node(1);
        one.next = new Node(2);
        one.next.next = new Node(3);
        one.next.next.next = new Node(2);
        one.next.next.next.next = new Node(1);

        boolean isPalli = isPalindrome(one);
        if(isPalli)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
    }
}
