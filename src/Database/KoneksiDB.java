package Database;

import java.sql.*;

public class KoneksiDB {
    public Connection koneksi;
    
    public Connection buatKoneksi() {
        if (koneksi == null) {
            try {
                String db = "jdbc:mysql://localhost/asshofa";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(db, user, password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return koneksi;
    }
}
