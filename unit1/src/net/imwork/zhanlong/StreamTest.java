package net.imwork.zhanlong;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");
        System.out.println(list);

        Stream<String> stream = list.stream().map(s -> "九职院：" + s);

//        List<String> collect = stream.collect(Collectors.toList());
//        for (String s : collect)
//        {
//            System.out.println(s);
//        }

        String[] strings = stream.toArray(String[]::new);
        for (String string : strings)
        {
            System.out.println(string);
        }


    }
}
