package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
            length++;
        }
    }

    public void printList() {
        if (length > 0) {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        } else {
            System.out.println("List has no value.");
        }
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void headValue() {
        if (length == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Head is " + head.value);
        }
    }

    public void tailValue() {
        if (length == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Tail is " + tail.value);
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
            length++;
        }
    }

    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index >= length) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public void length() {
        if (length == 0) {
            System.out.println("The list is empty");
        } else {
            System.out.println("Length is " + length);
        }
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length ) return false;

        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }

        Node temp = get(index - 1);
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index<0 || index >=length) return null;

        if (index == 0){
            return removeFirst();
        }
        if (index == length -1) return  removeLast();
        Node pre = get(index -1);
//        Node temp = get(index);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;
        Node after;
        Node before = null;

        for (int i = 0; i <length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }



    public static class Node {
        public int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
