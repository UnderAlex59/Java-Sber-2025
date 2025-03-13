package lr2;

public class Task_8 {
    public static void main(String[] args) {
        Animal animal = new Animal("Кто-то", 20);
        animal.getVoice();
        Dog sharik = new Dog("Шарик", 20, false);
        sharik.getVoice();
        System.out.println(sharik.getOwnersAddress());
        sharik.setPetDog("Какой-то хозяин");
        System.out.println(sharik.getOwnersAddress());
        Bird bird = new Bird("Синица", 20, true);
        bird.getVoice();
        bird.fly();
        Bird qiwi = new Bird("Киви", 20, false);
        qiwi.fly();
    }
}

class Animal{
    String name;
    Integer age;

    Animal(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public void getVoice(){
        System.out.println("Голос животного");
    }
}

class Dog extends Animal{
    Boolean isPetDog;
    String ownersAddress;

    Dog(String name, Integer age, Boolean isPetDog){
        super(name, age);
        this.isPetDog = isPetDog;
    }
    Dog(String name, Integer age, Boolean isPetDog, String ownersAddress){
        super(name, age);
        this.isPetDog = isPetDog;
        this.ownersAddress = ownersAddress;
    }

    @Override
    public void getVoice() {
        System.out.println("Гав-гав!");
    }

    public Boolean getPetDog() {
        return isPetDog;
    }

    public void setPetDog(String ownersAddress) {
        this.isPetDog = true;
        this.ownersAddress = ownersAddress;
    }

    public String getOwnersAddress(){
        if (this.isPetDog) return ownersAddress;
        else return "Собака не домашняя";

    }
}

class Bird extends Animal{
    Boolean canFly;

    @Override
    public void getVoice() {
        System.out.println("Чирик-чирик");
    }

    Bird(String name, Integer age, Boolean canFly){
        super(name, age);
        this.canFly = canFly;
    }

    public void fly(){
        if(canFly) System.out.println("Птица "+name+" летит");
        else System.out.println("Птица "+name+" не умеет летать");
    }
}
