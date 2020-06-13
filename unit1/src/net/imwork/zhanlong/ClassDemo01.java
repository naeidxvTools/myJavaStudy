package net.imwork.zhanlong;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author 展龙
 */
public class ClassDemo01
{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("🔒☎🦊 🐶 🐴 🐒 🐶 🐒 🐴 🐰 🖌 ✏ 📱 ☎ 📺 🔦  🥢 🔑 💊 ");

//        game();

        Map<String, String> map = new LinkedHashMap<>();

        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");

        System.out.println(map);
        System.out.println(map.containsValue("value3"));
        System.out.println(map.containsKey("key1"));
    }


    public static void game()
    {
        System.out.println("===============欢迎进入系统===============");
        System.out.println("输入exit退出.");

        while (true)
        {
            System.out.print("请输入姓名: ");
            String name = scanner.nextLine();
            System.out.print("请输入学号: ");
            String number  = scanner.nextLine();
            System.out.print("请输入年龄: ");
            String age = scanner.nextLine();

            Student student = new Student(name, number, Integer.parseInt(age));

            System.out.println(student);
            if ("exit".equals(scanner.nextLine()))
            {
                System.exit(0);
            }
        }


    }
}

class Student
{
    private String name;
    private String number;
    private int age;


    public Student()
    {
    }

    public Student(String name, String number, int age)
    {
        this.name = name;
        this.number = number;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName()
    {
        return name;
    }

   public void setName(String name)
    {
        this.name = name;
    }

    /**
     * 获取
     * @return number
     */
    public String getNumber()
    {
        return number;
    }


    public void setNumber(String number)
    {
        this.number = number;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge()
    {
        return age;
    }


    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{name = " + name + ", number = " + number + ", age = " + age + "}";
    }
}








