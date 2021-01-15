/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bintang.Ilham
 */
public class no1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variabel//
        int a = 3;
        
        //rumus perulangan membentuk pola persegi//
        for (int b = 0; b <= a; b++)
        {
            for (int c = 0; c <= a; c++)
            {
                if (b == 0||c == 0||b == a||c == a) 
                {
                
                //menampilkan output hasil//
                System.out.print("@");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    
    }
    
}
