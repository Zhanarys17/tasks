package lecture6;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

    }
}
class Catt {
    static int catCount = 0;
    String name;

    Catt(String name)
    {
        this.name = name;
        catCount++;
    }

    public static int getCatCount(){
        return catCount;
    }

    public static void setCatCount(int count){
        catCount = count;
    }
}
class Util{
    public static double getDistance(int x1,int y1,int x2,int y2){
        int x = x2 - x1;
        int y = y2 - y1;
        return Math.sqrt(x*y);
    }
}
class ConsoleReader{
    static Scanner scan = new Scanner(System.in);

    public static String readString(){
        return scan.next();
    }

    public static int readInt(){
        return scan.nextInt();
    }

    public static double readDouble(){
        return scan.nextDouble();
    }

    public static boolean readBoolean(){
        return scan.nextBoolean();
    }
}
class StringHelper{
    public static String multiply(String s, int count){
        String newString = "";
        for (int i=0;i<count;i++){
            newString += s + "\n";
        }
        return newString;
    }

    public static String multiply(String s){
        String newString = "";
        for (int i=0;i<5;i++){
            newString += s + "\n";
        }
        return newString;
    }
}
