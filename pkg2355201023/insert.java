/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2355201023;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;

/**
 *
 * @author MDK
 */
public class insert {
   
    Koneksi konek = new Koneksi();
    public void insert(int nim, String nama, String alamat, String jeniskelamin) {
      
        try {
            
          konek.koneksi();
          Statement statement = konek.con.createStatement();
          String sql= "insert into identitas values('"+nim+"','"+nama+"','"+alamat+"','"+jeniskelamin+"');";
          statement.executeUpdate(sql);
          statement.close(); 

          JOptionPane.showMessageDialog(null,"Berhasil Disimpan");
        } catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
