public class Main {
    public static void main(String[] args) {
        LinkedListStackDemo stack = new LinkedListStackDemo();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty? " + stack.isEmpty());

    }
}