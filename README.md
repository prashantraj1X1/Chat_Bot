# Java Socket Chat Application

## 1.Overview

- This is a simple chat application built using Java Socket Programming. The application enables real-time communication between a client and a server over a network using TCP sockets.

## 2.Features

- Supports multiple clients (optional enhancement with threading)

- Real-time messaging using Java sockets

- Simple command-line interface (CLI)

- Secure and efficient data transmission

## 3.Technologies Used

- Java

- Java Sockets (ServerSocket, Socket)

- Input/Output Streams

- Multithreading (for multiple clients)
  
## 4.Installation & Setup Prerequisites

- Java Development Kit (JDK) installed

- Basic knowledge of Java programming

## 5.Steps to Run

 #### 5.1:Clone the repository
 ```bash
 git clone https://github.com/yourusername/chat-app-java.git
 cd chat-app-java
 ```
 #### 5.2:Compile the Java files

 ```bash
 javac Server.java Client.java
```

 ### 5.3:Start the server

```bash 
java Server
```

 ### 5.4:Start the client (in a new terminal window)

 ```bash 
 java Client
```

### 5.5:Begin Chatting

  - The client can send messages to the server.

  - The server receives and responds accordingly.

## 6.Project Structure
```
chat-app-java/
│── Server.java  # Handles client connections and message broadcasting
│── Client.java  # Connects to the server and allows message sending/receiving
│── README.md    # Project documentation
```
## 7.How It Works

- The server listens for incoming client connections on a specific port.

- The client connects to the server using an IP address and port.

- The client sends messages to the server, and the server processes and relays messages to other connected clients.

- If multiple clients are supported, the server uses multithreading to handle them concurrently.

## 8.Future Enhancements

- Implement GUI using Java Swing/JavaFX.

- Add end-to-end encryption for secure messaging.

- Introduce file transfer capability.

- Improve error handling and logging.

## 9.Contributing

Feel free to fork this repository and submit pull requests with improvements!

## 10.License

This project is licensed under the MIT License - see the LICENSE file for details.

