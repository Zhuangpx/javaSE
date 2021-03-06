# Java

粗略记录Java入门学习。

## 1.Java入门

### 1.1平台无关性

**平台：操作系统（Operating System，Os）和处理器（Central Processing Unit，CPU）** 构成。

将其与c/c++做比较：

![c/c++](./assets/photos/1.1.1.png)

<!-- ![c/c++](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.1.1.png) -->

![java](./assets/photos/1.1.2.png)

<!-- ![java](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.1.2.png) -->

![java源程序与编译型运行的区别](./assets/photos/1.1.3.png)

<!-- ![java源程序与编译型运行的区别](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.1.3.png) -->

### 1.2三个概念

JDK：JAVA开发工具箱(Java Development Kit)
JRE：Java运行环境(Java Runtime Environment)，
JVM：Java虚拟机(Java Virtual Machine)

![JDK/JRE/JVM](./assets/photos/1.2.1.png)

<!-- ![JDK/JRE/JVM](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.2.1.png) -->

### 1.3三个版本/平台

JavaSE：标准平台，JaveME：嵌入式开发，JavaEE：企业平台

![JavaSE/ME/EE](./assets/photos/1.3.1.png)

<!-- ![JavaSE/ME/EE](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.3.1.png) -->

![JavaSE/ME/EE/](./assets/photos/1.3.2.png)

<!-- ![JavaSE/ME/EE/](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.3.2.png) -->

### 1.4按照平台/环境

按照JDK之后设置环境变量(path)。

IDE开发形如IDEA，Eclipse。

### 1.5Java特点

简单，面向对象，平台无关，多线程，动态。

![特点1](./assets/photos/1.5.1.png)

<!-- ![特点1](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.5.1.png) -->

![特点2](./assets/photos/1.5.2.png)

<!-- ![特点2](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.5.2.png) -->

### 1.6程序分析

从一个简单实例分析程序。

#### 编写源程序

首先编写程序，注意到**必须有且只有一个主类(包含有main方法的类)，并且其名字要和文件名一致**。

```java
public class Hello{
    public static void main(String[] args){
        System.out.print("Hello World!");
    }
}
```

之后保存并命名，如上应命名为```Hello.java```，以文本形式编写之后应该以**所有文件**类型保存。

#### 编译

![Java编译](./assets/photos/1.6.1.png)

<!-- ![Java编译](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.6.1.png) -->

使用`javac [File].java`的方式编译。
选择**不同版本JDk**编译可以加上参数`-source x`，其中x为版本号，如1.8。

#### 编码

