package com.coffee;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileMD5FromURL {

    public static String getFileMD5(String fileURL) {
        try (InputStream inputStream = new URL(fileURL).openStream()) {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[8192];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                md.update(buffer, 0, bytesRead);
            }
            byte[] digest = md.digest();
            return bytesToHex(digest);
        } catch (IOException e) {
            System.err.println("无法读取文件: " + e.getMessage());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("MD5算法不可用: " + e.getMessage());
        }
        return null;
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String url1 = "https://hyweb-test.cdn.huya.com/web_admin_giftAndroidExtendMaterial/ea538e67005a4ecea047d3fe1acf82b1.zip?md5=078ca14161c0dc9a755f83faecb957fa";
        String url2 = "https://hyweb-test.cdn.huya.com/web_admin_giftAndroidExtendMaterial/6114e6cce156463a854fafb80500838b.zip";

        String md5_1 = getFileMD5(url1);
        String md5_2 = getFileMD5(url2);

        System.out.println("URL1 MD5: " + md5_1);
        System.out.println("URL2 MD5: " + md5_2);

        if (md5_1 != null && md5_2 != null && md5_1.equals(md5_2)) {
            System.out.println("两个文件的MD5哈希值相同。");
        } else {
            System.out.println("两个文件的MD5哈希值不同。");
        }
    }
}