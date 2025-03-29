package lr3;

import lr3.Task_4.Node;

public class Task_8 {
    public static void main(String[] args) {
        CustomLinkedList<Integer> test1 = new CustomLinkedList<>();
        CustomLinkedList<Integer> test2 = new CustomLinkedList<>(0);
        System.out.println("\n" + "-".repeat(30) + "Проверка конструкторов" + "-".repeat(30));
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка createHead" + "-".repeat(30));
        test1.createHead(1);
        test2.createHead(1);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка createTail" + "-".repeat(30));
        test1.createTail(2);
        test2.createTail(2);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка addFirst" + "-".repeat(30));
        test1.addFirst(3);
        test2.addFirst(3);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка addLast" + "-".repeat(30));
        test1.addLast(4);
        test2.addLast(4);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка insert" + "-".repeat(30));
        test1.insert(4, 5);
        test2.insert(4, 5);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка removeFirst" + "-".repeat(30));
        test1.removeFirst();
        test2.removeFirst();
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка removeLast" + "-".repeat(30));
        test1.removeLast();
        test2.removeLast();
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка remove" + "-".repeat(30));
        test1.remove(1);
        test2.remove(1);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
        System.out.println("\n" + "-".repeat(30) + "Проверка createTailRec" + "-".repeat(30));
        test1.createTailRec(6);
        test2.createTailRec(6);
        System.out.println("test1: " + test1);
        System.out.println("test2: " + test2);
        System.out.println("test1: " + test1.toStringRec());
        System.out.println("test2: " + test2.toStringRec());
    }



    static class CustomLinkedList<T> {
        private Node<T> head;
        private Integer size;

        CustomLinkedList(){
            this.head = null;
            this.size = 0;
        }

        CustomLinkedList(T value){
            this.head = new Node<T>(value, null);
            this.size = 1;
        }


        public Integer size(){
            return size;
        }

        public void createHead(T value){
            if (!size.equals(0)){
                this.head = new Node<T>(value, this.head);
            }
            else this.head = new Node<T>(value, null);
            this.size++;
        }

        public void createTail(T value){
            if (!size.equals(0)){
                Node<T> temp = this.head;
                while(temp.next != null) temp = temp.next;
                temp.next = new Node<T>(value, null);
            }
            else head = new Node<T>(value, null);
            this.size++;

        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder("CustomLinkedList: [");
            if (size.equals(0)) return stringBuilder.append("]").toString();
            Node<T> temp = head;
            while (temp.next != null){
                stringBuilder.append(temp.value).append(", ");
                temp = temp.next;
            }
            stringBuilder.append(temp.value).append("]");
            return stringBuilder.toString();
        }

        //Поскольку логика добавления элементов в начало и конец уже реализована в методах createHead и
        //createTail, то я просто их использую
        public void addFirst(T value){
            createHead(value);
        }

        public void addLast(T value){
            createTail(value);
        }

        public void insert(Integer index, T value){
            if (index < 0) {
                System.out.println("Индексы связанного списка не могут быть меньше 0");
                return;
            }

            if (index > size) {
                System.out.println("Указанный индекс выходит за рамки массива.\nМаксимально возможный индекс - " + (size));
                return;
            }
            if (index.equals(0)){
                if (this.size.equals(0)) {
                    createHead(value);
                    return;
                }
                this.head = new Node<T>(value, this.head);
                this.size++;
                return;
            }
            Node<T> temp = head;
            for (int i = 0; i < index-1; i++) {
                temp = temp.next;
            }
            temp.next = new Node<T>(value, temp.next);
            this.size++;
        }

        public void removeFirst(){
            if (size.equals(0)) {
                System.out.println("В списке нет элементов");
                return;
            }
            this.head = head.next;
            this.size--;
        }

        public void removeLast(){
            if (size.equals(0)) {
                System.out.println("В списке нет элементов");
                return;
            }
            if (size.equals(1)){
                this.head = null;
                this.size--;
                return;
            }

            Node<T> temp = this.head;
            for (int i = 1; i < size-1; i++) {
                temp = temp.next;
            }
            temp.next = null;
            this.size--;
        }

        public void remove(Integer index){
            if (index < 0) {
                System.out.println("Индексы связанного списка не могут быть меньше 0");
                return;
            }
            if (index > size-1) {
                System.out.println("Указанный индекс выходит за рамки массива.\nМаксимально возможный индекс для удаления - " + (size-1));
                return;
            }
            if (index.equals(0)){
                if (this.size.equals(1)){
                    this.head = null;
                    this.size--;
                    return;
                }
                this.head = this.head.next;
                this.size--;
                return;
            }

            if (index.equals(size-1)) {
                removeLast();
                return;
            }

            Node<T> temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            this.size--;
        }

        //Я не знаю, где тут нунжа рекурсия, поэтому оставил обычный createHead
        public void createHeadRec(T value){
            createHead(value);
        }

        public void createTailRec(T value){
            if (size.equals(0)){
                this.head = new Node<T>(value, null);
                this.size++;
            }
            Node<T> lastNode = findEndNode(this.head);
            lastNode.next = new Node<T>(value, null);
            this.size++;
        }
        //Вспомогательный рекурсивный метод для поиска конечного узла
        private Node<T> findEndNode(Node<T> node){
            if (node.next == null) return node;
            else return findEndNode(node.next);
        }

        public String toStringRec(){
            StringBuilder stringBuilder = new StringBuilder("CustomLinkedList: [");
            if (size.equals(0)) return stringBuilder.append("]").append(" - рекурсивная версия toString").toString();
            stringBuilder.append(this.head.value);
            return recStringAppend(stringBuilder, this.head.next).append("]").append(" - рекурсивная версия toString").toString();
        }

        //Вспомогательная для toStringRec функция, которая рекурсивно собирает все элементы списка в строку
        private StringBuilder recStringAppend(StringBuilder stringBuilder, Node<T> node){
            if(node == null) return stringBuilder;
            stringBuilder.append(", ").append(node.value);
            if (node.next != null){
                return recStringAppend(stringBuilder, node.next);
            }
            else return stringBuilder;
        }

    }
}
