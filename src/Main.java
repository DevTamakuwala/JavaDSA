import Stack.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(2);
        stack.push(5);
        stack.push(5);

        stack.printStack();
        System.out.println();
        stack.pop();

        stack.push(8);
        stack.push(12);

        stack.printStack();
    }
}