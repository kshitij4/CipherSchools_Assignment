package Stack;

import java.util.Deque;
import java.util.LinkedList;

public class LargestInKWindow {
    public static void printMaximum(int [] arr, int k) {

        Deque<Integer> deque = new LinkedList<>();

        int i;
        for(i = 0; i < k; i++) {
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        for(; i < arr.length; i++) {
            System.out.print(arr[deque.peek()]+" ");

            if(!deque.isEmpty() && deque.peek() <= i - k) {
                deque.removeFirst();
            }
            while(!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        System.out.print(arr[deque.peek()] + " ");
    }

    public static void main(String[] args) {

        int [] arr = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};

        printMaximum(arr, 4);

    }
}