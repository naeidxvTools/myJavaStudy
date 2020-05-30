package net.imwork.zhanlong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo1
{
    public static void main(String[] args) throws IOException
    {
//        1.注册端口。
        ServerSocket ss = new ServerSocket(9999);
//        2.接收客户端的Socket管道连接。
        System.out.println("服务器在监听中.....");
        Socket socket = ss.accept();

//        3.从socket通信管道中得到一个字节输入流。
        InputStream is = socket.getInputStream();

//        4.从字输入流中读取客户端发来的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String line = null;

        while (null != (line = br.readLine()))
        {
            System.out.println(line);
        }

    }

}
