package net.imwork.zhanlong;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClassDemo03
{
    public static void main(String[] args) throws Exception
    {

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date hello = sdf.parse("hello");
        InputStream is = new FileInputStream("zhanlong.xtx");


        System.out.println("程序结束。");

    }
}
