/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-10 16:11:50
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-10 17:51:42
 * @FilePath: \apricityd:\ALL_Project-DevelopTools\Forjava\Project\example3_4_2.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
import java.util.Scanner;//��װ���࣬���������÷�����ȡ����������
class People {
    int age;
    float weight;
    final int class_ = 202;
    float birthDate = 2001.0525f;
    void speak() {
        /* " + " ����������� */

        System.out.println("My age :" + age );//println���������

        System.out.printf("My weight :" + weight + '\n' );//print�������

        /* ͬc���Եĸ�ʽ���Ʒ� */
        System.out.printf("My calss : %d\n", class_ );
        System.out.printf("My birthDate : %f\n", birthDate );
    }
}
/*eample3_4 �������������������*/
public class example3_4_2 {
    public static void main(String args[]) {

        People zpx = new People();//����People����zpx

        Scanner reader = new Scanner(System.in);//����reader�����ȡ����
        System.out.println("Input age:");

        zpx.age = reader.nextInt();//reader�ķ�������
        System.out.println("Input werght:");

        zpx.weight = reader.nextFloat();//reader�ķ�������
        zpx.speak();
    }
}