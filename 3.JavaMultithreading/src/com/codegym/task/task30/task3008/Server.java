package com.codegym.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();


    public static void sendBroadcastMessage(Message message){
        for (Connection connection : connectionMap.values()) {
            try {
                connection.send(message);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("The message couldn't be sent");
            }
        }
    }

    private static class Handler extends Thread{
        private Socket socket;

        public Handler(Socket socket){
            this.socket = socket;
        }

        @Override
        public void run() {
            ConsoleHelper.writeMessage("Connection has been established with remote address " + socket.getRemoteSocketAddress());
            String userName = null;

            try(Connection connection = new Connection(socket)) {
                userName = serverHandshake(connection);
                connectionMap.put(userName, connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);

                connectionMap.remove(userName);
                sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
                ConsoleHelper.writeMessage("Connection with " + socket.getRemoteSocketAddress() + " closed.");

            } catch (IOException | ClassNotFoundException e) {}





        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException{
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST));
                Message response = connection.receive();

                if (response.getType().equals(MessageType.USER_NAME)) {
                    String data = response.getData();

                    if (data != null && !(data.isEmpty()) && !connectionMap.containsKey(data)) {
                            connectionMap.put(data, connection);
                            connection.send(new Message(MessageType.NAME_ACCEPTED));
                            return data;
                    }
                }

            }
        }


        private void notifyUsers(Connection connection, String userName) throws IOException{
            for (Map.Entry<String, Connection> pair : connectionMap.entrySet()) {
                if(!userName.equals(pair.getKey()))
                    connection.send(new Message(MessageType.USER_ADDED, pair.getKey()));
            }
        }


        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException{
            while (true){
                Message receivedMessage = connection.receive();
                if (receivedMessage.getType().equals(MessageType.TEXT)){
                    Message textMessage = new Message(MessageType.TEXT, String.format("%s: %s", userName, receivedMessage.getData()));
                    sendBroadcastMessage(textMessage);
                }
                else {
                    String error = "Not text error";
                    ConsoleHelper.writeMessage(error);
                }
            }

        }
    }


    public static void main(String[] args) throws IOException {
        ConsoleHelper.writeMessage("Server is running");
        try(ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())){
            while(true){
                new Handler(serverSocket.accept()).start();
            }
        } catch (Exception e){
            ConsoleHelper.writeMessage(e.getMessage());
        }


    }
}
