package net.imwork.zhanlong;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo
{
    public static void main(String[] args)
    {
        MyThread myThread = new MyThread();
        myThread.start();

        new MyThread("线程2").start();


        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                for (int i = 0; i < 50; i++)
                {
                    try
                    {
                        Thread.sleep(100);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "============" + (i + 1));
                }
            }
        }).start();

        new Thread(new FutureTask<String>(new MyThread2())).start();


        for (int i = 0; i < 50; i++)
        {
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "================" + (i + 1));
        }
    }

}

class MyThread2 implements Callable<String>
{
    @Override
    public String call() throws Exception
    {
        int sum = 0;
        for (int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "===>" + i);
            sum += i;
        }
        return Thread.currentThread().getName() + "执行的结果是：" + sum;
    }
}

class MyThread extends Thread
{

    public MyThread(String name)
    {
        super(name);
    }

    public MyThread()
    {
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++)
        {
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "============" + (i + 1));
        }
    }
}

