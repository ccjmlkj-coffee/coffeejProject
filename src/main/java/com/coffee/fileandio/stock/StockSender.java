package com.coffee.fileandio.stock;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StockSender {

    public static void main(String[] args) {


        // 使用Socket发送消息
        try {
            byte one = -24;
            byte two = -90;
            byte three = -127;
            byte four = 0x25;
            byte five = 2;
            byte six = 3;
            byte[] myBytes = new byte[]{one,two,three,four,five,six};
            System.out.println(new String(myBytes,0,6));

            Socket socket = new Socket("127.0.0.1", 12301);
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("要发送的消息内容".getBytes());
            byte[] bytes = "要发送的消息内容".getBytes();
            System.out.println(new String(myBytes,0,3));
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
