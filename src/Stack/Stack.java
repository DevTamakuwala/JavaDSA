package Stack;

public class Stack {

    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        if (height > 0){
            System.out.println("Top: " + top.value);
        } else {
            System.out.println("Stack is empty.");
        }
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void push(int value){
        Node newNode = new Node(value);
        if (height != 0) {
            newNode.next = top;
        }
        top = newNode;
        height++;
    }

    public void pop(){
        Node temp = top;
        if (height == 0){
            System.out.println("Stack is empty.");
        } else if (height == 1) {
            top = null;
        } else {
            top = temp.next;
            temp.next = null;
        }
        height--;
    }
}
