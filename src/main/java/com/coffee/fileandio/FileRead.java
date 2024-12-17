package com.coffee.fileandio;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;

public class FileRead {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("");
        FileChannel fileChannel = fis.getChannel();
//        fileChannel.re
        ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
        serverSocketChannel.bind(new InetSocketAddress(InetAddress.getLocalHost(), 9091));
        serverSocketChannel.accept();

    }
}
