/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Materi2;

/**
 *
 * @author HP
 */
public class latihan {
    int p = 10;
     int l = 5;
     int L;
    
     //Method Fungsi Prosedur
    void luas (){
         L = p * l;
         
         System.out.println(L);
    }
         
    //Method Fungsi - Tipe data
    int Luas(){
        L = p * l;
        
        return L;
    }
  
    public static void main(String[] args) {
        //Prosedur
        latihan Pp = new latihan ();
        Pp.Luas();
         
        //fungsi
        System.out.println(Pp.Luas());
        
    }
}
