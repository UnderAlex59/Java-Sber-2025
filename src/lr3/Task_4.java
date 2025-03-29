package lr3;

public class Task_4 {
    public static void main(String[] args) {
        Node<Integer> node0 = new Node<>(0, null);
        Node<Integer>  node1 = new Node<>(1, null);
        Node<Integer>  node2 = new Node<>(2, null);
        Node<Integer>  node3 = new Node<>(3, null);
        Node<Integer>  node4 = new Node<>(4, null);
        node0.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        Node<Integer> ref = node0;
        while (ref!=null){
            System.out.println(ref.value);
            ref = ref.next;
        }

    }
    static class Node<T> {
        public T value;

        public Node<T> next;

        Node(T value, Node<T> next){
            this.value = value;
            this.next = next;
        }
    }
}
