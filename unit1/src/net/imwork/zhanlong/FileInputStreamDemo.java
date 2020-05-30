package net.imwork.zhanlong;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo
{
    public static void main(String[] args) throws Exception
    {

        File file = new File("unit1/test.txt");

        FileInputStream fis = new FileInputStream(file);

//        int ch = 0;
//
//        while (-1 != (ch = fis.read()))
//        {
//            System.out.print((char)ch);
//        }
        int length = 0;

        byte[] buf = new byte[10];

        while (-1 != (length = fis.read(buf)))
        {
            System.out.println();
        }


    }
}
