import java.net.*;
import java.io.*;

class server {
    // constructor
    Serversocket server;
    Socket socket;

    public server() {
        try {

        } catch (Exception e) {

        }
        server = new Serversocket();// socket with port no and storing the value in socket
//  int b
    }

    public static void main(String[] args) {
        System.out.println("this is to start the  server");
        new server();// obj of server
    }
}