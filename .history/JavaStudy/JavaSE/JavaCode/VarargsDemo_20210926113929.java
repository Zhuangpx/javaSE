/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-26 11:36:45
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-26 11:39:29
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\VarargsDemo.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
public class VarargsDemo {
    public static void main(String args[]) {
        // 调用可变参数的方法
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax( double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }

        double result = numbers[0];

        for (int i = 1; i <  numbers.length; i++){
            if (numbers[i] >  result) {
                result = numbers[i];
            }
        }
        System.out.println("The max value is " + result);
    }
}