import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {
        Stack S= new Stack();
        S.push("A");
        S.push("B");
        S.push("C");
        System.out.println(S);
        S.pop();
        S.pop();
        System.out.println(S);
        S.push("D");
        S.push("E");
        System.out.println(S);
        S.peek();
        System.out.println(S.empty());
        System.out.println(S.search("A"));
        System.out.println(S.search("C"));
    }
}
