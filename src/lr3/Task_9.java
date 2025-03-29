package lr3;

import java.util.*;

public class Task_9 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        fillArrayList(arrayList);
        fillArrayDeque(arrayDeque);
        fillTreeMap(treeMap);
        System.out.println("\n" + "-".repeat(30) + "операции добавления в начало" + "-".repeat(30));
        System.out.println("Время выполнения операции добавления в начало arrayList = " + addFirstArrayList(arrayList));
        System.out.println("Время выполнения операции добавления в начало arrayDeque = " + addFirstArrayDeque(arrayDeque));
        System.out.println("Время выполнения операции добавления в начало treeMap = " + addFirstTreeMap(treeMap));

        arrayList = new ArrayList<>();
        arrayDeque = new ArrayDeque<>();
        treeMap = new TreeMap<>();
        fillArrayList(arrayList);
        fillArrayDeque(arrayDeque);
        fillTreeMap(treeMap);
        System.out.println("\n" + "-".repeat(30) + "операции добавления в конец" + "-".repeat(30));
        System.out.println("Время выполнения операции добавления в конец arrayList = " + addLastArrayList(arrayList));
        System.out.println("Время выполнения операции добавления в конец arrayDeque = " + addLastArrayDeque(arrayDeque));
        System.out.println("Время выполнения операции добавления в конец treeMap = " + addLastTreeMap(treeMap));

        arrayList = new ArrayList<>();
        arrayDeque = new ArrayDeque<>();
        treeMap = new TreeMap<>();
        fillArrayList(arrayList);
        fillArrayDeque(arrayDeque);
        fillTreeMap(treeMap);
        System.out.println("\n" + "-".repeat(30) + "операции добавления в середину" + "-".repeat(30));
        System.out.println("Время выполнения операции добавления в середину arrayList = " + addMiddleArrayList(arrayList));
        System.out.println("Время выполнения операции добавления в середину treeMap = " + addMiddleTreeMap(treeMap));

        arrayList = new ArrayList<>();
        arrayDeque = new ArrayDeque<>();
        treeMap = new TreeMap<>();
        fillArrayList(arrayList);
        fillArrayDeque(arrayDeque);
        fillTreeMap(treeMap);
        System.out.println("\n" + "-".repeat(30) + "операции удаления с начала" + "-".repeat(30));
        System.out.println("Время выполнения операции удаления с начала arrayList = " + delFirstArrayList(arrayList));
        System.out.println("Время выполнения операции удаления с начала arrayDeque = " + delFirstArrayDeque(arrayDeque));
        System.out.println("Время выполнения операции удаления с начала treeMap = " + delFirstTreeMap(treeMap));

        arrayList = new ArrayList<>();
        arrayDeque = new ArrayDeque<>();
        treeMap = new TreeMap<>();
        fillArrayList(arrayList);
        fillArrayDeque(arrayDeque);
        fillTreeMap(treeMap);
        System.out.println("\n" + "-".repeat(30) + "операции удаления с конца" + "-".repeat(30));
        System.out.println("Время выполнения операции удаления с конца arrayList = " + delLastArrayList(arrayList));
        System.out.println("Время выполнения операции удаления с конца arrayDeque = " + delLastArrayDeque(arrayDeque));
        System.out.println("Время выполнения операции удаления с конца treeMap = " + delLastTreeMap(treeMap));

        arrayList = new ArrayList<>();
        arrayDeque = new ArrayDeque<>();
        treeMap = new TreeMap<>();
        fillArrayList(arrayList);
        fillArrayDeque(arrayDeque);
        fillTreeMap(treeMap);
        System.out.println("\n" + "-".repeat(30) + "операции удаления с середины" + "-".repeat(30));
        System.out.println("Время выполнения операции удаления с середины arrayList = " + delMiddleArrayList(arrayList));
        System.out.println("Время выполнения операции удаления с середины treeMap = " + delMiddleTreeMap(treeMap));

    }

    public static void fillArrayList(List<Integer> list){
        for (int i = 0; i < 12000000; i++) {
            list.add(i);
        }
    }
    public static void fillArrayDeque(Deque<Integer> deque){
        for (int i = 0; i < 12000000; i++) {
            deque.add(i);
        }
    }
    public static void fillTreeMap(TreeMap<Integer, Integer> list){
        for (int i = 0; i < 12000000; i++) {
            list.put(i, 1);
        }
    }
    //12 000 000
    public static long addFirstArrayList(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.addFirst(1);
        }
        list.addFirst(1);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long addFirstArrayDeque(Deque<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.addFirst(1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long addFirstTreeMap(TreeMap<Integer, Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.put(-i, 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    public static long addLastArrayList(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            list.add(1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long addLastArrayDeque(Deque<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            list.add(1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long addLastTreeMap(TreeMap<Integer, Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            list.put(13000000+i, 1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long addMiddleArrayList(ArrayList<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(6000000+i,1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long addMiddleTreeMap(TreeMap<Integer, Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.put(6000000+i,1);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    public static long delFirstArrayList(ArrayList<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.removeFirst();
        }
        list.addFirst(1);
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long delFirstArrayDeque(Deque<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.removeFirst();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long delFirstTreeMap(TreeMap<Integer, Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }


    public static long delLastArrayList(ArrayList<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            list.removeLast();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long delLastArrayDeque(Deque<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            list.removeLast();
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
    public static long delLastTreeMap(TreeMap<Integer, Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 12000000; i++) {
            list.remove(12000000-i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long delMiddleArrayList(ArrayList<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(6000000);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long delMiddleTreeMap(TreeMap<Integer, Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(6000000+i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

}


