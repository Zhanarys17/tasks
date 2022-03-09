package lecture5;

public class Task12 {
    public static void main(String[] args) {
        Man man1 = new Man("Zhan",19,"Almaty");
        Woman woman1 = new Woman("Adel",22,"Ata");
        System.out.println(man1.getData());
        System.out.println(woman1.getData());
    }
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getData(){
            return name + " " + age + " " + address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String getData(){
            return name + " " + age + " " + address;
        }
    }
}
