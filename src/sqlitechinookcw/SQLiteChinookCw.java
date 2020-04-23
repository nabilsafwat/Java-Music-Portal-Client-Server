/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Nabil Safwat SID 8055129
 **/
public class SQLiteChinookCw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        SQLiteChinookCw Server = new SQLiteChinookCw();
        Server.connectToClients();
        

    }
   
    private void connectToClients() {
        System.out.println("Server: Server starting.");

        try (ServerSocket serverSocket = new ServerSocket(2000)) {
            
            while (true) {
                System.out.println("Server: Waiting for connecting client...");
                
                try {
                    Socket socket = serverSocket.accept();
                    
                    ClientHandlerThread clientHandlerThread = new ClientHandlerThread(socket);
                    Thread newThread = new Thread(clientHandlerThread);
                    newThread.start();
                } catch (IOException ex) {
                    System.out.println("Server: Could not start connection to a client.");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Server: Closed down");
        }
    }

    /**
     *
     * @param populateList
     */
    
 }
