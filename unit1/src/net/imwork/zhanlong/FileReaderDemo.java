package net.imwork.zhanlong;


import java.io.FileReader;

public class FileReaderDemo
{
    public static void main(String[] args) throws Exception
    {
        FileReader fr = new FileReader("unit1/test.txt");

//        int code;
//
//        while(-1 != (code = fr.read()))
//        {
//            System.out.print((char) code);
//        }

        int length = 0;
        char[] buff = new char[3];
        while (-1 != (length = fr.read(buff)))
        {
            System.out.print(new String(buff, 0, length));
        }
    }
}
