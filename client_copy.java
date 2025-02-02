import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.io.*;

public class client_copy
{
   Socket socket;
   BufferedReader br;
   PrintWriter out;
   public client_copy() {
      try {
         System.out.println("Sending req. to server");
         socket = new Socket("127.0.0.1", 7777);
         System.out.println("Connection Established ");
         br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//
         out = new PrintWriter(socket.getOutputStream());
         startReading();
         startWriting();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
   public void startReading() {
      // thread to read the data from the clien
      Runnable r1 = () -> {
         while (true) {
            try {
               String msg = br.readLine();
               if (msg.equals("exit")) {
                  System.out.println("Server  Terminated the chat ");
                  break;
               }
               System.out.println("Server :" + msg);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      };
      new Thread(r1).start();
   }
   public void startWriting() {
      Runnable r2 = () -> {// thread - take data from the user and send to client
         System.out.println("writer started ");
         while (true) {
            try {
               BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
               String content = br1.readLine();
               out.println(content);
               out.flush();
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      };
      new Thread(r2).start();
   }

   public static void main(String[] args) {
      System.out.println("CLIENT is started");
      new client();
   }
}
