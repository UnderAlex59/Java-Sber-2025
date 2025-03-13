package lr2;

import java.io.IOException;

public class Person_task_4{
    String name;
    Integer age;
    //Пусть мужской пол - false, женский - true
    Boolean gender;

    Person_task_4(String name, Integer age, Boolean gender) throws IOException{
        if (name.isEmpty()) throw new IOException("Нельзя присвоить пустое имя");
        else this.name = name;
        if (age > 0) this.age = age;
        else throw new IOException("Возраст не может быть меньше 0 лет");
        this.gender = gender;
    }

    public void setName(String name) {
        if (name.isEmpty()) System.out.println("Нельзя присвоить пустое имя");
        else this.name = name;
    }

    public void setAge(Integer age) {
        if (age < 0) System.out.println("Возраст не может быть меньше 0 лет");
        else if(age < this.getAge()) System.out.println("Нельзя омолодить человека");
        else this.age = age;
    }

    public void setGender(Boolean gender) {
        //Вообще смена пола запрещена в нашей стране...
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        if (this.getGender().equals(true) && this.getAge() > 18){
            System.out.println("Неприлично спрашивать возраст у девушки!");
            return 18;
        }
        else return age;
    }

    public Boolean getGender() {
        return gender;
    }
}