关于`java的编码方式`可以参考[这篇文章](https://www.cnblogs.com/yaya-yaya/p/5768616.html)。
注意到**编码应该统一**，一般文件会默认ANSI保存，编译时可以加上编码参数，如`-encoding utf-8`。如下：
有时对中文会出现**编码GBK的不可映射字符**的问题，由于`JDK`是国际版的，我们在用`javac`编译时，编译程序首先会获得我们操作系统默认采用的编码格式（`GBK`），然后`JDK`就把`Java`源文件从`GBK`编码格式转换为`Java`内部默认的`Unicode`格式放入内存中，然后`javac`把转换后的`Unicode`格式的文件编译成`class`类文件，此时，`class`文件是`Unicode`编码的，它暂存在内存中，紧接着，`JDK`将此以`Unicode`格式编码的`class`文件保存到操作系统中形成我们见到的`class`文件。当我们不加设置就编译时，相当于使用了参数：`javac -encoding GBK [file].java`，就会出现不兼容的情况。因此使用`-encoding utf-8`方式编译就不会产生不兼容。
另外，**查看系统默认编码类型**可以使用`chcp`指令。其中MS-DOS为以下国家和语言提供字符集：

![各国字符集代号](./assets/photos/1.6.5.png)

<!-- ![各国字符集代号](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.6.5.png) -->

当然，实际上只要兼容即可，不一定非得使用utf8（虽然它比较实用）。

#### 运行

使用`java [File]`的方式运行。

#### 编程风格

Allmans(独行风格)及Kernighan(行尾风格)。

#### 注释

三种注释方式

非常重要的一点，**在java的注释使用Unicode字符依旧是会被解析的**。可以通过[这篇文章](https://www.cnblogs.com/chengxuyuanaa/p/12838284.html)了解。（**注释也得遵循编码的规则**）

```java
//此段代码输出的应该是“沉默王三”
// \u00d 被解析成换行，于是 name="沉默王三" 就被挤进下行成为正文
public class Test {
    public static void main(String[] args) {
        String name = "沉默王二";
        // \u000dname="沉默王三";
        System.out.println(name);
    }
}
```

#### 反编译

![Java反编译](./assets/photos/1.6.2.png)

<!-- ![Java反编译](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.6.2.png) -->

常见反编译工具：

![Java反编译工具](./assets/photos/1.6.3.png)

<!-- ![Java反编译工具](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.6.3.png) -->

其中JDK提供的是Javap反编译器。使用`javap [File].class`的方式反编译。

#### 注意点

![注意点](./assets/photos/1.6.4.png)

<!-- ![注意点](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/1.6.4.png) -->

### 1.7结构

类与对象

## 2.标识符与数据类型

### 2.1标识符与关键字

#### 标识符

Java使用的是Unicode字符集(0~65535)，涵盖了许多国家的语言。

#### 关键字

注意到TRUE和FALSE严格来说不算关键字。

![关键字](./assets/photos/2.1.1.png)

<!-- ![关键字](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/2.1.1.png) -->

### 2.2基本数据类型

如下：

- 逻辑类型：`boolean`
- 整数类型：`byte,short,int,long`
- 字符类型：`char(2B)`
- 浮点类型：`float,double`

注意到常量用`final`修饰。

#### 关于整数

`int`型常量有**十进制**，**八进制(0yy)**，**十六进制(0xyy)**，变量分配四个字节(**4B**)。
`byte`型不存在常量表示法，变量分配八位一字节(**1B**)。
`short`型也不存在常量表示法，变量分配十六位两字节(**2B**)。
`long`型常量用后缀`l/L`表示，常量64为八字节(**8B**)。

#### 关于浮点数

`float`型常量**必须**加上后缀`f/F`，变量**默认保留八位有效数字**，32位四字节(**4B**)。
`double`型常量后缀`d/D`可加可不加，变量**默认保留十六位有效数字**，64位八字节(***B**)。

#### 关于类型转换

注意精度丢失

### 2.3引用数据类型

类，接口，数组。

### 2.4变量类型

#### 局部变量

![局部变量](./assets/photos/2.4.1.png)

<!-- ![局部变量](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/2.4.1.png) -->

#### 实例变量

![实例变量](./assets/photos/2.4.2.png)

<!-- ![实例变量](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/2.4.2.png) -->

#### 静态(类)变量

![静态变量](./assets/photos/2.4.3.png)

<!-- ![静态变量](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/2.4.3.png) -->

### 2.4从命令行窗口输入输出数据

```java
import java.util.Scanner;//封装的类，创造对象调用方法读取命令行输入
class People {
    int age;
    float weight;
    final int class_ = 202;
    final float birthDate = 2001.0525f;
    //final float birthDate = (float)2001.0525;   //final+强制类型转换
    //float birthDate = 2001.0525f;    //xxf
    void speak() {
        /* " + " 连接输出内容 */

        System.out.println("My age :" + age );//println带换行输出

        System.out.printf("My weight :" + weight + '\n' );//print正常输出

        /* 同c语言的格式控制符 */
        System.out.printf("My calss : %d\n", class_ );
        System.out.printf("My birthDate : %f\n", birthDate );
    }
}
/*eample3_4 输入输出基本数据类型*/
public class example3_4 {
    public static void main(String args[]) {

        People zpx = new People();//创造People对象zpx

        Scanner reader = new Scanner(System.in);//创造reader对象读取输入
        System.out.println("Input age:");

        zpx.age = reader.nextInt();//reader的方法调用
        System.out.println("Input werght:");

        zpx.weight = reader.nextFloat();//reader的方法调用

        //zpx.class_++;   //error
        //zpx.birthDate++;    //error

        zpx.speak();
    }
}
```

### 2.5 修饰符

`Java`修饰符可认为是访问性质和非访问性质的，因此可大体分为此两类。

#### 访问控制修饰符

`Java`支持以下四种访问权限：

- `default` (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。

- `private` : 在同一类内可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**。

- `public` : 对所有类可见。使用对象：类、接口、变量、方法

- `protected` : 对同一包内的类和所有子类可见。使用对象：变量、方法。 **注意：不能修饰类（外部类）**。

直观地用表格描述：

![访问控制修饰符](./assets/photos/2.5.1.png)

<!-- ![访问控制修饰符](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/2.5.1.png) -->

以下具体讨论每个控制符。

##### 默认访问修饰符

默认访问即使用任何关键字，对于变量和方法在**同个包的类内**内都是可见的，也成为**友好变量和友好方法**。接口里的变量都隐式声明为`public static final`,而接口里的方法默认情况下访问权限为`public`。

##### 私有访问修饰符-private

被声明为 `private` 的方法、变量和构造方法只能被所属类访问，并且**类和接口不能**声明为 `private`。

##### 公有访问修饰符-public

被声明为 `public` 的**类、方法、构造方法和接口**能够被任何其他类访问。

如果几个相互访问的 `public` 类分布在不同的包中，则需要导入相应 `public` 类所在的包。由于类的继承性，类所有的公有方法和变量都能被其子类继承。

这里也间接说明了为什么`main`方法需要设置成共有的。

##### 受保护的访问修饰符-protected

- **子类与基类在同一包**中：被声明为 `protected` 的变量、方法和构造器能被同一个包中的任何其他类访问；

- **子类与基类不在同一包**中：那么在子类中，子类实例可以访问其从**基类继承**而来的 `protected` 方法，而不能访问**基类实例**的protected方法。

`protected` 可以修饰数据**成员，构造方法，方法成员，不能修饰类（内部类除外）**。

**接口**及接口的成员变量和成员方法不能声明为 `protected`。

##### 访问控制和继承

注意以下方法继承的规则：

- 父类中声明为 `public` 的方法在子类中也必须为 `public`。

- 父类中声明为 `protected` 的方法在子类中要么声明为 `protected`，要么声明为 `public`，不能声明为 `private`。

- 父类中声明为 `private` 的方法，不能够被继承。

#### 非访问修饰符

`static` 修饰符，用来修饰类方法和类变量。

`final` 修饰符，用来修饰类、方法和变量，`final` 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。

`abstract` 修饰符，用来创建抽象类和抽象方法。

`synchronized` 和 `volatile` 修饰符，主要用于线程的编程。

##### static

##### final

##### abstract

##### synchronized

##### transient

##### volatile

## 3.运算符，表达式和语句

### 3.1运算符

#### instanceof运算符

`instanceof`是一个**二目运算符**，左边是一个对象，右边是一个类，用于检查该对象是否为特定的类/子类。

```java
public class instanceofTest {
    public static void main (String[] args) {
        String name = "violet apricity zpx";
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
```

### 3.2表达式

### 3.3语句

### 3.4数组

#### 数组的声明,初始化与创建

声明与`c/c++`类似。注意到数组的长度固定，可以以`.length`方法获取，多维数组的长度视为**一维的长度**。

```java
int a[];
int[] b;
```

**不可在声明数组时指定大小**，**可以使用int型变量指定大小**。初始化可以用大括号`{}`。**创建时使用`new`关键符**。

```java
int a[] = new int [5];
int b[] = {1, 2, 3};
```

#### 数组的引用

数组是引用型变量，因此在赋值时是引用复制，如`a=b (a[3] b[2])`那么`a`和`b`会有相同的引用和内容。
**注意到想输出char数组的引用必须让它和字符串做并置运算**。

```java
char a[] = {'z','p','x'};
System.out.println("" + a);
```

#### 数组的遍历

```java
int a[]=new int [5];
//基于循环
for(int i=0;i<a.length;i++)a[i];
//ForEach方式
for(char ch:a)ch;
//toString方法
System.out.println(Array.toString(a));
```

#### Arrays类

`java.util.Arrays`包装好的，能够操作数组的类，其提供的方法都是**静态的**。

#### 测试

```java
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
        lena=a.length;
        lenc=c.length;
        lend=d.length;
        System.out.println("a:"+a+" c:"+c+" d:"+"d");
        System.out.println("a.length = " + lena + "; c.length = " + lenc + "; d.length = " + lend);
        System.out.println("d[1] = " + d[1] + "; c[0] = " + c[0] );
        System.out.println("=======================");
        int aa[]={1,2,3,4,5};
        for(int i=0;i<aa.length;i++)System.out.print(aa[i]+" ");System.out.println();
        for(int ch:aa)System.out.print(ch+" ");System.out.println();
        System.out.print(Arrays.toString(aa));System.out.println();
    }
}
/* out :
[C@15db9742
zpx
======================
a:[[I@6d06d69c c:[I@7852e922 d:d
a.length = 10; c.length = 9; d.length = 2
d[1] = 2; c[0] = 0
a:[[I@6d06d69c c:[I@4e25154f d:d
a.length = 10; c.length = 2; d.length = 2
d[1] = 2; c[0] = 1
=======================
1 2 3 4 5
1 2 3 4 5
[1, 2, 3, 4, 5]
*/
```

## 4.类与对象

### 4.1 类

#### 类的UML图

参见[此文章](https://blog.csdn.net/u011125703/article/details/50935322?utm_medium=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromBaidu-1.control&depth_1-utm_source=distribute.pc_relevant_t0.none-task-blog-BlogCommendFromBaidu-1.control)

### 4.2 对象

#### 创建

使用`new`创建。需要经过**声明**，**实例化**，**初始化**来创建对象。

```java
class C{}
C a = new C();
C b; b = new C();
```

#### 没有析构与垃圾收集

`java`里没有析构方法，能够自动进行垃圾收集（周期性的机制）。也可以使用`System`类的`gc()`方法手动垃圾收集。

#### this

同`c++`，`java`也有`this`。

#### 引用

类也是引用的数据类型，因此赋值时引用也会复制。

实例：

```java
//===================
// Employee.java
import java.io.*;

public class Employee{
   String name;
   int age;
   String designation;
   double salary;
   // Employee 类的构造器
   public Employee(String name){
      this.name = name;
   }
   // 设置age的值
   public void empAge(int empAge){
      age =  empAge;
   }
   /* 设置designation的值*/
   public void empDesignation(String empDesig){
      designation = empDesig;
   }
   /* 设置salary的值*/
   public void empSalary(double empSalary){
      salary = empSalary;
   }
   /* 打印信息 */
   public void printEmployee(){
      System.out.println("名字:"+ name );
      System.out.println("年龄:" + age );
      System.out.println("职位:" + designation );
      System.out.println("薪水:" + salary);
   }
}
//===================
// EmployeeTest.java
import java.io.*;
public class EmployeeTest{

   public static void main(String[] args){
      /* 使用构造器创建两个对象 */
      Employee empOne = new Employee("RUNOOB1");
      Employee empTwo = new Employee("RUNOOB2");

      // 调用这两个对象的成员方法
      empOne.empAge(26);
      empOne.empDesignation("高级程序员");
      empOne.empSalary(1000);
      empOne.printEmployee();

      empTwo.empAge(21);
      empTwo.empDesignation("菜鸟程序员");
      empTwo.empSalary(500);
      empTwo.printEmployee();
   }
}
//=================
$ javac -encoding utf-8 EmployeeTest.java
$ java EmployeeTest
名字:RUNOOB1
年龄:26
职位:高级程序员
薪水:1000.0
名字:RUNOOB2
年龄:21
职位:菜鸟程序员
薪水:500.0
//=================
```

### 4.3 方法

#### 构造方法

每个类都有构造方法。如果没有显式地为类定义构造方法，`Java`编译器将会为该类提供一个默认构造方法。

在创建一个对象的时候，至少要调用一个构造方法。构造方法的名称必须与类同名，一个类可以有多个构造方法。

#### 实例方法与类方法

与变量同样的，方法也有静态的以`static`修饰的**类方法**和普通的**实例方法**。
注意到实例方法在对象存在时入口地址存在且相同，在所有对象消失时入口地址也会取消。

#### 方法的重载与多态

方法的重载实现多态的。

#### 命令行参数的使用

有时候希望运行一个程序时候再传递给它消息。这要靠传递命令行参数给main()函数实现。

命令行参数是在执行程序时候紧跟在程序名字后面的信息。

```java
public class CommandLine {
   public static void main(String args[]){
      for(int i=0; i<args.length; i++){
         System.out.println("args[" + i + "]: " + args[i]);
      }
   }
}
//========================
$ javac CommandLine.java
$ java CommandLine This is a command line 5 16
args[0]: This
args[1]: is
args[2]: a
args[3]: command
args[4]: line
args[5]: 5
args[6]: 16
```

#### 可变参数

JDK 1.5 开始，Java支持传递同类型的可变参数给一个方法。

方法的可变参数的声明如下所示：

```java
typeName... parameterName
```

在方法声明中，在指定参数类型后加一个省略号(...) 。

一个方法中只能指定一个可变参数，它必须是方法的**最后一个参数**。任何普通的参数必须在它之前声明。

```java
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
//================================
The max value is 56.5
The max value is 3.0
```

#### finalize()方法

`Java`允许定义这样的方法，它在对象被垃圾收集器析构(回收)之前调用，这个方法叫做`finalize( )`，它用来清除回收对象。

例如，可以使用`finalize()`来确保一个对象打开的文件被关闭了。

在`finalize()`方法里，必须指定在对象销毁时候要执行的操作。

`finalize()`一般格式是：

```java
protected void finalize()
{
   // 在这里终结代码
}
```

关键字`protected`是一个限定符，它确保`finalize()`方法不会被该类以外的代码调用。

当然`Java`的内存回收可以由`JVM`来自动完成。如果手动使用，则可以使用上面的方法。

```java
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
//=======================
Cake Object 1is created
Cake Object 2is created
Cake Object 3is created
Cake Object 3is disposed
Cake Object 2is disposed
```

#### 源文件声明规则

当在一个源文件中定义多个类，并且还有import语句和package语句时，要特别注意这些规则。

- 一个源文件中只**能有一个**`public`类
- 一个源文件可以有**多个**非`public`类
- 源文件的名称应该和`public`类的类名保持一致。
- 如果一个类定义在某个包中，那么`package`语句应该在源文件的**首行**。
- 如果源文件包含`import`语句，那么应该放在`package`语句和类定义之间。如果没有 `package`语句，那么`import`语句应该在源文件中**最前面**。
- `import`语句和`package`语句对源文件中定义的**所有类都有效**。在同一源文件中，**不能给不同的类不同的包声明**。

类有若干种访问级别，并且类也分不同的类型：抽象类和`final`类等。

除了上面提到的几种类型`Java`还有一些特殊的类，如：内部类、匿名类。

### 4.4 Java包(package)

java包机制属于面向对象范畴。

为了更好地组织类，Java 提供了包机制，用于区别类名的命名空间。

包声明应该在源文件的第一行，每个源文件只能有一个包声明，这个文件中的每个类型都应用于它。多级包用`.`分开。

如果一个源文件中没有使用包声明，那么其中的类，函数，枚举，注释等将被放在一个**无名的包**（ `unnamed package` ）中。

包的语法格式如下：

```java
package pak1.pak2.pak3;
```

如：

```java
package net.java.util;
public class Zpx{
    //
}
```

那么文件```Zpx.java```应该保存为：```../net/java/util/Zpx.java```。

#### 包的作用

1、把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。

2、如同文件夹一样，包也采用了树形目录的存储方式。同一个包中的类名字是不同的，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名加以区别。因此，包可以避免名字冲突。

3、包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。

Java 使用包（package）这种机制是为了防止命名冲突，访问控制，提供搜索和定位类（class）、接口、枚举（enumerations）和注释（annotation）等。

#### 包的创建与含包运行

创建包的时候，你需要为这个包取一个合适的名字。之后，如果其他的一个源文件包含了这个包提供的类、接口、枚举或者注释类型的时候，都必须将这个包的声明放在这个源文件的开头。

包声明应该在源文件的第一行，每个源文件只能有一个包声明，这个文件中的每个类型都应用于它。

如果一个源文件中没有使用包声明，那么其中的类，函数，枚举，注释等将被放在一个无名的包（unnamed package）中。

示例：

在根目录下创建`Ainmal.java`和`MammalInt.java`文件，并在文件头新建一个二级包`com.packanimals`。

```java
/* File: Animal.java */

package com.packanimals;

interface Animal {
   public void eat();
   public void travel();
}

/* File : MammalInt.java */

package com.packanimals;

public class MammalInt implements Animal{

   public void eat(){
      System.out.println("Mammal eats");
   }

   public void travel(){
      System.out.println("Mammal travels");
   }

   public int noOfLegs(){
      return 0;
   }

   public static void main(String args[]){
      MammalInt m = new MammalInt();
      m.eat();
      m.travel();
   }
}
```

对其编译，并且把生成的`class`文件放在`./com/packanimals`下。

```shell
..\com\packanimals\file.class
```

或者不选择手动创建，则需要在命令行里加上参数编译。

```shell
$ javac -d . Animals.java
//=======================
$ javac -d . MammalInt.java
```

运行时加上包名：

```shell
$ java com.packanimals.MammalInt
Mammal eats
Mammal travels
```

#### import引入

为了能够使用某一个包的成员，我们需要在`Java`程序中明确导入该包。使用 `import` 语句可完成此功能。

在 java 源文件中 `import` 语句应位于 `package` 语句之后，所有类的定义之前，可以没有，也可以有多条，其语法格式为：

```java
import pack1.pack2.Classname;
```

如果要引入某个包中所有的类，可以用**通配符号星号(*)**来代替。

```java
import pack1.pack2.*;
```

如果在一个包中，一个类想要使用本包中的另一个类，那么该包名可以省略。

引入类库里的类时显然无需关系类库的位置。

```java
import java.util.*;
import java.util.Date;
```

注意到`java.lang`是`java`核心类库，包含必须的系统类，系统会自动引入，无需手动`import`。

引入类只会在编译时增加时间成本，并不会影响程序运行的性能。

注意到对于当前目录下包默认的`classpath`是`>\jdk1.8\jire\lib\rt.jar;.;`，其中`.;`表示可以加在当前目录的无名包类，，而且当前目录下的子目录可以作为包的名字使用。

示例：

```shell
> packZ
  > NodePack.java
  Tree.java
  Run.java
```

文件：

```java
/* File : NodePack.java */
/* 子目录作为包名使用 */
package packZ;
public class NodePack
{
    public int val;
    public NodePack(int x) { val = x; }
}

/* File : Tree.java */
/* 当前目录的无名包类 */
public class Tree
{
    public int val;
    public Tree(int x) { val = x; }
}

/* File : Run.java */
import packZ.NodePack;
public class Run
{
    public static void main(String[] args)
    {
        NodePack x = new NodePack(2);
        Tree y = new Tree(3);
        System.out.println("x :" + x.val);
        System.out.println("y :" + y.val);
    }
}
```

```shell
$ packZ> javac NodePack.java
//=======================
$ javac Tree.java
//=======================
$ javac Run.java
//=======================
$ java Run
x :2
y :3
```

#### package的目录结构

类放在包中会有两种主要的结果：

- 包名成为类名的一部分，正如我们前面讨论的一样。
- 包名必须与相应的字节码所在的目录结构相吻合。

下面是管理你自己 java 中文件的一种简单方式：

将类、接口等类型的源码放在一个文本中，这个文件的名字就是这个类型的名字，并以.java作为扩展名。例如：

```java
// 文件名 :  Car.java
package vehicle;
public class Car {
   // 类实现
}
```

接下来，把源文件放在一个目录中，这个目录要对应类所在包的名字。

```shell
....\vehicle\Car.java
```

现在，正确的类名和路径将会是如下样子：

- 类名 -> vehicle.Car

- 路径名 -> vehicle\Car.java (在 windows 系统中)

通常，一个公司使用它互联网域名的颠倒形式来作为它的包名.例如：互联网域名是 `runoob.com`，所有的包名都以 `com.runoob` 开头。包名中的每一个部分对应一个子目录。

例如：有一个 `com.runoob.test` 的包，这个包包含一个叫做 `Runoob.java` 的源文件，那么相应的，应该有如下面的一连串子目录：

```shell
....\com\runoob\test\Runoob.java
```

编译的时候，编译器为包中定义的每个类、接口等类型各创建一个不同的输出文件，输出文件的名字就是这个类型的名字，并加上 .class 作为扩展后缀。 例如：

```java
// 文件名: Runoob.java
package com.runoob.test;
public class Runoob {

}
class Google {

}
```

现在，我们用`-d`选项来编译这个文件，如下：

```shell
$javac -d . Runoob.java
```

这样会像下面这样放置编译了的文件：

```shell
.\com\runoob\test\Runoob.class
.\com\runoob\test\Google.class
```

你可以像下面这样来导入所有 `\com\runoob\test\` 中定义的类、接口等：

编译之后的 `.class` 文件应该和 `.java` 源文件一样，它们放置的目录应该跟包的名字对应起来。但是，并不要求 `.class` 文件的路径跟相应的 `.java` 的路径一样。你可以分开来安排源码和类的目录。

```shell
<path-one>\sources\com\runoob\test\Runoob.java
<path-two>\classes\com\runoob\test\Google.class
```

这样，你可以将你的类目录分享给其他的编程人员，而不用透露自己的源码。用这种方法管理源码和类文件可以让编译器和java 虚拟机（JVM）可以找到你程序中使用的所有类型。

类目录的绝对路径叫做 `class path`。设置在系统变量 `CLASSPATH` 中。编译器和 `java` 虚拟机通过将 `package` 名字加到 `class path` 后来构造 `.class` 文件的路径。

`<path- two>\classes` 是 `class path`，`package` 名字是 `com.runoob.test`,而编译器和 `JVM` 会在 `<path-two>\classes\com\runoob\test` 中找 `.class` 文件。

一个 `class path` 可能会包含好几个路径，多路径应该用分隔符分开。默认情况下，编译器和 `JVM` 查找当前目录。`JAR` 文件按包含 `Java` 平台相关的类，所以他们的目录默认放在了 `class path` 中。

#### 设置 CLASSPATH 系统变量

用下面的命令显示当前的 `CLASSPATH` 变量：

- `Windows` 平台（`DOS` 命令行下）：`C:\> set CLASSPATH`
- `UNIX` 平台（`Bourne shell` 下）：`# echo $CLASSPATH`

删除当前 `CLASSPATH`变量内容：

- `Windows` 平台（`DOS` 命令行下）：`C:\> set CLASSPATH=`
- `UNIX` 平台（`Bourne shell` 下）：`# unset CLASSPATH; export CLASSPATH`

设置 `CLASSPATH` 变量:

- `Windows` 平台（`DOS` 命令行下）： `C:\> set CLASSPATH=C:\users\jack\java\classes`
- `UNIX` 平台（`Bourne shell` 下）：`# CLASSPATH=/home/jack/java/classes; export CLASSPATH`

## Java异常处理

异常发生的原因一般有以下几类：

- 用户输入非法数据
- 打开的文件不存在
- 网络通信时连接中断，或者 `JVM` 内存溢出

一般的，又常有以下几种异常：

- **检查性异常**：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。
- **运行时错误**：运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
- **错误**：错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。

### 异常处理机制

`Java` 提供了更加优秀的解决办法：**异常处理机制**。

> 异常处理机制能让程序在异常发生时，按照代码的预先设定的异常处理逻辑，针对性地处理异常，让程序尽最大可能恢复正常并继续执行，且保持代码的清晰。
`Java` 中的异常可以是函数中的语句执行时引发的，也可以是程序员通过 `throw` 语句手动抛出的，只要在 `Java` 程序中产生了异常，就会用一个对应类型的异常对象来封装异常，JRE就会试图寻找异常处理程序来处理异常。

一般的，当程序出现异常创建异常对象后首先会查看程序本身是否含有处理异常的代码，如果没有则会交给本方法的调用者处理，而 `main` 方法的调用者是 `JVM` 虚拟机，因此最终这个异常会交给虚拟机默认处理，其默认处理方式为：异常信息展示，程序停止运行。

可以认为，`Java` 异常处理本质上是**抛出异常**和**捕获异常**。

> **抛出异常**：要理解抛出异常，首先要明白什么是异常情形（ `exception condition` ），它是指阻止当前方法或作用域继续执行的问题。其次把**异常情形和普通问题相区分**，普通问题是指在当前环境下能得到足够的信息，总能处理这个错误。对于异常情形，已经无法继续下去了，因为在当前环境下无法获得必要的信息来解决问题，你所能做的就是从当前环境中跳出，并把问题提交给上一级环境，这就是抛出异常时所发生的事情。抛出异常后，会有几件事随之发生。首先，是像创建普通的 `java` 对象一样将使用 `new` 在堆上创建一个异常对象；然后，当前的执行路径（已经无法继续下去了）被终止，并且从当前环境中弹出对异常对象的**引用**。此时，异常处理机制接管程序，并开始寻找一个恰当的地方继续执行程序，这个恰当的地方就是**异常处理程序或者异常处理器**，它的任务是将程序从错误状态中恢复，以使程序要么换一种方式运行，要么继续运行下去。

---

> **捕获异常**：在方法抛出异常之后，运行时系统将转为寻找合适的异常处理器（ `exception handler` ）。潜在的异常处理器是异常发生时依次存留在调用栈中的方法的集合。当异常处理器所能处理的异常类型与方法抛出的异常类型相符时，即为合适的异常处理器。运行时系统从发生异常的方法开始，依次回查调用栈中的方法，直至找到含有合适异常处理器的方法并执行。当运行时系统遍历调用栈而未找到合适的异常处理器，则运行时系统终止。同时，意味着 `Java` 程序的终止。

`Java` 异常机制用到的几个**关键字**：`try` 、 `catch`、`finally`、`throw`、`throws`。

- `try` ：用于**监听**。将要被监听的代码(可能抛出异常的代码)放在 `try` 语句块之内，当 `try` 语句块内发生异常时，异常就被抛出。
- `catch` ：用于**捕获异常**。`catch` 用来捕获 `try` 语句块中发生的异常。
- `finally` ：`finally` 语句块总是会被执行。它主要用于**回收在 `try` 块里打开的物力资源**(如数据库连接、网络连接和磁盘文件)。只有 `finally` 块，执行完成之后，才会回来执行 `try` 或者 `catch` 块中的 `return` 或者 `throw` 语句，如果 `finally` 中使用了 `return` 或者 `throw` 等终止方法的语句，则就不会跳回执行，直接停止。
- `throw` ：用于**抛出异常**。
- `throws` ：用在**方法签名中，用于声明该方法可能抛出的异常**。主方法上也可以使用 `throws` 抛出。如果在主方法上使用了 `throws` 抛出，就表示在主方法里面**可以不用强制性进行异常处理**，如果出现了异常，就交给 `JVM` 进行默认处理，则此时会导致程序中断执行。

### `Exception` 类的层次-异常的分类

所有的异常类是从 `java.lang.Exception` 类继承的子类。

`Exception` 类是 `Throwable` 类的子类。除了`Exception`类外， `Throwable` 还有一个子类 `Error`  。

`Java` 程序通常不捕获错误。错误一般发生在严重故障时，它们在 `Java` 程序处理的范畴之外。

`Error` 用来指示运行时环境发生的错误。

例如， `JVM` 内存溢出。一般地，程序不会从错误中恢复。

异常类有两个主要的子类： `IOException` 类和 `RuntimeException` 类。

![Throwable关系图](./assets/photos/Throwable关系图.png)

<!-- ![Throwable关系图](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/Throwable%E5%85%B3%E7%B3%BB%E5%9B%BE.png) -->

在 `Java` 内置类中(接下来会说明)，有大部分常用检查性和非检查性异常。

### `Java` 内置异常类

`Java` 语言定义了一些异常类在 `java.lang` 标准包中。

标准运行时异常类的子类是最常见的异常类。由于 `java.lang` 包是默认加载到所有的 `Java` 程序的，所以大部分从运行时异常类继承而来的异常都可以直接使用。

`Java` 根据各个类库也定义了一些其他的异常，下面的表中列出了 `Java` 的**非检查性异常**。

![非检查性异常](./assets/photos/非检查性异常.png)

<!-- ![非检查性异常](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/%E9%9D%9E%E6%A3%80%E6%9F%A5%E6%80%A7%E5%BC%82%E5%B8%B8.png) -->

下面的表中列出了 `Java` 定义在 `java.lang` 包中的**检查性异常类**。

![检查性异常](./assets/photos/检查性异常.png)

<!-- ![检查性异常](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/%E6%A3%80%E6%9F%A5%E6%80%A7%E5%BC%82%E5%B8%B8.png) -->

### 异常方法

以下是 `Throwable` 类主要的方法。

![Throwable主要方法](./assets/photos/Throwable主要方法.png)

<!-- ![Throwable主要方法](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/Throwable%E4%B8%BB%E8%A6%81%E6%96%B9%E6%B3%95.png)) -->

### try+catch(捕获异常)

使用 `try+catch` 关键字来捕捉异常。其中的代码称为保护代码，注意到此时 `try` 的生命周期只在这段捕捉块内。

```java
try
{
   // 程序代码 -- 监听代码：可能出现异常
}catch(ExceptionName e1)  // 异常对象(类型)
{
   //catch 块 -- 捕捉异常：捕获并处理try里可能出现的异常代码
}catch(ExceptionName e2)
{
    // 支持多层捕获 -- 注意父类应该在子类之后
}
```

`catch` 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，`try` 后面的 `catch` 块就会被检查。

如果发生的异常包含在 `catch` 块中，异常会被传递到该 `catch` 块，这和传递一个参数到方法是一样。

注意到，通过这种自定义捕捉异常方法而不是虚拟机默认处理方法，程序并不会按后者停止，而是根据自定义操作执行。

例子如下：

```java
// 文件名 : ExcepTest.java
import java.io.*;
public class ExcepTest
{
   public static void main(String args[]){
      try{
         int a[] = new int[2];   // 数组大小为2
         System.out.println("Access element three :" + a[3]);  // 试图输出第三个元素
      }catch(ArrayIndexOutOfBoundsException e){  // 异常类型：ArrayIndexOutOfBoundsException (数组越界)
         System.out.println("Exception thrown  :" + e);  //捕捉到异常：数组越界
      }
      System.out.println("Out of the block");  // 异常捕捉后不会结束程序，此段代码能被执行
   }
}
/* 运行后输出：
Exception thrown  :java.lang.ArrayIndexOutOfBoundsException: 3
Out of the block
*/
```

#### 常见问题

`try+catch` 使用时可能存在一些模糊的问题，在此做下简单总结。

- `try` 中无异常

此时 `try` 内代码执行而跳过 `catch` 内代码。

- `try` 异常之后的代码截断

当异常发生，程序直接跳转到 `catch` 而不执行 `try` 内异常之后的代码，从而产生截断。

- 异常发生但捕获失败

此时按照虚拟机默认处理方式对 `try` 内异常进行处理。

### throw+throws(抛出异常)

#### throw

`throw` 可以直接抛出一个明确的异常，抛出的对象一定是 `Throwable` 类或其子类。

接受 `Throwable` 对象有两种方法：在 `catch` 子句中使用参数或使用 `new` 动态创建。

程序执行完 `throw` 语句之后立即停止；`throw` 后面的任何语句不被执行，最邻近的 `try` 块用来检查它是否含有一个与异常类型匹配的 `catch` 语句。如果发现了匹配的块，控制转向该语句；如果没有发现，次包围的 `try` 块来检查，以此类推。如果没有发现匹配的 `catch` 块，默认异常处理程序中断程序的执行并且打印堆栈轨迹。

注意到内置的运行时异常都有两个构造方法：**一个没有参数，一个带有一个字符串参数**。当使用第二种时，参数指定描述异常的字符串，如果对象用作 `print()` 或 `println()` 的参数时，该字符串被显示。同样的，内置的 `getMessage()` 方法也能显示。

例子如下：

```java
class TestThrow{
    static void proc(){
        try{
            throw new NullPointerException("demo");
        }catch(NullPointerException e){
            System.out.println("Caught inside proc");
            throw e;
        }
    }

    public static void main(String [] args){
        try{
            proc();
        }catch(NullPointerException e){
            System.out.println("Recaught: "+e);
        }
    }
}
/*运行后输出：
Caught inside proc

Recaught: java.lang.NullPointerException: demo
*/
```

该程序两次处理相同的错误，首先，`main()` 方法设立了一个异常关系然后调用 `proc()`。`proc()` 方法设立了另一个异常处理关系并且立即抛出一个 `NullPointerException` 实例，`NullPointerException` 在 `main()` 中被再次捕获。

#### throws

如果一个方法**可以导致一个异常但不处理**它，它必须指定这种行为以**使方法的调用者可以保护它们自己而不发生异常**。要做到这点，我们可以在方法声明中包含一个 `throws` 子句。一个 `throws` 子句列举了一个方法**可能引发的所有异常类型**。这对于除了 `Error` 或 `RuntimeException` 及它们子类以外类型的所有异常是必要的。一个方法可以引发的所有其他类型的异常必须在 `throws` 子句中声明，否则会导致编译错误。

声明的方法一般如下：

```java
public void function() throws Exception1,Exception2
{
    // body of function
}
```

Throws抛出异常的规则：

- 如果是不受检查异常（`unchecked exception`），即 `Error` 、 `RuntimeException` 或它们的子类，那么可以不使用 `throws` 关键字来声明要抛出的异常，编译仍能顺利通过，但在运行时会被系统抛出。
- 必须声明方法可抛出的任何检查异常（`checked exception`）。即如果一个方法可能出现受可查异常，要么用 `try-catch` 语句捕获，要么用 `throws` 子句声明将它抛出，否则会导致编译错误
- 仅当抛出了异常，该方法的调用者才必须处理或者重新抛出该异常。当方法的调用者无力处理该异常的时候，应该继续抛出，而不是囫囵吞枣。
- 调用方法必须遵循任何可查异常的处理和声明规则。若覆盖一个方法，则不能声明与覆盖方法不同的异常。声明的任何异常必须是被覆盖方法所声明异常的同类或子类。

### finally

`finally` 关键字用来创建在 `try` 代码块后面执行的代码块。

无论是否发生异常，`finally` 代码块中的代码总会被执行。

在 `finally` 代码块中，可以**运行清理类型等收尾善后性质的语句**。

> `finally` 子句是可选项，可以有也可以无，但是每个 `try` 语句至少需要一个 `catch` 或者 `finally` 子句。

`finally` 代码块出现在 `catch` 代码块最后，语法如下：

```java
try{
  // 程序代码
}catch(异常类型1 异常的变量名1){
  // 程序代码
}catch(异常类型2 异常的变量名2){
  // 程序代码
}finally{
  // 程序代码
}
```

### 异常链

**异常链**顾名思义就是将异常发生的原因一个传一个串起来，即把底层的异常信息传给上层，这样逐层抛出。 Java API文档中给出了一个简单的模型：

```java
try {
    lowLevelOp();
} catch (LowLevelException le) {
    throw (HighLevelException) new HighLevelException().initCause(le);
}
```

当程序捕获到了一个底层异常，在处理部分选择了继续抛出一个更高级别的新异常给此方法的调用者。 这样异常的原因就会逐层传递。这样，位于高层的异常递归调用 `getCause()` 方法，就可以遍历各层的异常原因。 这就是 `Java异常链` 的原理。异常链的实际应用很少，发生异常时候逐层上抛不是个好注意， 上层拿到这些异常又能奈之何？而且异常逐层上抛会消耗大量资源， 因为要保存一个完整的异常链信息.

### 自定义异常

在 `Java` 中可以自定义异常。编写自己的异常类时需要记住下面的几点。

- 所有异常都必须是 `Throwable` 的子类。
- 如果希望写一个检查性异常类，则需要继承 `Exception` 类。
- 如果希望写一个运行时异常类，那么需要继承 `RuntimeException` 类。

大致步骤：

1. 定义异常类
2. 确定继承关系
3. 无参构造
4. 有参构造

例子如下：

```java
public class NumException extends RuntimeException
{
    public NumException() { }
    public NumException(String message) {
        super(message);
    }
}
```

使用大致步骤：

- 创建自定义异常类。
- 在方法中通过throw关键字抛出异常对象。
- 如果在当前抛出异常的方法中处理异常，可以使用try-catch语句捕获并处理；否则在方法的声明处通过throws关键字指明要抛出给方法调用者的异常，继续进行下一步操作。
- 在出现异常方法的调用者中捕获并处理异常。

例子如下：

```java
class MyException extends Exception {
    private int detail;
    MyException(int a){
        detail = a;
    }
    public String toString(){
        return "MyException ["+ detail + "]";
    }
}
public class TestMyException{
    static void compute(int a) throws MyException{
        System.out.println("Called compute(" + a + ")");
        if(a > 10){
            throw new MyException(a);
        }
        System.out.println("Normal exit!");
    }
    public static void main(String [] args){
        try{
            compute(1);
            compute(20);
        }catch(MyException me){
            System.out.println("Caught " + me);
        }
    }
}
/*运行输出：
Called compute(1)

Normal exit!

Called compute(20)

Caught MyException [20]
*/
```

### 通用异常

在 `Java` 中定义了两种类型的异常和错误。

- `JVM(Java虚拟机)` 异常：由 `JVM` 抛出的异常或错误。例如：`NullPointerException` 类，`ArrayIndexOutOfBoundsException` 类，`ClassCastException` 类。
- 程序级异常：由程序或者API程序抛出的异常。例如 `IllegalArgumentException` 类，`IllegalStateException` 类。

## 基本语句

### 循环语句

- `while` 循环
- `do...while` 循环
- `for` 循环
- `break` 与 `continue` 关键字

`Java` 加强 `for` 循环：

```java
for(声明语句 : 表达式)
{
   //代码句子
}
```

例子如下：

```java
int num[]={1,2,3};
for(int x : num){
    System.out.println(x);
}
```

### 条件语句

- `if` 语句
- `if...else` 语句

### switch

```java
switch(judge){
    case x:...
    case y:...
    case z:... break;
    default:...
}
```

## Stream+File+IO

参考文章：[Java—— 流(Stream)、文件(File)和IO](https://blog.csdn.net/qq_41573234/article/details/83689856)，[菜鸟教程Java Stream,File,IO](https://www.runoob.com/java/java-files-io.html)，[菜鸟教程JavaFile类](https://www.runoob.com/java/java-file.html)

### IO

Java中 I/O 操作主要是指使用 Java 进行输入，输出操作。 Java所有的I/O机制都是基于数据流进行输入输出，这些数据流表示了字符或者字节数据的流动序列。

Java 的 I/O 流提供了读写数据的标准方法。任何Java中表示数据源的对象都会提供以数据流的方式读写它的数据的方法。

### 数据流

基本流：一组有序，有起点和终点的字节的数据序列。包括输入流和输出流。

输入流：程序从输入流读取数据源。数据源包括外界(键盘、文件、网络…)，即是将数据源读入到程序的通信通道。

输出流：程序向输出流写入数据。将程序中的数据输出到外界（显示器、打印机、文件、网络…）的通信通道。

为什么设计成数据流呢？

InputStream不关心数据源来自何种设备（键盘，文件，网络）
OutputStream不关心数据的目的是何种设备（键盘，文件，网络）

**采用数据流的目的就是使得输出输入独立于设备。**

### IO体系结构

![IO体系结构](./assets/photos/IO体系结构.png)

<!-- ![IO体系结构](./assets/photos/IO体系结构.png) -->

`Java.io` 包几乎包含了所有操作输入、输出需要的类。所有这些流类代表了输入源和输出目标。

`Java.io` 包中的流支持很多种格式，比如：基本类型、对象、本地化字符集等等。

在整个Java.io包中最重要的就是5个类和一个接口。5个类指的是 `File` 、`OutputStream` 、  `InputStream` 、 `Writer` 、 `Reader` ；一个接口指的是 `Serializable` .

Java I/O主要包括如下几个层次，包含三个部分：

1.流式部分――IO的主体部分；

2.非流式部分――主要包含一些辅助流式部分的类，如：File类、RandomAccessFile类和FileDescriptor等类；

3.其他类–文件读取部分的与安全相关的类，如：SerializablePermission类，以及与本地操作系统相关的文件系统的类，如：FileSystem类和Win32FileSystem类和WinNTFileSystem类。

#### 流式部分

Java中字符是采用 `Unicode` 标准，一个字符是16位，即一个字符使用两个字节来表示。为此，JAVA中引入了处理字符的流。

- 对文件进行操作

FileInputStream（字节输入流），FileOutputStream（字节输出流），FileReader（字符输入流），FileWriter（字符输出流）

- 对管道进行操作

PipedInputStream（字节输入流）,PipedOutputStream（字节输出流），PipedReader（字符输入流），PipedWriter（字符输出流）

**PipedInputStream的一个实例要和PipedOutputStream的一个实例共同使用，共同完成管道的读取写入操作。主要用于线程操作。**

- 字节/字符数组

ByteArrayInputStream，ByteArrayOutputStream，CharArrayReader，CharArrayWriter是在内存中开辟了一个字节或字符数组。

- Buffered缓冲流

BufferedInputStream，BufferedOutputStream，BufferedReader,BufferedWriter,是带缓冲区的处理流。

**缓冲区的作用的主要目的是：避免每次和硬盘打交道，提高数据访问的效率。**

- 转化流

InputStreamReader/OutputStreamWriter，把字节转化成字符。

- 数据流

DataInputStream，DataOutputStream。

因为平时若是我们输出一个8个字节的long类型或4个字节的float类型，那怎么办呢？

可以一个字节一个字节输出，也可以把转换成字符串输出，但是这样转换费时间，若是直接输出该多好啊，因此这个数据流就解决了我们输出数据类型的困难。

数据流可以直接输出float类型或long类型，提高了数据读写的效率。

- 打印流

printStream，printWriter，一般是打印到控制台，可以进行控制打印的地方。

- 对象流

ObjectInputStream，ObjectOutputStream，把封装的对象直接输出，而不是一个个在转换成字符串再输出。

- 序列化流

SequenceInputStream。

对象序列化：把对象直接转换成二进制，写入介质中。

- Tips

使用对象流需要实现Serializable接口，否则会报错。

而若用transient关键字修饰成员变量，不写入该成员变量，若是引用类型的成员变量为null，值类型的成员变量为0.

#### 非流式部分主要类

File（文件特征与管理）：用于文件或者目录的描述信息，例如生成新目录，修改文件名，删除文件，判断文件所在路径等。

RandomAccessFile（随机文件操作）：它的功能丰富，可以从文件的任意位置进行存取（输入输出）操作。

File类：

**在Java语言的java.io包中，由File类提供了描述文件和目录的操作与管理方法。**

**但File类不是InputStream、OutputStream或Reader、Writer的子类，因为它不负责数据的输入输出，而专门用来管理磁盘文件与目录。**

作用：File类主要用于命名文件、查询文件属性和处理文件目录。

File共提供了四种不同的构造函数，如下：

- File(String pathname)

通过将给定路径名字符串转换成抽象路径名来创建一个新 File 实例。

```java
File  f1=new File("FileTest1.txt"); //创建文件对象f1，f1所指的文件是在当前目录下创建的FileTest1.txt
```

- File(URI uri)

通过将给定的 file: URI 转换成一个抽象路径名来创建一个新的 File 实例。

- File(String parent,String child)

根据 parent 路径名字符串和 child 路径名字符串创建一个新 File 实例。

```java
// 注意：D:\\dir1目录事先必须存在，否则异常
File f2=new  File(“D:\\dir1","FileTest2.txt");
```

- File(File parent,String child)

通过给定的父抽象路径名和子路径名字符串创建一个新的File实例。

```java
File  f4=new File("E：\\dir3");
File  f5=new File(f4,"FileTest5.txt");  //在如果 E：\\dir3目录不存在则需要先使用f4.mkdir()先创建
```

**一个对应于某磁盘文件或目录的File对象一经创建， 就可以通过调用它的方法来获得文件或目录的属性。**

例子：打印目录下所有文件名：

```java

/*
    打印目录下所有文件名
    DirTest.java
*/

import java.io.File;
import java.io.IOException;

class FileList{
    public static void listDir( String dir)  throws IOException{
        File file = new File(dir);
        // 传进来的可能不是一个路径
        if(!file.isDirectory()){
            throw new IOException(dir + "不是目录");
        }
        // 传进来的可能是一个错误的路径
        if(file == null){
            throw new IOException("没有此路径");
        }
        File[] files = file.listFiles();

        for(File f:files){
            // 有可能是一个多级目录，递归调用
            if(f.isDirectory()){
                listDir(f.getAbsolutePath());
            }else{
                // 是文件就直接输出该文件的绝对路径
                System.out.println(f.getAbsolutePath());
            }
        }
    }
}

public class DirTest{
    public static void main(String[] args) throws  IOException{
        FileList.listDir("E:/ACMdream");
        FileList.listDir("E:/xx");
    }
}
```

![file方法](./assets/photos/file方法.png)

<!-- ![file](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/file%E6%96%B9%E6%B3%95.png) -->

其他流类及方法参考文档，此处不做赘述。

### 标准输入输出

#### 控制台输入

Java 的控制台输入由 `System.in` 完成。

为了获得一个绑定到控制台的字符流，可以把 `System.in` 包装在一个 `BufferedReader` 对象中来创建一个字符流。

下面是创建 BufferedReader 的基本语法：

```java
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
```

BufferedReader 对象创建后，我们便可以使用 `read()` 方法从控制台读取一个字符，或者用 `readLine()` 方法读取一个字符串。

- 从控制台读取多字符输入

从 BufferedReader 对象读取一个字符要使用 `read()` 方法，它的语法如下：

```java
int read( ) throws IOException
```

每次调用 read() 方法，它从输入流读取一个字符并把该字符作为**整数值返回**。 **当流结束的时候返回 -1**。该方法抛出 IOException。

- 从控制台读取字符串

从标准输入读取一个字符串需要使用 BufferedReader 的 `readLine()` 方法。

它的一般格式是：

```java
String readLine( ) throws IOException
```

注意到，**JDK 5 后的版本我们也可以使用 `Java Scanner` 类来获取控制台的输入。**

#### 控制台输出

在此前已经介绍过，控制台的输出由 `print( )` 和 `println()` 完成。这些方法都由类 `PrintStream` 定义，`System.out` 是该类对象的一个引用。

PrintStream 继承了 `OutputStream` 类，并且实现了方法 `write()` 。这样，`write()` 也可以用来往控制台写操作。

PrintStream 定义 write() 的最简单格式如下所示：

```java
void write(int byteval)
```

**该方法将 `byteval` 的低八位字节写到流中。**

### Java中的目录

#### 创建目录

`File` 类中有两个方法可以用来创建文件夹：

- `mkdir( )`方法创建**一个文件夹**，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
- `mkdirs()` 方法创建**一个文件夹和它的所有父文件夹**。

**注意**： Java 在 UNIX 和 Windows **自动按约定分辨文件路径分隔符**。如果在 Windows 版本的 Java 中使用分隔符 (`/`) ，路径依然能够被正确解析。

#### 读取目录

一个目录其实就是一个 File 对象，它包含其他文件和文件夹。

如果创建一个 File 对象并且它是一个目录，那么调用 `isDirectory()` 方法会返回 true。

可以通过调用该对象上的 `list()` 方法，来提取它包含的文件和文件夹的列表。

#### 删除目录或文件

删除文件可以使用 `java.io.File.delete()` 方法。

需要注意的是当删除某一目录时，必须保证**该目录下没有其他文件**才能正确删除，否则将删除失败。

## Java 正则表达式

## 常用类

### String 类

### StringBuffer 和 StringBuilder 类

### Character 类

### Number & Math 类

### Scanner 类

---

## 面向对象分割线

---

## Java 继承

### 类的继承格式(extends关键字)

类的继承格式一般如下：

```java
class father{}
class son extends father{}
```

### 继承类型

**注意到Java不支持多继承，但支持多重继承**。

![继承类型](./assets/photos/继承类型.png)

<!-- ![继承类型](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/继承类型.png) -->

### 继承的特性

- 子类拥有父类**非 private 的属性、方法**。

- 子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。

- 子类可以用自己的方式实现父类的方法。

- Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 B 类继承 A 类，C 类继承 B 类，所以按照关系就是 B 类是 C 类的父类，A 类是 B 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。

- 提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）。

### 继承关键字

可以使用 `extends` 和 `implements` 这两个关键字来实现继承，而且所有的类都是继承于 `java.lang.Object` ，当一个类没有继承的两个关键字，则默认继承object（这个类在 java.lang 包中，所以不需要 import）祖先类。

- extends

通过extends来实现单一继承。如上述所示。

- implements

使用 `implements` 关键字可以**变相的使java具有多继承的特性**，使用范围为**类继承接口**的情况，可以同时继承多个接口（接口跟接口之间采用逗号分隔）。

例子如下：

```java
public interface A {
    public void eat();
    public void sleep();
}
public interface B {
    public void show();
}
public class C implements A,B {
}
```

- super 与 this

`super` 关键字：可以通过super关键字来实现**对父类成员的访问**，用来**引用当前对象的父类**。

`this` 关键字：**指向自己的引用**。

- final
`final` 关键字声明类可以把类定义为不能继承的，即最终类；或者用于修饰方法，该方法不能被子类重写：

声明类

```java
final class 类名 {//类体}
```

声明方法：

```java
修饰符(public/private/default/protected) final 返回值类型 方法名(){//方法体}
```

注:实例变量也可以被定义为 final，被定义为 final 的变量不能被修改。**被声明为 final 类的方法自动地声明为 final，但是实例变量并不是 final**。

### 构造器

**子类是不继承父类的构造器（构造方法或者构造函数）的，它只是调用（隐式或显式）。**如果父类的构造器带有参数，则必须在子类的构造器中显式地通过 `super` 关键字调用父类的构造器并配以适当的参数列表。

如果父类构造器没有参数，则在子类的构造器中不需要使用 `super` 关键字调用父类构造器，系统会自动调用父类的无参构造器。

```java
class SuperClass {
  private int n;
  SuperClass(){
    System.out.println("SuperClass()");
  }
  SuperClass(int n) {
    System.out.println("SuperClass(int n)");
    this.n = n;
  }
}
// SubClass 类继承
class SubClass extends SuperClass{
  private int n;

  SubClass(){ // 自动调用父类的无参数构造器
    System.out.println("SubClass");
  }

  public SubClass(int n){
    super(300);  // 调用父类中带有参数的构造器
    System.out.println("SubClass(int n):"+n);
    this.n = n;
  }
}
// SubClass2 类继承
class SubClass2 extends SuperClass{
  private int n;

  SubClass2(){
    super(300);  // 调用父类中带有参数的构造器
    System.out.println("SubClass2");
  }

  public SubClass2(int n){ // 自动调用父类的无参数构造器
    System.out.println("SubClass2(int n):"+n);
    this.n = n;
  }
}
public class TestSuperSub{
  public static void main (String args[]){
    System.out.println("------SubClass 类继承------");
    SubClass sc1 = new SubClass();
    SubClass sc2 = new SubClass(100);
    System.out.println("------SubClass2 类继承------");
    SubClass2 sc3 = new SubClass2();
    SubClass2 sc4 = new SubClass2(200);
  }
}
//==================================
------SubClass 类继承------
SuperClass()
SubClass
SuperClass(int n)
SubClass(int n):100
------SubClass2 类继承------
SuperClass(int n)
SubClass2
SuperClass()
SubClass2(int n):200
//===================================
```

## Java 重写(Override)与重载(Overload)

### 重写(Override)

重写是子类对父类的允许访问的方法的实现过程进行重新编写, 返回值和形参都不能改变。即**外壳不变，核心重写**。

重写的好处在于子类可以根据需要，定义特定于自己的行为。 也就是说子类能够根据需要实现父类的方法。

**重写方法不能抛出新的检查异常或者比被重写方法申明更加宽泛的异常**。例如： 父类的一个方法申明了一个检查异常 IOException，但是在重写这个方法的时候不能抛出 Exception 异常，因为 Exception 是 IOException 的父类，只能抛出 IOException 的子类异常。

在面向对象原则里，重写意味着可以重写任何现有方法。实例如下：

```java
class Animal{
    public void move(){
      System.out.println("动物可以移动");
    }
}

class Dog extends Animal{
    public void move(){
      System.out.println("狗可以跑和走");
    }
}

public class TestDog{
    public static void main(String args[]){
       Animal a = new Animal(); // Animal 对象
       Animal b = new Dog(); // Dog 对象

       a.move();// 执行 Animal 类的方法

       b.move();//执行 Dog 类的方法
    }
}
```

在上面的例子中可以看到，尽管 b 属于 Animal 类型，但是它运行的是 Dog 类的 move方法。

这是由于**在编译阶段，只是检查参数的引用类型**。

**然而在运行时，Java 虚拟机(JVM)指定对象的类型并且运行该对象的方法**。

因此在上面的例子中，**之所以能编译成功，是因为 Animal 类中存在 move 方法，然而运行时，运行的是特定对象的方法**。

假如 Dog 子类也有 Animal 类中不存在的方法，那么此时编译不会通过。

如下将抛出一个编译错误，因为b的引用类型Animal没有bark方法。

```java
class Animal{
   public void move(){
      System.out.println("动物可以移动");
   }
}

class Dog extends Animal{
   public void move(){
      System.out.println("狗可以跑和走");
   }
   public void bark(){
      System.out.println("狗可以吠叫");
   }
}

public class TestDog{
   public static void main(String args[]){
      Animal a = new Animal(); // Animal 对象
      Animal b = new Dog(); // Dog 对象

      a.move();// 执行 Animal 类的方法
      b.move();//执行 Dog 类的方法
      b.bark();
   }
}
//=================================
TestDog.java:30: cannot find symbol
symbol  : method bark()
location: class Animal
                b.bark();
                 ^
//==================================
```

注意到，当需要在子类中调用父类的被重写方法时，要使用 super 关键字。

```java
class Animal{
   public void move(){
      System.out.println("动物可以移动");
   }
}

class Dog extends Animal{
   public void move(){
      super.move(); // 应用super类的方法
      System.out.println("狗可以跑和走");
   }
}

public class TestDog{
   public static void main(String args[]){

      Animal b = new Dog(); // Dog 对象
      b.move(); //执行 Dog类的方法

   }
}
//===============================
动物可以移动
狗可以跑和走
//===============================
```

#### 方法的重写规则

- 参数列表与被重写方法的参数列表必须完全相同。

- 返回类型与被重写方法的返回类型**可以不相同**，但是必须是父类返回值的**派生类**（java5 及更早版本返回类型要一样，java7 及更高版本可以不同）。

- 访问权限不能比父类中被重写的方法的访问权限更低。例如：如果父类的一个方法被声明为 public，那么在子类中重写该方法就不能声明为 protected。

- 父类的成员方法只能被它的子类重写。

- 声明为 final 的方法不能被重写。

- **声明为 static 的方法不能被重写，但是能够被再次声明**。

- 子类和父类在同一个包中，那么子类可以重写父类所有方法，除了声明为 private 和 final 的方法。

- 子类和父类不在同一个包中，那么子类只能够重写父类的声明为 public 和 protected 的非 final 方法。

- 重写的方法能够抛出任何非强制异常，无论被重写的方法是否抛出异常。但是，重写的方法不能抛出新的强制性异常，或者比被重写方法声明的更广泛的强制性异常，反之则可以。

- 构造方法不能被重写。

- 如果不能继承一个类，则不能重写该类的方法。

### 重载(Overload)

重载( `overloading` ) 是在一个类里面，方法名字相同，而参数不同。返回类型可以相同也可以不同。

每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表。

最常用的地方就是构造器的重载。

重载规则:

- 被重载的方法必须改变参数列表(参数个数或类型不一样)；
- 被重载的方法可以改变返回类型；
- 被重载的方法可以改变访问修饰符；
- 被重载的方法可以声明新的或更广的检查异常；
- 方法能够在同一个类中或者在一个子类中被重载。
- 无法以返回值类型作为重载函数的区分标准。

## Java 多态

多态是同一个行为具有多个不同表现形式或形态的能力。

多态有如下优点：

- 消除类型之间的耦合关系
- 可替换性
- 可扩充性
- 接口性
- 灵活性
- 简化性

多态存在的三个**必要条件**

- 继承
- 重写
- **父类引用指向子类对象**：Parent p = new Child();

**当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。**

多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。

### 虚函数

虚函数的存在是为了多态。

Java 中其实没有虚函数的概念，它的普通函数就相当于 C++ 的虚函数，**动态绑定是Java的默认行为**。如果 Java 中不希望某个函数具有虚函数特性，可以**加上 final 关键字变成非虚函数**。

例子：

```java
/* File : Employee.java */
public class Employee {
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number) {
      System.out.println("Employee 构造函数");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public void mailCheck() {
      System.out.println("邮寄支票给： " + this.name
       + " " + this.address);
   }
   public String toString() {
      return name + " " + address + " " + number;
   }
   public String getName() {
      return name;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String newAddress) {
      address = newAddress;
   }
   public int getNumber() {
     return number;
   }
}
/* File : Salary.java */
public class Salary extends Employee
{
   private double salary; // 全年工资
   public Salary(String name, String address, int number, double salary) {
       super(name, address, number);
       setSalary(salary);
   }
   public void mailCheck() {
       System.out.println("Salary 类的 mailCheck 方法 ");
       System.out.println("邮寄支票给：" + getName()
       + " ，工资为：" + salary);
   }
   public double getSalary() {
       return salary;
   }
   public void setSalary(double newSalary) {
       if(newSalary >= 0.0) {
          salary = newSalary;
       }
   }
   public double computePay() {
      System.out.println("计算工资，付给：" + getName());
      return salary/52;
   }
}
/* File : VirtualDemo.java */
public class VirtualDemo {
   public static void main(String [] args) {
      Salary s = new Salary("员工 A", "北京", 3, 3600.00);
      Employee e = new Salary("员工 B", "上海", 2, 2400.00);
      System.out.println("使用 Salary 的引用调用 mailCheck -- ");
      s.mailCheck();
      System.out.println("\n使用 Employee 的引用调用 mailCheck--");
      e.mailCheck();
    }
}
//==============================
Employee 构造函数
Employee 构造函数
使用 Salary 的引用调用 mailCheck --
Salary 类的 mailCheck 方法
邮寄支票给：员工 A ，工资为：3600.0

使用 Employee 的引用调用 mailCheck--
Salary 类的 mailCheck 方法
邮寄支票给：员工 B ，工资为：2400.0
//==============================
```

例子解析：

- 实例中，实例化了两个 Salary 对象：一个使用 Salary 引用 s，另一个使用 Employee 引用 e。

- 当调用 s.mailCheck() 时，编译器在编译时会在 Salary 类中找到 mailCheck()，执行过程 JVM 就调用 Salary 类的 mailCheck()。

- e 是 Employee 的引用，但引用 e 最终运行的是 Salary 类的 mailCheck() 方法。

- 在编译的时候，编译器使用 Employee 类中的 mailCheck() 方法验证该语句， 但是在运行的时候，Java虚拟机(JVM)调用的是 Salary 类中的 mailCheck() 方法。

以上整个过程被称为虚拟方法调用，该方法被称为虚拟方法。

Java中所有的方法都能以这种方式表现，因此，重写的方法能在运行时调用，不管编译的时候源代码中引用变量是什么数据类型。

### 多态的实现方式

- 方式一：重写

- 方式二：接口

java中的接口类似于生活中的接口，就是一些方法特征的集合，但没有方法的实现。

- 方式三：抽象类和抽象方法

## Java 抽象类

在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。

抽象类除了**不能实例化对象**之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。

由于抽象类不能实例化对象，所以抽象类**必须被继承，才能被使用**。也是因为这个原因，通常在设计阶段决定要不要设计抽象类。

父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。

**在 Java 中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口。**

### 定义抽象类 (abstract class关键字)

使用 `abstract class` 关键字定义抽象类。

```java
public abstract class Root {}
```

如果试图通过抽象类实例化对象就会报错。

```java
Root px = new Root();
//====================
file.java:46: Root is abstract; cannot be instantiated
      Root e = new Root();
                   ^
1 error
```

### 继承抽象类

通过继承抽象类，可以实例化子类对象。

```java
public class Node extends Root {}
//===============================
//Root px0 = new Root(); // error
Root px1 = new Node();
Node px2 = new Node();
```

### 抽象方法

如果想设计这样一个类，该类包含一个特别的成员方法，**该方法的具体实现由它的子类确定**，那么可以在**父类中声明该方法为抽象方法**。也就是说父类中不对方法进行确定，根据不同子类确定该各自的形式。

`abstrac`t 关键字同样可以用来声明抽象方法，**抽象方法只包含一个方法名，而没有方法体**。

**抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号**。

```java
public abstract class Root
{
    public abstract void AbsMe();
}
```

声明抽象方法会造成以下两个结果：

- 如果一个类包含抽象方法，那么**该类必须是抽象类**。
- 任何子类必须**重写父类的抽象方法**，或者声明**自身为抽象类**。

继承抽象方法的子类必须重写该方法。否则，该子类也必须声明为抽象类。最终，必须有子类实现该抽象方法，否则，从最初的父类到最终的子类都不能用来实例化对象。

- Tips

1. 抽象类不能被实例化，如果试图实例化，编译无法通过。只有**抽象类的非抽象子类**可以创建对象。

2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。

3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。

4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。

5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。

### Java 封装

在面向对象程式设计方法中，封装（Encapsulation）是指一种将抽象性函式接口的实现细节部分包装、隐藏起来的方法。

封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。

要访问该类的代码和数据，必须通过严格的接口控制。

封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。

适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。

封装的优点

1. 良好的封装能够减少耦合。

2. 类内部的结构可以自由修改。

3. 可以对成员变量进行更精确的控制。

4. 隐藏信息，实现细节。

实现Java封装的步骤

1. 修改属性的可见性来限制对属性的访问（一般限制为private）。

2. 对每个值属性提供对外的公共方法访问，也就是创建一对赋取值方法，用于对私有属性的访问。

一般地，设置访问入口(如 `getter,setter` 方法)，将数据修改限制。

<!-- ![](https://gitee.com/Zhuangpx/zhuangpx-image/raw/master/javaSE/.png) -->

## Java 接口

接口（Interface），在JAVA编程语言中是一个抽象类型，是**抽象方法的集合**，接口通常以  `interface` 来声明。一个类通过继承接口的方式，从而来继承接口的抽象方法。

接口并不是类，编写接口的方式和类很相似，但是它们属于不同的概念。**类描述对象的属性和方法。接口则包含类要实现的方法**。

除非实现接口的类是抽象类，否则该类要定义接口中的所有方法。

接口**无法被实例化，但是可以被实现**。**一个实现接口的类，必须实现接口内所描述的所有方法，否则就必须声明为抽象类**。另外，在 Java 中，接口类型**可用来声明一个变量，他们可以成为一个空指针，或是被绑定在一个以此接口实现的对象**。

### 特性

接口与类相似点：

- 一个接口可以有多个方法。

- 接口文件保存在 .java 结尾的文件中，文件名使用接口名。

- 接口的字节码文件保存在 .class 结尾的文件中。

- 接口相应的字节码文件必须在与包名称相匹配的目录结构中。

接口与类的区别：

- 接口不能用于实例化对象。

- 接口没有构造方法。

- 接口中所有的方法必须是抽象方法，Java 8 之后 接口中可以使用 `default` 关键字修饰的非抽象方法。

- 接口不能包含成员变量，除了 `static` 和 `final` 变量。

- 接口不是被类继承了，而是要被类实现。

- 接口支持多继承。

接口特性

- 接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 `public abstract`（只能是 public abstract，其他修饰符都会报错）。

- 接口中可以含有变量，但是接口中的变量会被隐式的指定为 `public static final` 变量（并且只能是 public，用 private 修饰会报编译错误）。

- 接口中的方法是不能在接口中实现的，只能由实现接口的类来实现接口中的方法。

抽象类和接口的区别

1. 抽象类中的方法可以有方法体，就是能实现方法的具体功能，但是接口中的方法不行。

2. 抽象类中的成员变量可以是各种类型的，而接口中的成员变量只能是 public static final 类型的。

3. 接口中不能含有静态代码块以及静态方法(用 static 修饰的方法)，而抽象类是可以有静态代码块和静态方法。

4. 一个类只能继承一个抽象类，而一个类却可以实现多个接口。

Tips:

- JDK 1.8 以后，接口里可以有静态方法和方法体了。

- JDK 1.8 以后，接口允许包含具体实现的方法，该方法称为"**默认方法**"，默认方法使用 `default` 关键字修饰。

- JDK 1.9 以后，允许将方法定义为 `private` ，使得某些复用的代码不会把方法暴露出去。(具体见 Java 9 私有接口方法。)

### 接口声明

接口声明格式大概如下：

```java
[可见度] interface 接口名称 [extends 其他的接口名] {
        // 声明变量
        // 抽象方法
}
```

Tips：

- 接口是**隐式抽象**的，当声明一个接口的时候，不必使用abstract关键字。

- 接口中每一个**方法也是隐式抽象**的，声明时同样不需要abstract关键字。

- 接口中的**方法都是公有的**。

### 接口实现

当类实现接口的时候，类要实现接口中所有的方法。否则，类必须声明为抽象的类。

类使用 `implements` 关键字实现接口。在类声明中，Implements关键字放在class声明后面。

实现一个接口的语法大概如下：

```java
...implements 接口名称[, 其他接口名称, 其他接口名称..., ...] ...
```

例子：

```java
public class PXclass implements PXinterface {}
```

重写接口中声明的方法时，需要注意以下规则：

- **类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常**。

- 类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型。
如果实现接口的类是抽象类，那么就没必要实现该接口的方法。

在实现接口的时候，也要注意一些规则：

- 一个类可以同时实现多个接口。

- 一个类只能继承一个类，但是能实现多个接口。

- **一个接口能继承另一个接口**，这和类之间的继承比较相似。

### 接口的继承

一个接口能继承另一个接口，和类之间的继承方式比较相似。接口的继承使用extends关键字，子接口继承父接口的方法。并且和类继承不同的是，接口继承允许多继承。

```java
public interface PXinterface3 extends PXinterface1, PXinterface 2 {}
```

### 标记接口

最常用的继承接口是没有包含任何方法的接口。

标记接口是**没有任何方法和属性的接口**，它仅仅表明它的类属于一个特定的类型,供其他代码来测试允许做一些事情。

标记接口作用：简单形象的说就是给某个对象打个标（盖个戳），使对象拥有某个或某些特权。

例如：java.awt.event 包中的 MouseListener 接口继承的 java.util.EventListener 接口定义如下：

```java
package java.util;
public interface EventListener
{}
```

没有任何方法的接口被称为标记接口。标记接口主要用于以下两种目的：

- 建立一个公共的父接口：
    >正如EventListener接口，这是由几十个其他接口扩展的Java API，可以使用一个标记接口来建立一组接口的父接口。例如：当一个接口继承了EventListener接口，Java虚拟机(JVM)就知道该接口将要被用于一个事件的代理方案。

- 向一个类添加数据类型：
    >这种情况是标记接口最初的目的，实现标记接口的类不需要定义任何接口方法(因为标记接口根本就没有方法)，但是该类通过多态性变成一个接口类型。

## Java 枚举(enum)

Java 枚举是一个特殊的类，一般表示一组常量。Java 枚举类使用 `enum` 关键字来定义，各个常量使用逗号 `,` 来分割。这和 `c++` 很相似。

```java
enum PXenum
{
    PXe1,PXe2,PXe3;
}
```

### 内部类中使用枚举

注意到，枚举类也可以声明在内部类中。

每个枚举都是通过 `Class` 在内部实现的，且所有的枚举值都是 `public static final` 的。

例子：

```java
public class Test
{
    enum Color
    {
        RED, GREEN, BLUE;
    }

    // 执行输出结果
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
    }
}
//====================
//以上的枚举类 Color 转化在内部类实现：
class Color
{
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
}
```

### 迭代枚举元素

可以使用 for 语句来迭代枚举元素：

```java
enum Color
{
    RED, GREEN, BLUE;
}
public class Test {
  public static void main(String[] args) {
    for (Color myVar : Color.values()) {
      System.out.println(myVar);
    }
  }
}
```

#### values(), ordinal() 和 valueOf() 方法

`enum` 定义的枚举类默认继承了 `java.lang.Enum` 类，并实现了 `java.lang.Seriablizable` 和 `java.lang.Comparable` 两个接口。

`values()` , `ordinal()` 和 `valueOf()` 方法位于 `java.lang.Enum` 类中：

- values() 方法返回枚举类中所有的值。

- ordinal() 方法可以找到每个枚举常量的索引，就像数组索引一样。

- valueOf() 方法返回指定字符串值的枚举常量。

例子：

```java
enum Color
{
    RED, GREEN, BLUE;
}

public class Test
{
    public static void main(String[] args)
    {
        // 调用 values()
        Color[] arr = Color.values();

        // 迭代枚举
        for (Color col : arr)
        {
            // 查看索引
            System.out.println(col + " at index " + col.ordinal());
        }

        // 使用 valueOf() 返回枚举常量，不存在的会报错 IllegalArgumentException
        System.out.println(Color.valueOf("RED"));
        // System.out.println(Color.valueOf("WHITE")); // Error
    }
}
//==========================
RED at index 0
GREEN at index 1
BLUE at index 2
RED
```

### 枚举类成员

枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 `private` 访问修饰符，所以外部无法调用。

枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。

例子：

```java
enum Color
{
    RED, GREEN, BLUE;

    // 构造函数
    private Color()
    {
        System.out.println("Constructor called for : " + this.toString());
    }

    public void colorInfo()
    {
        System.out.println("Universal Color");
    }
}

public class Test
{
    // 输出
    public static void main(String[] args)
    {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
    }
}
//==============================
Constructor called for : RED
Constructor called for : GREEN
Constructor called for : BLUE
RED
Universal Color
```

### 枚举类抽象方法

枚举类中的抽象方法实现，需要枚举类中的每个对象都对其进行实现。

```java
enum Color{
    RED{
        public String getColor(){//枚举对象实现抽象方法
            return "红色";
        }
    },
    GREEN{
        public String getColor(){//枚举对象实现抽象方法
            return "绿色";
        }
    },
    BLUE{
        public String getColor(){//枚举对象实现抽象方法
            return "蓝色";
        }
    };
    public abstract String getColor();//定义抽象方法
}

public class Test{
    public static void main(String[] args) {
        for (Color c:Color.values()){
            System.out.print(c.getColor() + "、");
        }
    }
}
```

## Java 包

前面已经提到过，不再赘述。

## 参考

[菜鸟教程](https://www.runoob.com/java/java-tutorial.html)
