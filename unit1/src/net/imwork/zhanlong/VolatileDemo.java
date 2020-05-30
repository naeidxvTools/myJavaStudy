package net.imwork.zhanlong;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatileDemo extends Thread
{
    private volatile boolean flag = false;

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        flag = true;
        System.out.println("flag = " + flag);
    }

    public boolean isFlag()
    {
        return flag;
    }

    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }

}

class MyRunnable implements Runnable
{
    AtomicInteger integer = new AtomicInteger(100);

    public static Map<String, String> maps = new ConcurrentHashMap<>();

    @Override
    public void run()
    {
        integer.getAndAdd(1);
    }
}


class VisibilityDemo
{
    public static void main(String[] args)
    {
        MyRunnable target = new MyRunnable();

        Thread t = new Thread(target);
        t.start();

        VolatileDemo t1 = new VolatileDemo();

        t1.start();

        while (true)
        {
            if (t1.isFlag())
            {
                System.out.println("主线程进入执行。");
            }
        }
    }
}