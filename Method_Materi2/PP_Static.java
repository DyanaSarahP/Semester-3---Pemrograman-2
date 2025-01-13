/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Materi2;

/**
 *
 * @author HP
 */
public class PP_Static {
    //Method Prosedur
    public static void luas( int p , int l){
        int L = p * l;
        System.out.println(L);
    }
    
    //Method Fungsi
    public static int Keliling (int p ,int l){
        int K = 2 * (p + l); 
        
        return K;
    }
    
    public static void main(String[] args) {
        //Method Prosedur
        luas(10, 5);
        luas(20, 10);
        //Method Fungsi
        System.out.println(Keliling(10, 5));
        System.out.println(Keliling(20, 4));
    }
    
}
