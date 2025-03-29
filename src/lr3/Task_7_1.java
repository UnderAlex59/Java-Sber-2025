package lr3;

public class Task_7_1 {
    public static void main(String[] args) {
        Task_4.Node<Integer> node0 = new Task_4.Node<>(0,null);

        Task_4.Node<Integer> temp = node0;
        for (int i = 1; i < 10; i++) {
            temp.next = new Task_4.Node<Integer>(i, null);
            temp = temp.next;
        }

        temp = node0;
        do {
            System.out.println(temp.value);
            temp = temp.next;
        } while (temp != null);

    }
}


