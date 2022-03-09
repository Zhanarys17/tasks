package lecture4;

import java.util.Objects;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1
        /*int a = scan.nextInt();
        int b = scan.nextInt();

        if (a<b){
            System.out.println(a +" less");
        } else if (b<a){
            System.out.println(b + " less");
        } else{
            System.out.println("They are equal");
        }
         */

        //2
        /*int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (a > b && a > c && a > d){
            System.out.println("Max = " + a);
        } else if (b > a && b > c && b >d){
            System.out.println("Max = " + b);
        } else if (c>a && c > b && c >d){
            System.out.println("Max = " + c);
        } else if (d > a && d >b && d > c){
            System.out.println("Max = " + d);
        } else{
            System.out.println("There are same max numbers!");
        }
         */

        //3
        /*
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a);
            if (b > c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        } else if (b >= a && b >= c){
            System.out.println(b);
            if (a > c){
                System.out.println(a);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else if (c >= a && c >= b){
            System.out.println(c);
            if (a > b){
                System.out.println(a);
                System.out.println(b);
            } else {
                System.out.println(b);
                System.out.println(a);
            }
        }
         */

        //4
        /*
        String name1 = scan.next();
        String name2 = scan.next();

        if (name1.equals(name2)){
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2.length()){
            System.out.println("Длины имен равны");
        }

         */

        //5
        /*
        String name = scan.next();
        int age = scan.nextInt();
        if (age < 18){
            System.out.println("Подрасти еще");
        }

         */

        //6
        /*String name = scan.next();
        int age = scan.nextInt();
        if (age > 20){
            System.out.println("И 18-ти достаточно");
        }*/
    }
}
