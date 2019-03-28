package com.demo.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * @author JOSEPH.L
 * @date 2019-03-03
 * */
public class Server {
    public static void main(String[] args) {
        try {
            //1.創建一個服務器端Socket，即ServerSocket,指定綁定的端口，並監聽次端口
            ServerSocket serverSocket = new ServerSocket(8888);
            //2.調用accept()方法開始監聽，等待客戶端的連接
            System.out.println("******服務器端已經啟動，等待客戶端的連接*******");
            Socket socket = serverSocket.accept();
            //3.獲取輸入流，並讀取客戶端信息
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String info = null;
            while ((info = br.readLine()) != null) {
                //循環讀取客戶端信息
                System.out.println("我是服務器，客戶端說：" + info);
            }
            socket.shutdownInput(); //關閉輸入流

            //獲取輸出流，相應客戶端的請求
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("歡迎您");
            pw.flush(); //條用flush()方法將緩衝輸出

            //關閉資源
            br.close();
            isr.close();
            is.close();
            socket.close();
            serverSocket.close();
        } catch (IOException ex) {
            //輸出異常
            ex.printStackTrace();
        }
    }
}
