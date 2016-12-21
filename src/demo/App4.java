package demo;

public class App4 {

    public static void main(String[] args) {
        int i;
        int j = 0;
        int k = 1;
        int l = 3;
        int n = 6;
        int m = k+l+n;
        for (i =1; i < 6; i++ ) {
            j = j + i;
            System.out.print(" "+j);
        }
        System.out.println();
        for (i =1; i < 5; i++ ) {
            k = k + i;
            System.out.print(" "+k);
        }
        System.out.println();
        for (i =1; i < 4; i++ ) {
            l = l + i;
            System.out.print(" "+l);
        }
        System.out.println();
        for (i =1; i < 3; i++ ) {
            n = n + i;
            System.out.print(" "+n);
        }
        System.out.println();
        for (i =1; i < 2; i++ ) {
            m = m + i;
            System.out.print(" "+m);
        }
    }

}
