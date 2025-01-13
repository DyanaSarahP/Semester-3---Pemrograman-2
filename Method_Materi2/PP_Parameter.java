/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Materi2;

/**
 *
 * @author HP
 */
public class PP_Parameter {
    //Method Prosedur
    public void luas( int p , int l){
        int L = p * l;
        System.out.println(L);
    }
    
    //Method Fungsi
    public int Keliling (int p ,int l){
        int K = 2 * (p + l); 
        
        return K;
    }
    
    public static void main(String[] args) {
        //Method Prosedur
        PP_Parameter PPP = new PP_Parameter();
        System.out.print("Luas = ");
        PPP.luas(20, 10);
        System.out.print  ("Luas = ");
        PPP.luas(40, 3);
        
        //Method Fungsi
        System.out.println("Keliling = " + PPP.Keliling(20, 4));
        System.out.println("Keliling = " + PPP.Keliling(10, 5));
    }
    
}
