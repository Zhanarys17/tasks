import java.util.Scanner;

public class BonusTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] matrix = new char[3][3];
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                matrix[i][j] = '-';
            }
        }

        for (int i=0;i<matrix.length;i++){
            System.out.print("|");
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(" " + matrix[i][j] + " |");
            }
            System.out.println();
        }

        while (true){
            int firstPlayer = scan.nextInt();
            int secondPlayer = scan.nextInt();

        }
    }
}
