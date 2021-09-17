public class arrayTest {
    public static void main (String[] args) {
        int size=10;
        int a[][]=new int [size][size];
        //int b[10];// error
        int c[]=new int [size-1];
        int d[]={1,2};
        int lena=a.length;//10
        int lenc=c.length;//9
        System.out.println("a.length = " + lena + "; c.length = " + lenc );
        System.out.println("d[1] = " + d[1] );
    }
}