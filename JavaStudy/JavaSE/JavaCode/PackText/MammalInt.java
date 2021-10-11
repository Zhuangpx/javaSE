/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-10-11 14:30:47
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-10-11 14:48:56
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\PackText\MammalInt.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
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