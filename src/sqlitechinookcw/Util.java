/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.util.ArrayList;

/**
 *
 * @author Nabil Safwat SID 8055129
 */
public class Util {
    
    public static String getFormattedMediaStringFromList(ArrayList<Media_types> mediaTypes){
        StringBuilder sb = new StringBuilder();
        for(Media_types m: mediaTypes){
            sb.append(m.toString());
        }
        return sb.toString();
    }
    
    public static String getFormattedTrackStringFromList(ArrayList<Track> track){
        StringBuilder sb = new StringBuilder();
        for(Track t: track){
            sb.append(t.toString());
        }
        return sb.toString();
    }
    
}
