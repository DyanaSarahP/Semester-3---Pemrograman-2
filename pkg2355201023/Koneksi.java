/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2355201023;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author MDK
 */
public class Koneksi {
    public static void main(String[] args) {
        Koneksi tesKoneksi = new Koneksi();
        tesKoneksi.koneksi();
    }

    Connection con = null;

    String statusKoneksi;
    public void koneksi() {
        try {
            String connectionURL = "jdbc:mysql://localhost/mahasiswa1023";
            String username = "root";
            String password = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(connectionURL, username, password);
            //JOptionPane.showMessageDialog(null, "Sukses Koneksi");
            statusKoneksi = "Berhasil";
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
           //JOptionPane.showMessageDialog(null, "Koneksi gagal: " + e.getMessage());
            statusKoneksi = "Gagal";
        }
    }
}
