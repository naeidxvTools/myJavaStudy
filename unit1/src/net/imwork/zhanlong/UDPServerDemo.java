package net.imwork.zhanlong;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServerDemo
{
    public static void main(String[] args) throws Exception
    {
        DatagramSocket socket = new DatagramSocket(6666);

        byte[] buffered = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffered, buffered.length);

        System.out.println("服务器在监听中..............");
        socket.receive(packet);

        System.out.println(new String(buffered, 0, packet.getLength()));

        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(packet.getPort());


    }
}
