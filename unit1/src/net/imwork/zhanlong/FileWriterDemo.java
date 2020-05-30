package net.imwork.zhanlong;

import java.io.*;

public class FileWriterDemo
{
    public static void main(String[] args) throws Exception
    {
//        FileOutputStream fos = new FileOutputStream("unit1/test2");
//        fos.write(97);
//        fos.close();

//        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"));
//
//
//        FileWriter writer = new FileWriter("unit1/test1.txt");
//
//        writer.write(98);
//        writer.write("中国");
//
//        writer.close();

        BufferedReader br = new BufferedReader(new FileReader("unit1/test1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("unit1/test2.txt", true));

        String line;

        while (null != (line = br.readLine()))
        {
            bw.write(line);
            bw.newLine();
        }

        try (FileOutputStream fos = new FileOutputStream("unit1/test2.txt"))
        {
            fos.write("zhanlong".getBytes());
        } catch (Exception e)
        {

        }


        bw.close();
        br.close();


    }
}
