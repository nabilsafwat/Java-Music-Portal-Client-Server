/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.io.Serializable;
/**
 *
 * @author safwatn
 */
public class Media_types implements Serializable {
    
       private int mediaTypeId;
       private String name;
       
       
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


       @Override
       public String toString() {
       return super.toString() + " | " + name + " | " + String.valueOf(mediaTypeId);
    }
}


