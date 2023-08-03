package DAO;

import Database.KoneksiDB;
import Pesantren.Akun;
import com.mysql.cj.jdbc.ServerPreparedStatement;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CrudAkun {
    KoneksiDB connect;
    Connection koneksi;
    ResultSet result;
    DefaultTableModel tb;
    
    public CrudAkun() {
        connect = new KoneksiDB();
        koneksi = connect.buatKoneksi();
    }
    
    public int validasiAkun(Akun akun) {
        int hasil = 0;
        
        try {
            Statement stm = koneksi.createStatement();
            
            result = stm.executeQuery("select username from akun where username = '"+akun.getUsername()+"'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int tambahAkun(Akun akun) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("insert into akun (username, password) values ('"+akun.getUsername()+"', '"+akun.getPassword()+"')");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int hapusAkun(Akun akun) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("delete from akun where id = '"+akun.getId()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int login(Akun akun) {
        int hasil = 0;
        
         try {
            Statement stm = (Statement) koneksi.createStatement();
            
            result = stm.executeQuery("select username, password from akun where username = '"+akun.getUsername()+"' and password = '"+akun.getPassword()+"'");
            
            while (result.next()) {
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int lupaPassword(Akun akun) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            result = stm.executeQuery("select * from akun where username like '%"+akun.getUsername()+"%' or password like '%"+akun.getPassword()+"%'");
            
            while (result.next()) {
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int updatePassword(Akun akun) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("update akun set password = '"+akun.getPassword()+"' where username = '"+akun.getUsername()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public DefaultTableModel tampilAkun() {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "USERNAME", "PASSWORD"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from AKUN");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("username"),
                    result.getString("password")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel cariPengajar(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "USERNAME", "PASSWORD"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from akun where id like '%"+by+"%' or username like '"+by+"' or password like '"+by+"'");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("username"),
                    result.getString("password")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel filterAkun(String urut, String order) {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "USERNAME", "PASSWORD"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from akun order by "+urut+" "+order+"");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("username"),
                    result.getString("password")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
}
