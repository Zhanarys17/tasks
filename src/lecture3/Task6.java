package lecture3;

public class Task6 {
    public static void main(String[] args) {
        String a ="Мама";
        String b = "Мыла";
        String c = "Раму";

        System.out.println(a+b+c);
        System.out.println(a+c+b);
        System.out.println(b+a+c);
        System.out.println(b+c+a);
        System.out.println(c+a+b);
        System.out.println(c+b+a);

        System.out.println();

        for (int i=1;i<=10;i++){
            for (int j=1;j<=10;j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }

        System.out.println();

        ROYGBIV roygbiv1 = new ROYGBIV("Violet");
        ROYGBIV roygbiv2 = new ROYGBIV("Indigo");
        ROYGBIV roygbiv3 = new ROYGBIV("Blue");
        ROYGBIV roygbiv4 = new ROYGBIV("Green");
        ROYGBIV roygbiv5 = new ROYGBIV("Yellow");
        ROYGBIV roygbiv6 = new ROYGBIV("Orange");
        ROYGBIV roygbiv7 = new ROYGBIV("Red");

        System.out.println();

        System.out.println("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println("It's Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\\"\n");

        System.out.println("日本語");
    }

    static class ROYGBIV{
        String color;
        public ROYGBIV(String color) {
            this.color = color;
            System.out.println(color);
        }
    }


}
