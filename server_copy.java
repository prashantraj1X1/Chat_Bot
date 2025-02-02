import java.net.*;
import java.io.*;


class server_copy {
    // constructor
    Serversocket server;
    Socket socket;
    BufferedReader br;
    PrintWriter out;

    public server_copy() {
        try {
            ServerSocket server = new ServerSocket(7777);//
            System.out.println("server is ready to accept the connection..");
            System.out.println("waiting......");
            socket = server.accept(); // accepting the request from the client and storing it in the socket
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));//
            out = new PrintWriter(socket.getOutputStream());
            startReading();
            startWriting();
        } catch (Exception e) {
            e.printStackTrace(); // prints the stack trace
        }
        server = new Serversocket(); // socket with port no and storing the value in socket int b
    }
    public void startReading() {
        // thread to read the data from the clien
        Runnable r1=()->{
            while(true)
            {
                try{
                String msg=br.readLine();
                if(msg.equals("exit")){
                    System.out.println("client Terminated the chat ");
                    break;
                }
                System.out.println("Client :"+msg);   
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    };
    new Thread (r1).start();
    }

    public void startWriting() {
    Runnable r2 =() -> {// thread - take data from the user and send to client
        System.out.println("writer started ");
    while (true){
        try{   
            BufferedReader br1=new BufferedReader( new InputStreamReader(System.in));
            String content=br1.readLine();
            out.println(content);
            out.flush();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    };  
    new Thread(r2).start();
    }

    public static void main(String[] args) {
        System.out.println("this is to start the  server");
        new server();// obj. of server
    }
}