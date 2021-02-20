package Stack;

import java.util.Stack;

public class DetectDuplicateParenthesis
{
    static boolean getDuplicate(String exp) {

        Stack<Character> Stack = new Stack<>();
        char[] str = exp.toCharArray();
        for (char ch : str) {
            if (ch == ')') {
                char top = Stack.peek();
                Stack.pop();
                int elementsInside = 0;
                while (top != '(') {
                    elementsInside++;
                    top = Stack.peek();
                    Stack.pop();
                }
                if (elementsInside < 1) {
                    return true;
                }
            }
            else {
                Stack.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "(((a+(b))+(c+d)))";

        if (getDuplicate(str)) {
            System.out.println("Duplicates Found ");
        } else {
            System.out.println("No Duplicates Found ");
        }

    }
}