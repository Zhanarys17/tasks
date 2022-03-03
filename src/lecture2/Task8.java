package lecture2;

public class Task8 {
    public static void main(String[] args) {

    }

    public static int min(int a, int b) {
        if (a > b) {
            return b;
        } else return a;
    }

    public static int maxOfTwo(int a, int b){
        if (a > b){
            return a;
        } else return b;
    }

    public static int minOfThree(int a,int b,int c){
        if (a<b && a<c){
            return a;
        } else if (b<a && b<c){
            return b;
        } else {
            return c;
        }
    }

    public static int min(int a,int b,int c,int d){
        int first = min(a,b);
        int second = min(c,d);

        if (first < second){
            return first;
        } else return second;

    }

    public static void print(String s){
        for (int i=0;i<3;i++){
            System.out.println(s);
        }
    }

    public static void print2(String s){
        for (int i=0;i<3;i++){
            System.out.print(s + " ");
        }
    }
}
