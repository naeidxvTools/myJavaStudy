package net.imwork.zhanlong;

public class FileDemo
{
    public static void main(String[] args)
    {
//        File f = new File("E:\\Java进阶13天视频+资料\\java进阶13天资料\\day09-方法引用, Stream流，File类  , 递归 ，字节流\\code\\Day09Demo\\src\\com\\itheima");
//
//        String[] list = f.list();
//        for (String s : list)
//        {
//            System.out.println(s);
//        }

        int result = f(15);
        System.out.println(result);



    }

    public static int f(int n)
    {
        if (1 == n)
        {
            return 1;
        } else
        {
            return f(n - 1) * n;
        }
    }
}
