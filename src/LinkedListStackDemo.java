public class LinkedListStackDemo {
    private Node top;

    public LinkedListStackDemo() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed element: " + value);
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedElement = top.data;
        top = top.next;
        System.out.println("Popped element: " + poppedElement);
        return poppedElement;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }
}
