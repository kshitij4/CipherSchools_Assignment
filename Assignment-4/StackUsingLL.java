package Stack;

  class Stack {
      private static class Node {

          int data;
          Node next;
      }
      private Node top;

      public Stack() {
          this.top = null;
      }

      public void push(int x) {
          Node node = new Node();
          if(node == null)
          {
              System.out.println(" Overflow");
          }
          node.data = x;
          node.next = top;
          top = node;
      }

      public boolean isEmpty() {
          return top == null;
      }

      public int peek() {
          if (!isEmpty()) {
              return top.data;
          } else {
              System.out.println("Stack is empty");
              return -1;
          }
      }

      public void pop() {
          if (top == null) {
              System.out.println(" Underflow");
              return;
          }
          System.out.println(top.data + " popped");
          top = top.next;
      }

      public void display() {
          if (top == null) {
              System.out.println(" Underflow");
          } else {
              Node temp = top;
              while (temp != null) {
                  System.out.print(temp.data + "->");
                  temp = temp.next;
              }
          }
      }
  }
    public class StackUsingLL{

      public static void main(String[] args)
      {
        Stack obj = new Stack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        obj.display();
        System.out.println("\nElement at the top of the Stack :" + obj.peek());

        obj.pop();
        obj.pop();

        obj.display();
        System.out.println("\nElement at the top of the Stack :" + obj.peek());
    }
}


