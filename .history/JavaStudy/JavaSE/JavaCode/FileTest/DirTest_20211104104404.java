/*
 * @Autor: violet apricity ( Zhuangpx )
 * @Date: 2021-11-04 10:40:14
 * @LastEditors: violet apricity ( Zhuangpx )
 * @LastEditTime: 2021-11-04 10:44:03
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\FileTest\DirTest.java
 * @Description:  Zhuangpx : Violet && Apricity:/ The warmth of the sun in the winter /
 */

import java.io.File;
import java.io.IOException;

class Test{
    public static void listDir(String dir) throws IOException{
        File file = new File(dir);
        if(!dir.isDirectory()){
            throw new IOException(dir+"不是目录");
        }
        if(file == null ){
            throw new IOException(dir+"无此目录");
        }
        File[] files = file.listFiles();
        for(File f:files){

            if(f.isDirectory()){
                listDir(f.getAbsolutePath());
            }else{
                System.out.println(f.getAbsolutePath());
        }
    }
}