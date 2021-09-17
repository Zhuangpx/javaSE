/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-10 16:11:50
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-10 16:26:04
 * @FilePath: \apricityd:\ALL_Project-DevelopTools\Forjava\Project\example3_4.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
import java.util.Scanner;
// import People.java;
class People {
    int age;
    float weight;
    const int class_ = 202;
    void speak() {
        System.out.println("My age :" + age );
        System.out.println("My weight :" + weight );
        System.out.println("My calss :" + class_ );
    }
}
public class example3_4 {
    public static void main(String args[]) {
        People zpx = new People();
        Scanner reader = new Scanner(System.in);
        System.out.println("Input age:");
        zpx.age = reader.nextInt();
        System.out.println("Input werght:");
        zpx.weight = reader.nextFloat();
        zpx.speak();
    }
}