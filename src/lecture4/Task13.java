package lecture4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1
        /*
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

         */

        //2
        /*
        int m = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(8);
            }
            System.out.println();
        }

         */

        //3
        /*
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                if (i>=j){
                    System.out.print(8);
                }
            }
            System.out.println();
        }

         */

        //4
        /*
        for (int i=0;i<10;i++){
            System.out.println(8);
        }
        for (int i=0;i<10;i++){
            System.out.print(8);
        }

         */

        //5
        /*
        String name = scan.next();
        for (int i=0;i<10;i++){
            System.out.println(name + " любит меня.");
        }

         */
    }
}
