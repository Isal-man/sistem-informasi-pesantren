package Pesantren;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Akun {
    private String username;
    private String password;
    private String id;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        password = md5Java(password);
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String md5Java(String message) {
        String digest = message;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));
            // merubah byte array ke dalam String Hexadecimal
            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            digest = sb.toString();
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Akun.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Akun.class.getName()).log(Level.SEVERE, null, ex);
        }
        return digest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
