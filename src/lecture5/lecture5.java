package lecture5;

public class lecture5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.weight = 250;
        cat1.name = "Cat1";
        cat1.age = 2;
        cat1.strength = 500;

        Cat cat2 = new Cat();
        cat2.name = "Cat2";
        cat2.age = 2;
        cat2.weight = 500;
        cat2.strength = 750;

        Cat cat3 = new Cat();
        cat3.name = "Cat3";
        cat3.age = 1;
        cat3.weight = 150;
        cat3.strength = 200;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat2.fight(cat3));
    }
}

//1
class Cat{
    String name;
    int age;
    int weight;
    int strength;

    boolean fight(Cat anotherCat){
        if (this.strength > anotherCat.strength){
            return true;
        } else if (this.strength == anotherCat.strength){
            if (this.weight > anotherCat.weight)
                return true;
            else return false;
        } else return false;

    }
}

class Dog{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
