/*
 * @Autor: violet apricity (zpx)
 * @Date: 2021-09-27 10:44:43
 * @LastEditors: violet apricity (zpx)
 * @LastEditTime: 2021-09-27 10:54:40
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\prime.java
 * @Description: Violet && Apricity:/ The warmth of the sun in the winter /
 */
public class prime {
    public static void main(String arg[]){
        int[] pri = new int [164];
        int cnt = 0;
        boolean is = false;
        for(int i=11; i <= 999; i++) {
            is = false;
            for(int j=2; j <= Math.sqrt(i); j++) {
                if(i%j==0) {
                    is = true;
                    break;
                }
            }
            if(is==false) {
                pri[cnt++]=i;
            }
        }
        for(int i=0;i<cnt;i++){
            System.out.println("primes["+i+"]="+pri[i]);
        }
    }
}