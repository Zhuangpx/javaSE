import java.util.Arrays;
public class arrayTest {
    public static void main (String[] args) {
        int size=10;
        int a[][]=new int [size][size];
        //int b[10];// error
        int c[]=new int [size-1];
        int d[]={1,2};
        int lena=a.length;//10
        int lenc=c.length;//9
        int lend=d.length;//2
        char str[]={'z','p','x'};
        System.out.println("" + str);
        System.out.println(str);
        System.out.println("======================");
        System.out.println("a:"+a+" c:"+c+" d:"+"d");
        System.out.println("a.length = " + lena + "; c.length = " + lenc + "; d.length = " + lend);
        System.out.println("d[1] = " + d[1] + "; c[0] = " + c[0] );
        //a=c; //error
        c=d;
        lena=a.length;//10
        lenc=c.length;//9
        lend=d.length;//2
        System.out.println("a:"+a+" c:"+c+" d:"+"d");
        System.out.println("a.length = " + lena + "; c.length = " + lenc + "; d.length = " + lend);
        System.out.println("d[1] = " + d[1] + "; c[0] = " + c[0] );
        System.out.println("=======================");
        int aa[]={1,2,3,4,5};
        for(int i=0;i<a.length;i++)System.out.print(aa[i]+" ");System.out.println();
        for(int ch:aa)System.out.print(ch+" ");System.out.println();
        System.out.print(Arrays.toString(aa));System.out.println();
    }
}