package net.imwork.zhanlong;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo
{
    public static void main(String[] args) throws IOException
    {
        InetAddress address = InetAddress.getLocalHost();

        System.out.println(address.getHostAddress());

        System.out.println(address.getHostName());

        System.out.println(address.isReachable(5000));
    }
}
