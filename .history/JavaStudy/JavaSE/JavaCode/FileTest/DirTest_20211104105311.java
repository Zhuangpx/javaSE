/*
 * @Autor: violet apricity ( Zhuangpx )
 * @Date: 2021-11-04 10:40:14
 * @LastEditors: violet apricity ( Zhuangpx )
 * @LastEditTime: 2021-11-04 10:53:11
 * @FilePath: \javaSE\JavaStudy\JavaSE\JavaCode\FileTest\DirTest.java
 * @Description:  Zhuangpx : Violet && Apricity:/ The warmth of the sun in the winter /
 */

/*
    打印目录下所有文件名
    Dir.Test.java
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