/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlitechinookcw;

import java.io.Serializable;

/**
 * A parcel class for encapsulating the data we want to send back and forth.
 * Implements the Serializable interface so can be sent via object streams.
 * 
 * @author Chris Bass
 * @date 06/04/2016
 */
public class Parcel implements Serializable {
    
    private String username;
    private String email;

    public Parcel() {
    }

    public Parcel(String username, String email) {
        this.username = username;
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return ("username: \"" + username + "\" email: \"" + email + "\"");
    }
    
}