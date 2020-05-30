package net.imwork.zhanlong;

import java.io.File;
import java.io.IOException;

public class FileDemo2
{
    public static void main(String[] args)
    {

        searchFiles(new File("c:/"),"git-bash.exe");
    }

    /**
     *
     * @param dir 搜索文件的目录
     * @param fileName 搜索文件的名字
     */
    public static void searchFiles(File dir, String fileName)
    {
        // 1.判断是否存在该路径，是否是文件夹
        if (dir.exists() && dir.isDirectory())
        {
            // 2.提取当前目录下的全部一级文件对象
            File[] files = dir.listFiles();

            // 3.判断是否存在一级文件对象（判断是否不为空目录）
            if (files != null && files.length > 0)
            {
                // 4.判断一级文件对象
                for (File file : files)
                {
                    if (file.isFile())
                    {
                        if (file.getName().equals(fileName))
                        {
                            System.out.println(fileName + ": 存在。" + file.getAbsolutePath());
                            // 启动它
                            Runtime runtime = Runtime.getRuntime();
                            try
                            {
                                runtime.exec(file.getAbsolutePath());
                            } catch (IOException e)
                            {
                                e.printStackTrace();
                            }
                        }
                    }else
                    {
                        searchFiles(file,fileName);
                    }
                }
            }
        }
    }
}
