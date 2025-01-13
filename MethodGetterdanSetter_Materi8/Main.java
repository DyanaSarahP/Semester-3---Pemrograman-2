/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodGetterdanSetter_Materi8;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        User user = new User();
        
        user.SetUsername("DyanaSarah");
        user.SetPassword("020909");
        
        System.out.println("Usernamenya = " + user.GetUsername());
        System.out.println("Psswordnya = " + user.GetPassword());
    }
}
