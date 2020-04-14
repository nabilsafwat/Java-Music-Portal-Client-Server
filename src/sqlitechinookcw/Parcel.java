/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * A parcel class for encapsulating the data we want to send back and forth.
 * Implements the Serializable interface so can be sent via object streams.
 * 
 * @author Chris Bass
 * @date 06/04/2016
 */
public class Parcel implements Serializable {
    
    private Track track;
    private Media_types media;

    public Parcel() {
    
    }

    public Parcel(Track track, Media_types media){
        this.track = track;
        this.media = media;
        
        
    }
    
    public Track getTrack() {
        return track;
    }

    public void setTrack(int trackId, String name, int albumId, int mediaTypeId, int genreId, String composer, int milliseconds, int bytes, double unitPrice) {
        
    }

    public Media_types getMediaType() {
        return media;
    }

    public void setMediaType(int mediaTypeId, String name) {
        
    }

    
        
}