package com.demo.socket;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author JOSEPH.L
 * @date 2019-03-03
 * */
public class Client {
    public static void main(String[] args) {
        try{
            //1.創建客戶端Socket,指定服務器地址和端口
            Socket socket = new Socket("localhost",8888);
            //2.獲取輸出流，向服務器端發送信息
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("用戶名稱：admin;密碼：132456789");
            pw.flush();
            socket.shutdownOutput();

            //關閉資源
            pw.close();
            os.close();
            socket.close();
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
