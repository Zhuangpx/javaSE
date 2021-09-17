/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-17 21:42:21
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-17 21:43:52
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\arrayTest.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
public class arrayTest {
    public static void main (String[] args) {
        int size=10;
        int a[][]=new int [size][size];
        //int b[10];// error
        int c[]=new int [size-1];
        int lena=a.length;//10
        int lenc=c.length;//9
        System.out.println("a.length = " + lena + "c.length = " + lenc );
    }
}