public class arrayTest {
    public static void main (String[] args) {
        int size=10;
        int a[][]=new int [size][size];
        //int b[10];// error
        int c[]=new int [size-1];
        double d[]={1.1,2.2};
        int lena=a.length;//10
        int lenc=c.length;//9
        int lend=d.length;//2
        char str[]={'z','p','x'};
        System.out.println("a:"+a+" c:"+c+" d:"+"d");
        System.out.println("a.length = " + lena + "; c.length = " + lenc + "; d.length = " + lend);
        System.out.println("d[1] = " + d[1] + "; c[0] = " + c[0] );
        a=c;
        c=d;
        lena=a.length;//10
        lenc=c.length;//9
        lend=d.length;//2
        System.out.println("a:"+a+" c:"+c+" d:"+"d");
        System.out.println("a.length = " + lena + "; c.length = " + lenc + "; d.length = " + lend);
        System.out.println("d[1] = " + d[1] + "; c[0] = " + c[0] );
    }
}