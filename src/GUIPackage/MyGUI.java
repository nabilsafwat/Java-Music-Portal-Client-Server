/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPackage;
import sqlitechinookcw.Parcel;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import sqlitechinookcw.Media_types;
import sqlitechinookcw.Track;
import java.awt.print.*;
import sqlitechinookcw.PrintableObject;
import sqlitechinookcw.Util;


/**
 *
 * @author safwatn
 */
public class MyGUI extends javax.swing.JFrame {

    Track track = new Track();
    Media_types media = new Media_types();
    
    
    /**
     * Creates new form MyGUI
     */
    public MyGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        connectButton = new javax.swing.JButton();
        labelStatus = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        boxForMedia = new javax.swing.JTextArea();
        listMediaTypes = new javax.swing.JButton();
        listTracks = new javax.swing.JButton();
        printTracksButton = new javax.swing.JButton();
        printMediaButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        boxForTrack = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertTrackId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        insertAlbumId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        insertGenreId = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        insertComposer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        insertMediaTypeId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        insertMilliseconds = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        insertBytes = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        insertUnitPrice = new javax.swing.JTextField();
        insertTrackName = new javax.swing.JTextField();
        addTrackButton = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        insertMediaId = new javax.swing.JTextField();
        insertTypeName = new javax.swing.JLabel();
        addMediaButton = new javax.swing.JButton();
        insertMediaTypeName = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        connectButton.setText("Connect");
        connectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectButtonActionPerformed(evt);
            }
        });

        labelStatus.setText("Status");

        jLabel1.setText("Welcome to the Music Portal!");

        jLabel2.setText("Tracks");

        jLabel3.setText("Media Types");

        boxForMedia.setColumns(20);
        boxForMedia.setRows(5);
        jScrollPane1.setViewportView(boxForMedia);

        listMediaTypes.setText("View all media types");
        listMediaTypes.setToolTipText("");
        listMediaTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listMediaTypesActionPerformed(evt);
            }
        });

        listTracks.setText("View all tracks");
        listTracks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listTracksActionPerformed(evt);
            }
        });

        printTracksButton.setText("Print Tracks");
        printTracksButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printTracksButtonActionPerformed(evt);
            }
        });

        printMediaButton.setText("Print Media Types");
        printMediaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printMediaButtonActionPerformed(evt);
            }
        });

        boxForTrack.setColumns(20);
        boxForTrack.setRows(5);
        jScrollPane4.setViewportView(boxForTrack);

        jLabel4.setText("Add a Track");

        jLabel5.setText("Add a Media Type");

        jLabel6.setText("Track ID");

        jLabel7.setText("Track");

        jLabel8.setText("Album ID");

        insertAlbumId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertAlbumIdActionPerformed(evt);
            }
        });

        jLabel9.setText("MediaType ID");

        jLabel10.setText("Genre ID");

        jLabel11.setText("Composer");

        jLabel12.setText("Milliseconds");

        jLabel13.setText("Bytes");

        jLabel14.setText("Unit Price");

        addTrackButton.setText("Add Track");
        addTrackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTrackButtonActionPerformed(evt);
            }
        });

        jLabel15.setText("MediaType ID");

        insertTypeName.setText("Name of Type");

        addMediaButton.setText("Add Media Type");
        addMediaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMediaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertTrackId, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(insertTrackName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(insertAlbumId, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(insertMediaTypeId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(insertGenreId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(insertComposer, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(51, 51, 51)
                                .addComponent(jLabel11)
                                .addGap(64, 64, 64)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insertMilliseconds, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(insertBytes, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(insertUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel13)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel14))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(listTracks)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(printTracksButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(connectButton))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(listMediaTypes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(printMediaButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(215, 215, 215))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addTrackButton)
                            .addComponent(addMediaButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(insertMediaId, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(insertMediaTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(44, 44, 44)
                                .addComponent(insertTypeName))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(connectButton)
                    .addComponent(labelStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listTracks)
                    .addComponent(printMediaButton)
                    .addComponent(printTracksButton)
                    .addComponent(listMediaTypes))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertTrackId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertAlbumId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertGenreId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertComposer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertMilliseconds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertBytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertTrackName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertMediaTypeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addTrackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(insertTypeName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertMediaId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertMediaTypeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addMediaButton)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectButtonActionPerformed
        // TODO add your handling code here:
        reconnectToServer();
    }//GEN-LAST:event_connectButtonActionPerformed

    private void listTracksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listTracksActionPerformed
        // TODO add your handling code here:
        listAllTracks();
    }//GEN-LAST:event_listTracksActionPerformed

    private void listMediaTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listMediaTypesActionPerformed
        // TODO add your handling code here:
        listAllMediaTypes();
    }//GEN-LAST:event_listMediaTypesActionPerformed

    private void printTracksButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printTracksButtonActionPerformed
        // TODO add your handling code here:
        printAllTracks();
    }//GEN-LAST:event_printTracksButtonActionPerformed

    private void printMediaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printMediaButtonActionPerformed
        // TODO add your handling code here:
        printAllMedia();
    }//GEN-LAST:event_printMediaButtonActionPerformed

    private void addTrackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTrackButtonActionPerformed
        // TODO add your handling code here:
        addTheTrack();
    }//GEN-LAST:event_addTrackButtonActionPerformed

    private void insertAlbumIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertAlbumIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertAlbumIdActionPerformed

    private void addMediaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMediaButtonActionPerformed
        // TODO add your handling code here:
        addTheMedia();
    }//GEN-LAST:event_addMediaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyGUI().setVisible(true);
            }
        });
    }

    private void closeConnection() {
        
        if (socket != null) {
            labelStatus.setText("Status: closing connection");
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                socket = null;
            }
        }
    }

    
     private void reconnectToServer() {
        closeConnection();
        labelStatus.setText("Status: Attempting connection to server");
        try {
            socket = new Socket("127.0.0.1", 2000);

            objectInputStream = new ObjectInputStream(socket.getInputStream());
            objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            labelStatus.setText("Status: Connected to server");
        } catch (IOException ex) {
            Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            //labelStatus.setText(ex.toString()); // connection failed
            labelStatus.setText("Status: Server not found!"); // connection failed
        }
    }
     
     public void keepReadingFromServer() {
        while (true) {
            try {
                Object message;
                message = objectInputStream.readObject();

            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
     
    private void listAllTracks(){
            //Sending
            if (objectOutputStream != null && objectInputStream != null) {
            
            //Track track = new Track();
            track.setTrackSending(true);
            
            
            try {
                objectOutputStream.writeObject(new Parcel(track, media));
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Recieving
            Parcel reply = null;
            try {
                reply = (Parcel)objectInputStream.readObject();
                //reply = objectInputStream.readObject();
                ArrayList<Track> tracks = reply.getTrackList();
                for(Track t : tracks){
                    System.out.print(t);
                    System.out.print(" | ");
                    System.out.println("\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            labelStatus.setText("Status: waiting for reply from server");
            //reply = (Parcel)objectInputStream.readObject();
            labelStatus.setText("Status: received reply from server");

            // 4. display message on textarea
            
            if (reply != null) {
                
                boxForTrack.setText(reply.getTrackList().toString());
                
            }
         else {
            labelStatus.setText("You must connect to the server first!!");
        }
        }
        
    }
    
    private void listAllMediaTypes() {
        //Sending
            if (objectOutputStream != null && objectInputStream != null) {
            
            //Media_types media = new Media_types();
            media.setMediaSending(true);
            
            
            try {
                objectOutputStream.writeObject(new Parcel(track, media));
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Recieving
            Parcel reply = null;
            try {
                reply = (Parcel)objectInputStream.readObject();
                //reply = objectInputStream.readObject();
                ArrayList<Media_types> medias = reply.getMediaList();
                for(Media_types m : medias){
                    System.out.print(m);
                    System.out.print(" | ");
                    System.out.println("\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            labelStatus.setText("Status: waiting for reply from server");
            //reply = (Parcel)objectInputStream.readObject();
            labelStatus.setText("Status: received reply from server");

            // Print the tracks
            
            if (reply != null) {
                
                boxForMedia.setText(reply.getMediaList().toString());
                
            }
         else {
            labelStatus.setText("You must connect to the server first!!");
        }
        }
        
    }
    
    
    private void printAllTracks(){
            
            //Sending
            if (objectOutputStream != null && objectInputStream != null) {
            
            //Media_types media = new Media_types();
            track.setTrackSending(true);
            
            
            try {
                objectOutputStream.writeObject(new Parcel(track, media));
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        
            
            //Recieving
            Parcel reply = null;
            try {
                reply = (Parcel)objectInputStream.readObject();
                
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            labelStatus.setText("Status: waiting for reply from server");
            //reply = (Parcel)objectInputStream.readObject();
            labelStatus.setText("Status: received reply from server");
            
            
            if (reply != null) {
                
                    PrinterJob printer = PrinterJob.getPrinterJob(); // this method calls to setup a job for printing pages
                    String printableString = Util.getFormattedMediaStringFromList(reply.getMediaList());
                    PrintableObject p = new PrintableObject();
                    p.stringToPrint = printableString;
                    printer.setPrintable(p);
   	            printer.printDialog(); // show the print dialog
  
                try {
                     printer.print(); //if clicking ok in the print dialog, this will print the pages with the default format
                }
                catch (PrinterException PrintException) { //catch the error during printing
                }
                
            }
            
            else {
            labelStatus.setText("You must connect to the server first!!");
            }

            
            } 
            
    }
    
    private void printAllMedia(){
            //Sending
            if (objectOutputStream != null && objectInputStream != null) {
            
            //Media_types media = new Media_types();
            media.setMediaSending(true);
            
            
            try {
                objectOutputStream.writeObject(new Parcel(track, media));
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Recieving
            Parcel reply = null;
            try {
                reply = (Parcel)objectInputStream.readObject();
                //reply = objectInputStream.readObject();
                
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            labelStatus.setText("Status: waiting for reply from server");
            //reply = (Parcel)objectInputStream.readObject();
            labelStatus.setText("Status: received reply from server");

            // Print the tracks
            
            if (reply != null) {
                
                    PrinterJob printer = PrinterJob.getPrinterJob(); // this method calls to setup a job for printing pages
                    String printableString = Util.getFormattedMediaStringFromList(reply.getMediaList());
                    PrintableObject p = new PrintableObject();
                    p.stringToPrint = printableString;
                    printer.setPrintable(p);
   	            printer.printDialog(); // show the print dialog
  
                try {
                     printer.print(); //if clicking ok in the print dialog, this will print the pages with the default format
                }
                catch (PrinterException PrintException) { //catch the error during printing
                }
                
            }
         else {
            labelStatus.setText("You must connect to the server first!!");
        }
        }
    
    
    }
    
    private void addTheTrack(){
    
        if (objectOutputStream != null && objectInputStream != null) {
            
            track.setTrackAdding(true);
            //Send data from Textfields
            
            Track userInputTrack = new Track();
            userInputTrack.trackId = Integer.parseInt(insertTrackId.getText());
            userInputTrack.name = insertTrackName.getText();
            userInputTrack.albumId = Integer.parseInt(insertAlbumId.getText());
            userInputTrack.mediaTypeId = Integer.parseInt(insertMediaTypeId.getText());
            userInputTrack.genreId = Integer.parseInt(insertGenreId.getText());
            userInputTrack.composer = insertComposer.getText();
            userInputTrack.milliseconds = Integer.parseInt(insertMilliseconds.getText());
            userInputTrack.bytes = Integer.parseInt(insertBytes.getText());
            System.out.println(insertUnitPrice.getText());
            userInputTrack.unitPrice = Double.parseDouble(insertUnitPrice.getText());
            
            /*String sendTrackID = iertTrackId.getText();
            String sendTrackName = insertTrackName.getText();
            String sendAlbumID = insertAlbumId.getText();
            String sendMediaTypeID = insertMediaTypeId.getText();
            String sendGenreID = insertGenreId.getText();
            String sendComposer = insertComposer.getText();
            String sendMilliseconds = insertMilliseconds.getText();
            String sendBytes = insertBytes.getText();
            String sendUnitPrice = insertUnitPrice.getText();*/
            
            //track.setTrackAdding(true);
            
            try {
                objectOutputStream.writeObject(new Parcel(userInputTrack, null));
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    private void addTheMedia(){
    
        if (objectOutputStream != null && objectInputStream != null) {
            
            
            media.setMediaAdding(true);
            //Send data from Textfields
            
            
            Media_types userInputMedia = new Media_types();
            userInputMedia.name = insertMediaTypeName.getText();
            userInputMedia.mediaTypeId = Integer.parseInt(insertMediaId.getText());
            
            
            
            
            try {
                objectOutputStream.writeObject(new Parcel(null, userInputMedia));
            } catch (IOException ex) {
                Logger.getLogger(MyGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
     
    
    private Socket socket;
    private ObjectOutputStream objectOutputStream;
    private ObjectInputStream objectInputStream;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMediaButton;
    private javax.swing.JButton addTrackButton;
    private javax.swing.JTextArea boxForMedia;
    private javax.swing.JTextArea boxForTrack;
    private javax.swing.JButton connectButton;
    private javax.swing.JTextField insertAlbumId;
    private javax.swing.JTextField insertBytes;
    private javax.swing.JTextField insertComposer;
    private javax.swing.JTextField insertGenreId;
    private javax.swing.JTextField insertMediaId;
    private javax.swing.JTextField insertMediaTypeId;
    private javax.swing.JTextField insertMediaTypeName;
    private javax.swing.JTextField insertMilliseconds;
    private javax.swing.JTextField insertTrackId;
    private javax.swing.JTextField insertTrackName;
    private javax.swing.JLabel insertTypeName;
    private javax.swing.JTextField insertUnitPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JButton listMediaTypes;
    private javax.swing.JButton listTracks;
    private javax.swing.JButton printMediaButton;
    private javax.swing.JButton printTracksButton;
    // End of variables declaration//GEN-END:variables
}
