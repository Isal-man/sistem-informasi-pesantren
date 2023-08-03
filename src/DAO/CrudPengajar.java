package DAO;

import Database.KoneksiDB;
import Pesantren.Pengajar;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CrudPengajar {
    KoneksiDB connect;
    Connection koneksi;
    ResultSet result;
    DefaultTableModel tb;
    
    public CrudPengajar() {
        connect = new KoneksiDB();
        koneksi = connect.buatKoneksi();
    }
    
    public int hitungUstadz() {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            
            result = stm.executeQuery("select * from pengajar where jenis_kelamin = 'laki-laki'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int hitungUstadzah() {
        int hasil = 0;
        try {
            Statement stm = koneksi.createStatement();
            
            result = stm.executeQuery("select * from pengajar where jenis_kelamin = 'perempuan'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int validasiPengajar(Pengajar p) {
        int hasil = 0;
        
        try {
            Statement stm = koneksi.createStatement();
            result = stm.executeQuery("select nama from pengajar where nama = '"+p.getNama()+"'");
            
            while (result.next()) {                
                hasil++;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int tambahPengajar(Pengajar p) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            hasil = stm.executeUpdate("insert into pengajar (nama, nohp, jenis_kelamin, status) values ('"+p.getNama()+"', '"+p.getNohp()+"', '"+p.getJk()+"', '"+p.getStatus()+"')");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public int editPengajar(Pengajar p) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("update pengajar set nama = '"+p.getNama()+"', nohp = '"+p.getNohp()+"', jenis_kelamin = '"+p.getJk()+"', status = '"+p.getStatus()+"' where id = '"+p.getId()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;   
    }
    
    public int hapusPengajar(Pengajar p) {
        int hasil = 0;
        
        try {
            Statement stm = (Statement) koneksi.createStatement();
            
            hasil = stm.executeUpdate("delete from pengajar where id = '"+p.getId()+"'");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return hasil;
    }
    
    public DefaultTableModel tampilPengajar() {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "NAMA", "NO. HP", "JENIS KELAMIN", "STATUS"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from pengajar");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("nama"),
                    result.getString("nohp"),
                    result.getString("jenis_kelamin"),
                    result.getString("status")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel cariPengajar(String by) {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "NAMA", "NO. HP", "JENIS KELAMIN", "STATUS"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from pengajar where id like '%"+by+"%' or nama like '%"+by+"%' or nohp like '%"+by+"%' or jenis_kelamin like '%"+by+"%' or status like '%"+by+"%'");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("nama"),
                    result.getString("nohp"),
                    result.getString("jenis_kelamin"),
                    result.getString("status")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
    
    public DefaultTableModel filterPengajar(String urut, String order) {
        try {
            tb = new DefaultTableModel(new String[]{"ID", "NAMA", "NO. HP", "JENIS KELAMIN", "STATUS"}, 0);
            Statement stm = (Statement) koneksi.createStatement();
            result = stm.executeQuery("select * from pengajar order by "+urut+" "+order+"");
            
            while (result.next()) {                
                tb.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("nama"),
                    result.getString("nohp"),
                    result.getString("jenis_kelamin"),
                    result.getString("status")
                });
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return tb;
    }
}
