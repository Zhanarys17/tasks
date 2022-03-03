package lecture2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(19);

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        Fish fish1= new Fish();
        cat1.owner = "Zhan";
        dog1.owner = "Asd";
        fish1.owner = "qwe";

    }

    static class Cat{
        String owner;
    }

    static class Dog{
        String owner;
    }

    static class Fish{
        String owner;
    }

    static class Woman{

    }
}
