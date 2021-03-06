/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author Nabil Safwat SID 8055129
 */
public class Media_types implements Serializable {
    
       public int mediaTypeId;
       public String name;
       private ArrayList<Media_types> media;
       private boolean mediaSending;
       private boolean mediaAdding;
       private boolean mediaDeleting;
       private boolean mediaEditing;
       
       public Media_types(int mediaTypeId, String name){
           
           this.mediaTypeId = mediaTypeId;
           this.name = name;
       }
       
       public int getMediaTypeId() {
           return mediaTypeId;
       
       }

       public void setMediaTypeId(int mediaTypeId) {
           this.mediaTypeId = mediaTypeId;

       }

       public String getName() {
           return name;
       
       }

       public void setName(String name) {
           this.name = name;
       
       }
       
       public Media_types(){
       
       
       }
       
       public Media_types(ArrayList<Media_types> media){
        this.media =  media;
    
       }
       
       public ArrayList<Media_types> getMediaList(){
        return this.media;
           
       }
       
       public boolean getMediaSending(){
          
        return mediaSending;
        
       }
    
       public void setMediaSending(boolean mediaSending){
        
        this.mediaSending =  mediaSending;
        
       }
       
       public boolean getMediaAdding(){
    
         return mediaAdding;
    
       }
    
       public void setMediaAdding(boolean mediaAdding){
    
         this.mediaAdding = mediaAdding;
    
       }
       
       public boolean getMediaDeleting(){
    
         return mediaDeleting;
    
       }
    
       public void setMediaDeleting(boolean mediaDeleting){
    
         this.mediaDeleting = mediaDeleting;
    
       }
       
       public boolean getMediaEditing(){
    
         return mediaEditing;
    
       }
    
       public void setMediaEditing(boolean mediaEditing){
    
         this.mediaEditing = mediaEditing;
    
       }

       @Override
       public String toString() {
       return super.toString() + " | " + name + " | " + String.valueOf(mediaTypeId) + "\n";
    }
}


