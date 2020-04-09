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
 * This class is our main class for the server-side program. At the moment it
 * demonstrates how to make a connection to the SQLite database and then just
 * outputs the data to the console. But ideally this class should start a
 * (perhaps threaded) server via server sockets (to-do) and then either access
 * the SQLite database as need be, or let each thread do the SQLite access.
 *
 * @author Chris Bass
 */
public class SQLiteChinookCw {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SQLiteChinookCw Server = new SQLiteChinookCw();
        Server.connectToClients();
        /*SQLiteChinookCw app = new SQLiteChinookCw();
        ArrayList<Track> trackList = new ArrayList<>();
        app.readAll(trackList);

        /*System.out.println("main: ");
        for (Track t : trackList) {
            System.out.print(t);
            System.out.print(" | ");
            System.out.println("");
        } */

    }
    
    private void connectToClients() {
        System.out.println("Server: Server starting.");

        try (ServerSocket serverSocket = new ServerSocket(2000)) {
            
            while (true) {
                System.out.println("Server: Waiting for connecting client...");
                
                try {
                    Socket socket = serverSocket.accept();
                    
                    ClientHandlerThread clientHandlerThread = new ClientHandlerThread(socket);
                    Thread connectionThread = new Thread(clientHandlerThread);
                    connectionThread.start();
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
     * This function simply reads the first 10 records / rows from the tracks
     * table in our SQLite database and then outputs them to the console for
     * testing, it also parses the result set and puts the records into a
     * data-structure. We have made it a synchronized method so that it prevents
     * any issue with thread interference or data races.
     *
     * @param populateList the data structure to populate with data from the
     * database
     */
    public synchronized void readAll(ArrayList<Track> populateList) {

        String selectSQL = "SELECT * FROM tracks limit 10"; // lets just get the first 10 records for testing

        try ( Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                  PreparedStatement prep = conn.prepareStatement(selectSQL);) {

            ResultSet resultSet = prep.executeQuery();

            // now rows
            while (resultSet.next()) {
                Track track = new Track(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getInt(3),
                        resultSet.getInt(4),
                        resultSet.getInt(5),
                        resultSet.getString(6),
                        resultSet.getInt(7),
                        resultSet.getInt(8),
                        resultSet.getDouble(9));
                populateList.add(track);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
