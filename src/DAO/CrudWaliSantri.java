package DAO;

import Database.KoneksiDB;
import Pesantren.WaliSantri;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class CrudWaliSantri {
    
    KoneksiDB connect;
    Connection koneksi;
    ResultSet result;
    DefaultTableModel tb;
   
    public CrudWaliSantri() {
        connect = new KoneksiDB();
        koneksi = connect.buatKoneksi();
    }
    
    public int validasiWaliSantri(WaliSantri ws) {
        int hasil = 0;
        
        try {
            Statement stm = koneksi.createStatement();
            result = stm.executeQuery("select ayah, ibu from wali_santri where ayah = '"+ws.getAyah()+"' and ibu = '"+ws.getIbu()+"'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int tambahWaliSantri(WaliSantri ws) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("insert into wali_santri (ayah, ibu, nohp) values ('"+ws.getAyah()+"', '"+ws.getIbu()+"', '"+ws.getNoHp()+"')");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int editWaliSantri(WaliSantri ws) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("update wali_santri set ayah = '"+ws.getAyah()+"', ibu = '"+ws.getIbu()+"', nohp = '"+ws.getNoHp()+"' where id = "+ws.getId()+"");
            System.out.println(hasil);
            System.out.println(ws.getAyah());
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;   
    }
    
    public int hapusWaliSantri(WaliSantri ws) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("delete from wali_santri where id = '"+ws.getId()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public DefaultTableModel tampilWaliSantri() {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "AYAH", "IBU", "NO. HP"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from wali_santri");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("ayah"),
                    result.getString("ibu"),
                    result.getString("nohp")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel cariWaliSantri(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "AYAH", "IBU", "NO. HP"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from wali_santri where id like '%"+by+"%' or ayah like '%"+by+"%' or ibu like '%"+by+"%' or nohp like '%"+by+"%'");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("ayah"),
                    result.getString("ibu"),
                    result.getString("nohp")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel filterWaliSantri(String urut, String order) {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "AYAH", "IBU", "NO. HP"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from wali_santri order by "+urut+" "+order+"");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("ayah"),
                    result.getString("ibu"),
                    result.getString("nohp")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
}
