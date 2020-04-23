/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Nabil Safwat SID 8055129
 */
public class Track implements Serializable {

    private boolean trackSending;
    private boolean trackAdding;
    private boolean trackDeleting;
    private boolean trackEditing;
    public int trackId;
    public String name;
    public int albumId;
    public int mediaTypeId;
    public int genreId;
    public String composer;
    public int milliseconds;
    public int bytes;
    public double unitPrice;
    public ArrayList<Track> tracks;
    

    public Track(int trackId, String name, int albumId, int mediaTypeId, int genreId, String composer, int milliseconds, int bytes, double unitPrice) {
        this.trackId = trackId;
        this.name = name;
        this.albumId = albumId;
        this.mediaTypeId = mediaTypeId;
        this.genreId = genreId;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
    }
    
    public Track(ArrayList<Track> tracks){
        this.tracks =  tracks;
    
    }
    
    public ArrayList<Track> getTrackList(){
      return this.tracks;
           
    }
    
    public Track(){
    
    
    }
    
    public boolean getTrackEditing(){
    
         return trackEditing;
    
    }
    
    public void setTrackEditing(boolean trackEditing){
    
         this.trackEditing = trackEditing;
    
    }
    
    public boolean getTrackAdding(){
    
         return trackAdding;
    
    }
    
    public void setTrackAdding(boolean trackAdding){
    
         this.trackAdding = trackAdding;
    
    }
    
    public boolean getTrackDeleting(){
    
         return trackDeleting;
    
    }
    
    public void setTrackDeleting(boolean trackDeleting){
    
         this.trackDeleting = trackDeleting;
    
    }
    
    public boolean getTrackSending(){
          
        return trackSending;
        
    }
    
    public void setTrackSending(boolean trackSending){
        
        this.trackSending =  trackSending;
        
    }
    
    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getMediaTypeId() {
        return mediaTypeId;
    }

    public void setMediaTypeId(int mediaTypeId) {
        this.mediaTypeId = mediaTypeId;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public int getMilliseconds() {
        return milliseconds;
    }

    public void setMilliseconds(int milliseconds) {
        this.milliseconds = milliseconds;
    }

    public int getBytes() {
        return bytes;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return super.toString() + " | "
                + String.valueOf(trackId) + " | "
                + name + " | "
                + String.valueOf(albumId) + " | "
                + String.valueOf(mediaTypeId) + " | "
                + String.valueOf(genreId) + " | "
                + composer + " | "
                + String.valueOf(milliseconds) + " | "
                + String.valueOf(bytes) + " | "
                + String.valueOf(unitPrice) + "\n";
    }

}
