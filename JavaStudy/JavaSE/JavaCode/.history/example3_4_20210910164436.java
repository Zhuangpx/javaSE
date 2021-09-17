/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-10 16:11:50
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-10 16:44:36
 * @FilePath: \apricityd:\ALL_Project-DevelopTools\Forjava\Project\example3_4.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
import java.util.Scanner;//封装的类，创造对象调用方法读取命令行输入
class People {
    int age;
    float weight;
    final int class_ = 202;
    float birthDate = 2001.0525f;
    void speak() {
        // " + " 连接输出内容
        System.out.println("My age :" + age ); //println带换行输出//
        System.out.print("My weight :" + weight + '\n' ); //print正常输出
        // 同c语言的格式控制符
        System.out.println("My calss : %d", calss_ );
        System.out.print("My birthDate : %f\n", birthDate );
    }
}
//eample3_4 输入输出基本数据类型
public class example3_4 {
    public static void main(String args[]) {
        People zpx = new People(); //创造People对象zpx
        Scanner reader = new Scanner(System.in); //创造reader对象读取输入
        System.out.println("Input age:");
        zpx.age = reader.nextInt(); //reader的方法调用
        System.out.println("Input werght:");
        zpx.weight = reader.nextFloat(); //reader的方法调用
        zpx.speak();
    }
}