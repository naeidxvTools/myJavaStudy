package net.imwork.zhanlong;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClientDemo
{
    public static void main(String[] args) throws Exception
    {
        System.out.println("=========启动客户端=======");
        byte[] buffer = "今晚，约🐎".getBytes();
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length,
                InetAddress.getLocalHost(),6666);

        DatagramSocket socket = new DatagramSocket();

        socket.send(packet);

        socket.close();

    }
}
