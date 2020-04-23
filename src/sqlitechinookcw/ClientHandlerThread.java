/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

/**
 * @author Nabil Safwat SID 8055129
 **/
public class ClientHandlerThread implements Runnable {

    private final Socket socket;
    //private final HashMap<String, String> hashMapNames;
    
    //private final PrintWriter printWriter;
    //private final BufferedReader bufferedReader;
    
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    
    
    private static int connectionCount = 0;
    private final int connectionNumber;
    
    Track track = new Track();
    Media_types media = new Media_types();

    /**
     * Constructor just initialises the connection to client.
     * 
     * @param socket the socket to establish the connection to client.
     * @param hashMapNames a reference to the lookup table for getting email.
     * @throws IOException if an I/O error occurs when creating the input and
     * output streams, or if the socket is closed, or socket is not connected.
     */
    public ClientHandlerThread(Socket socket) throws IOException {
        this.socket = socket;
        //this.hashMapNames = hashMapNames;
        
        objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectInputStream = new ObjectInputStream((socket.getInputStream()));
        
       
        
        
        connectionCount++;
        connectionNumber = connectionCount;
        System.out.println("Connection " + connectionNumber + " established.");
    }

    /**
     * The run method is overridden from the Runnable interface. It is called
     * when the Thread is in a 'running' state - usually after thread.start()
     * is called. This method reads client requests and processes names until
     * an exception is thrown.
     */
    @Override
    public void run() {
        // Read and process names until an exception is thrown.
        System.out.println("Waiting for data from client...");
        
        Parcel parcelRead;
                    
        try {
            while ((parcelRead = (Parcel)objectInputStream.readObject()) != null) {
                System.out.println("Server: Read data from client: " + parcelRead + ".");
                ArrayList<Track> trackList = new ArrayList<>();
                ArrayList<Media_types> mediaList = new ArrayList<>();
                if(parcelRead.getTrack()!= null && parcelRead.getTrack().getTrackSending() == true){
                   callTheSynchroTracks(trackList);
                   track = new Track(trackList);
                   objectOutputStream.writeObject(new Parcel(track, media));
                   
                   }
                
                
                else if(parcelRead.getMedia()!= null && parcelRead.getMedia().getMediaSending() == true){
                   callTheSynchroMedia(mediaList);
                   media = new Media_types(mediaList);
                   objectOutputStream.writeObject(new Parcel(track, media));
                   
                 } 
                
                
                else if(parcelRead.getTrack() != null && parcelRead.getTrack().getTrackAdding() == true){
                  
                  callTheInsertTrack(parcelRead.getTrack().getTrackId(),parcelRead.getTrack().getName(),parcelRead.getTrack().getAlbumId(),parcelRead.getTrack().getMediaTypeId(),parcelRead.getTrack().getGenreId(),parcelRead.getTrack().getComposer(),parcelRead.getTrack().getMilliseconds(),parcelRead.getTrack().getBytes(),parcelRead.getTrack().getUnitPrice());
                
                
                }
                
                
                else if(parcelRead.getMedia() != null && parcelRead.getMedia().getMediaAdding() == true){
                
                  callTheInsertMedia(parcelRead.getMedia().getName(),parcelRead.getMedia().getMediaTypeId());
                
                
                }
                
                
                else if(parcelRead.getTrack() != null && parcelRead.getTrack().getTrackDeleting() == true){
                
                  callTheDeleteTrack(parcelRead.getTrack().getTrackId());
                
                
                }
                
                
                else if(parcelRead.getMedia() != null && parcelRead.getMedia().getMediaDeleting() == true){
                
                  callTheDeleteMedia(parcelRead.getMedia().getMediaTypeId());
                
                
                }
                
                
                else if(parcelRead.getTrack() != null && parcelRead.getTrack().getTrackEditing() == true){
                
                  callTheEditTrack(parcelRead.getTrack().getTrackId(),parcelRead.getTrack().getName(),parcelRead.getTrack().getAlbumId(),parcelRead.getTrack().getMediaTypeId(),parcelRead.getTrack().getGenreId(),parcelRead.getTrack().getComposer(),parcelRead.getTrack().getMilliseconds(),parcelRead.getTrack().getBytes(),parcelRead.getTrack().getUnitPrice());
                
                
                }
                
                
                else if(parcelRead.getMedia() != null && parcelRead.getMedia().getMediaEditing() == true){
                
                
                  callTheEditMedia(parcelRead.getMedia().getName(),parcelRead.getMedia().getMediaTypeId());
                
                }
                
               
            }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(ClientHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                try {
                    System.out.println("We have lost connection to client " + connectionNumber + ".");
                    socket.close();
                } catch (IOException ex) {
                    Logger.getLogger(ClientHandlerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }



    public synchronized void callTheSynchroTracks(ArrayList<Track> populateList){

        String selectSQL = "SELECT * FROM tracks"; // Print all tracks on screen

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
    
    public synchronized void callTheSynchroMedia(ArrayList<Media_types> populateList) {
        
        String selectSQL = "SELECT * FROM media_types"; // Print all media types on screen

        try ( Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                  PreparedStatement prep = conn.prepareStatement(selectSQL);) {

            ResultSet resultSet = prep.executeQuery();

            // now rows
            while (resultSet.next()) {
                Media_types media = new Media_types(
                        resultSet.getInt(1),
                        resultSet.getString(2));
                
                        
                populateList.add(media);
                System.out.println(media);
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public synchronized void callTheInsertTrack(int trackId, String name, int albumId, int mediaTypeId, int genreId, String composer, int milliseconds, int bytes, double unitPrice){
         
         String selectSQL = "INSERT INTO Tracks(trackId,name,albumId,mediaTypeId,genreId,composer,milliseconds,bytes,unitPrice) VALUES(?,?,?,?,?,?,?,?,?)";
    
         try (Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                 PreparedStatement prep = conn.prepareStatement(selectSQL);) {
             
                  
                  prep.setInt(1, trackId);
                  prep.setString(2, name);
                  prep.setInt(3, albumId);
                  prep.setInt(4, mediaTypeId);
                  prep.setInt(5, genreId);
                  prep.setString(6, composer);
                  prep.setInt(7, milliseconds);
                  prep.setInt(8, bytes);
                  prep.setDouble(9, unitPrice);
                  
                  prep.executeUpdate();
                  
                 
    
         } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }  
    public synchronized void callTheInsertMedia(String name,int mediaTypeId){
         
         String selectSQL = "INSERT INTO Media_types(name,mediaTypeId) VALUES (?,?)";
    
         try ( Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                  PreparedStatement prep = conn.prepareStatement(selectSQL);) {
                  
                  prep.setString(1, name);
                  prep.setInt(2, mediaTypeId);
                  
                  prep.executeUpdate();
                 
    
         } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public synchronized void callTheDeleteTrack(int trackId){

        String selectSQL = "DELETE FROM Tracks WHERE TrackId = ?";
        
        try ( Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                  PreparedStatement prep = conn.prepareStatement(selectSQL);) {
                  
                  prep.setInt(1, trackId);
                 
                  
                  prep.executeUpdate();
                 
    
         } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
    public synchronized void callTheDeleteMedia(int mediaTypeId){
    
        String selectSQL = "DELETE FROM Media_types WHERE mediaTypeId = ?";
        
        try ( Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                  PreparedStatement prep = conn.prepareStatement(selectSQL);) {
                  
                  prep.setInt(1, mediaTypeId);
                 
                  
                  prep.executeUpdate();
                 
    
         } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    
    public synchronized void callTheEditTrack(int trackId, String name, int albumId, int mediaTypeId, int genreId, String composer, int milliseconds, int bytes, double unitPrice){
         
         String selectSQL = "UPDATE tracks SET TrackId = '" + trackId + "', Name = '" + name + "', AlbumId = '" + albumId + "', MediaTypeId = '" + mediaTypeId +  "', GenreId = '" + genreId + "', Composer = '" + composer + "', Milliseconds = '" + milliseconds + "', Bytes = '" + bytes + "', UnitPrice = '" + unitPrice + "' WHERE TrackId = '" + trackId + "'";
         try (Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                 PreparedStatement prep = conn.prepareStatement(selectSQL);) {
                  
                  
                  prep.executeUpdate();
                  
                 
    
         } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    
    public synchronized void callTheEditMedia(String name,int mediaTypeId){
    
        String selectSQL = "UPDATE Media_types SET MediaTypeId = '" + mediaTypeId + "', Name = '" + name + "' WHERE MediaTypeId = '" + mediaTypeId + "'";
         try (Connection conn = ConnectionFactory.getConnection(); // auto close the connection object after try
                 PreparedStatement prep = conn.prepareStatement(selectSQL);) {
                  
                  
                  prep.executeUpdate();
                  
                 
    
         } catch (SQLException ex) {
            Logger.getLogger(SQLiteChinookCw.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    
    }
  
}
     /**
     * Private helper method outputs to standard output stream for debugging.
     * @param say the String to write to standard output stream.
     */
    

