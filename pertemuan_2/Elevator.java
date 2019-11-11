/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;

/**
 *
 * @author HP
 */
public class Elevator {
    
    
    /** Creates a new instance of Elevator */ 
    public boolean pintuTerbuka = false; 
    public int lantaiSaatIni = 3;
    public final int maxLantai = 10; 
    public final int minLantai = 1;

    
    
    public void bukaPintu() { 
        System.out.println("buka pintu");
        pintuTerbuka = true;
        System.out.println("pintu terbuka");
    }
    
    
    public void tutupPintu() { 
        System.out.println("tutup pintu"); 
        pintuTerbuka = false; 
        System.out.println("pintu tertutup");
    }
    
    
    public void naik() { 
        System.out.println("naik satu lantai"); 
        lantaiSaatIni++;
        System.out.println("lantai: "+lantaiSaatIni);
    }
    
    
    public void turun() { 
        System.out.println("turun satu lantai"); 
        lantaiSaatIni--;
        System.out.println("lantai: "+lantaiSaatIni);
    }
    
}








