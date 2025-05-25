package lr7;

import java.io.*;

public class Task_6 {
    public static void main(String[] args) {
        Student student = new Student("Andrey", "Smirnov", 25, 123456);
        try(FileOutputStream fileOutputStream = new FileOutputStream("serializable_student.json");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(student);
            System.out.println("Объект Студент успешно сериализован");
        }
        catch (IOException e){
            System.out.println("Проблемы при работе с файлом: " + e.getMessage());
        }

        try(FileInputStream fileInputStream = new FileInputStream("serializable_student.json");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            Student student1 = (Student) objectInputStream.readObject();
            System.out.println("Объект Студент успешно десериализован: ");
            System.out.println(student1.firstName);
            System.out.println(student1.lastName);
            System.out.println(student1.age);
            System.out.println(student1.ID);
        }
        catch(IOException e) {
            System.out.println("Проблемы при работе с файлом: " + e.getMessage());
        }
        catch (ClassNotFoundException ex){
            System.out.println("Класс не найден: " + ex.getMessage());
        }
    }


    static class Student implements Serializable {
        String firstName;
        String lastName;
        Integer age;
        Integer ID;

        Student(String firstName, String lastName, Integer age, Integer ID){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.ID = ID;
        }
    }
}
