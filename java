/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_4;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class PersegiPanjang {
    double panjang;
    double lebar;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    
//    mengembalikan  hasil
    public double Luas(double  p, double l){
       panjang = p;
       lebar = l;
        return panjang*lebar;
    }
    public  double Keliling(double p, double l){
        panjang = p;
        lebar = l;
        return 2*(panjang*lebar);
    }
 
    
        public static void main(String[] args) {
       
            PersegiPanjang pp = new PersegiPanjang();
        
            String stringPanjang = "";
            String stringLebar = "";
            double iPanjang = 0.0;
            double iLebar = 0.0;
        
            stringPanjang = JOptionPane.showInputDialog("masukkan nilai Panjang");
            stringLebar = JOptionPane.showInputDialog("masukkan Lebar");
       
            iPanjang = Double.parseDouble(stringPanjang);
            iLebar = Double.parseDouble(stringLebar);
        
            double luas = pp.Luas(iPanjang, iLebar);
            double keliling = pp.Keliling(iPanjang,iLebar);
            
            JOptionPane.showMessageDialog(null,"Luas : "+luas+"\nkeliling : "+keliling);

    }

}
