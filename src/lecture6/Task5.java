package lecture6;

public class Task5 {
    public static void main(String[] args) {
        for (int i=0;i<50000;i++){
            Cat cat = new Cat("i - " + i);
            Dog dog = new Dog("i - " + i);
        }
    }

}
class Cat
{
    static int catCount = 0;
    String name;

    Cat(String name)
    {
        this.name = name;
        catCount++;
    }

    protected void finalize() throws Throwable
    {
        catCount--;
        System.out.println(name + " destroyed");
    }
}
class Dog{
    String name;

    Dog(String name)
    {
        this.name = name;
    }

    protected void finalize() throws Throwable
    {
        System.out.println(name + " destroyed");
    }
}
