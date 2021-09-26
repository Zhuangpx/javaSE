/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-26 11:45:52
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-26 11:47:36
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\FinalizationDemo.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
public class FinalizationDemo {
  public static void main(String[] args) {
    Cake c1 = new Cake(1);
    Cake c2 = new Cake(2);
    Cake c3 = new Cake(3);

    c2 = c3 = null;
    System.gc(); //调用Java垃圾收集器
  }
}

class Cake extends Object {
  private int id;
  public Cake(int id) {
    this.id = id;
    System.out.println("Cake Object " + id + "is created");
  }

  protected void finalize() throws java.lang.Throwable {
    super.finalize();
    System.out.println("Cake Object " + id + "is disposed");
  }
}