package DAO;

import Database.KoneksiDB;
import Pesantren.Santri;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CrudSantri {
    KoneksiDB connect;
    Connection koneksi;
    ResultSet result;
    DefaultTableModel tb;
    
    public CrudSantri() {
        connect = new KoneksiDB();
        koneksi = connect.buatKoneksi();
    }
    
    public int validasiSantri(Santri santri) {
        int hasil = 0;
        
        try {
            Statement stm = koneksi.createStatement();
            
            result = stm.executeQuery("select nama from santri where nama = '"+santri.getNama()+"'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int hitungSantriIkhwan() {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            
            result = stm.executeQuery("select * from santri where jenis_kelamin = 'laki-laki'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int hitungSantriAkhwat() {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            
            result = stm.executeQuery("select * from santri where jenis_kelamin = 'perempuan'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int tambahSantri(Santri santri) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("insert into santri (nis, nama, jenis_kelamin, ttl, alamat, ayah, ibu) values ('"+santri.getNis()+"', '"+santri.getNama()+"', '"+santri.getJenisKelamin()+"', '"+santri.getTtlDaerah()+", "+santri.getDateChooser()+"','"+santri.getAlamat()+"', '"+santri.getAyah()+"', '"+santri.getIbu()+"')");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int editSantri(Santri santri) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("update santri set nama = '"+santri.getNama()+"', jenis_kelamin = '"+santri.getJenisKelamin()+"', ttl = '"+santri.getTtlDaerah()+", "+santri.getDateChooser()+"', alamat = '"+santri.getAlamat()+"', ayah = '"+santri.getAyah()+"', ibu = '"+santri.getIbu()+"' where nis = '"+santri.getNis()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;   
    }
    
    public int hapusSantri(Santri santri) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("delete from santri where nis = '"+santri.getNis()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public DefaultTableModel tampilSantri() {
        try {
            tb = new DefaultTableModel(new String[]{"NIS", "NAMA", "JENIS KELAMIN", "TTL", "ALAMAT", "AYAH", "IBU"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from santri");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("nis"),
                    result.getString("nama"),
                    result.getString("jenis_kelamin"),
                    result.getString("ttl"),
                    result.getString("alamat"),
                    result.getString("ayah"),
                    result.getString("ibu")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel cariSantri(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"NIS", "NAMA", "JENIS KELAMIN", "TTL", "ALAMAT", "AYAH", "IBU"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from santri where nis like '%"+by+"%' or nama like '%"+by+"%' or jenis_kelamin like '%"+by+"%' or ttl like '%"+by+"%' or alamat like '%"+by+"%' or ayah like '%"+by+"%' or ibu like '%"+by+"%'");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("nis"),
                    result.getString("nama"),
                    result.getString("jenis_kelamin"),
                    result.getString("ttl"),
                    result.getString("alamat"),
                    result.getString("ayah"),
                    result.getString("ibu")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel filterSantri(String urut, String order) {
        try {
            tb = new DefaultTableModel(new String[]{"NIS", "NAMA", "JENIS KELAMIN", "TTL", "ALAMAT", "AYAH", "IBU"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from santri order by "+urut+" "+order+"");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("nis"),
                    result.getString("nama"),
                    result.getString("jenis_kelamin"),
                    result.getString("ttl"),
                    result.getString("alamat"),
                    result.getString("ayah"),
                    result.getString("ibu")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
}
