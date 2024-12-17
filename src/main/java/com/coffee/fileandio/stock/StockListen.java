package com.coffee.fileandio.stock;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StockListen {
    public static void main(String[] args) {
        // 使用Socket接收消息
        try {
            ServerSocket serverSocket = new ServerSocket(12301);
            Socket socket = serverSocket.accept();
            InputStream inputStream = socket.getInputStream();
            byte[] buffer = new byte[8];
            int bytesRead = inputStream.read(buffer);
            String receivedMessage = new String(buffer, 0, bytesRead);
            System.out.println(receivedMessage);
//            socket.close();
//            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
