/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeywordThis_Materi6;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        //Membuat objek dari kelas user
        User user = new User();
        
        user.setUsername("DyanaSarah");
        user.setPassword("020909");
        
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
    }
}
