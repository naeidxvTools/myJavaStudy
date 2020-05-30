package net.imwork.zhanlong;

public abstract class MyAbstract
{
    public String name;
    public MyAbstract(String name)
    {
        this.name = name;
    }

    public void show()
    {
        System.out.println("show");
    }

    public abstract void method();
}
