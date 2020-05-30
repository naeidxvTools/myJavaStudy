package net.imwork.zhanlong;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

public class ClientDemo1
{

    public static void main(String[] args) throws IOException, InterruptedException
    {
//        1.客户端要请求于服务端的socket管道连接。
        Socket socket = new Socket("127.0.0.1", 9999);
//        2.从socket通信管道中得到一个字节输出流
        OutputStream os = socket.getOutputStream();
//        3.通过字节输出流给服务端写出数据。
        PrintStream ps = new PrintStream(os);

        ps.println("你好，我是展龙，很高兴能见到你!");
        ps.flush();

        socket.shutdownOutput();
        System.out.println("客户端发送完数据~~");


    }

}
