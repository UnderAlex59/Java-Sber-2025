package lr3;

public class Task_7_2 {
    public static void main(String[] args) {
        Task_4.Node<Integer> node0 = new Task_4.Node<>(0, null);
        for (int i = 1; i < 10; i++) {
            Task_4.Node<Integer> node = new Task_4.Node<>(i, node0);
            node0 = node;
        }

        Task_4.Node<Integer> temp = node0;

        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
