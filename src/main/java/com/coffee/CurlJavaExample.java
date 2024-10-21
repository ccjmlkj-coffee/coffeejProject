package com.coffee;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class CurlJavaExample {
        public static void main(String[] args) {
            try {
                // 请求URL
                URL url = new URL("http://ai-wukong-gz-test2.huya.info/qrcode");

                // 创建连接
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // 设置请求方法为POST
                connection.setRequestMethod("POST");

                // 允许输出到服务器
                connection.setDoOutput(true);

                // 设置请求参数
                String parameters = "dtype=image" +
                        "&url=" + URLEncoder.encode("http://p2td-cv.oss-cn-shenzhen.aliyuncs.com/sijiyu/imgs/qrcode.pngUTF-8") +
                        "&pid=123456" +
                        "&contents=qrcode";

                // 发送请求参数
                DataOutputStream out = new DataOutputStream(connection.getOutputStream());
                out.writeBytes(parameters);
                out.flush();
                out.close();

                // 获取响应结果
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                // 输出响应结果
                System.out.println(response.toString());

                // 关闭连接
                connection.disconnect();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

