/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-10 16:11:50
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-10 16:45:48
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
        /* " + " 连接输出内容 */
        //println带换行输出//
        System.out.println("My age :" + age );
        //print正常输出
        System.out.print("My weight :" + weight + '\n' );

        /* 同c语言的格式控制符 */
        System.out.println("My calss : %d", calss_ );
        System.out.print("My birthDate : %f\n", birthDate );
    }
}
//eample3_4 输入输出基本数据类型
public class example3_4 {
    public static void main(String args[]) {
        //创造People对象zpx
        People zpx = new People(); 
        //创造reader对象读取输入
        Scanner reader = new Scanner(System.in); 
        System.out.println("Input age:");
        //reader的方法调用
        zpx.age = reader.nextInt(); 
        System.out.println("Input werght:");
        //reader的方法调用
        zpx.weight = reader.nextFloat(); 
        zpx.speak();
    }
}