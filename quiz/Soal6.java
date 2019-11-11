/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Soal6 {
int waktu;
int jumlah_VCD;

    public int getWaktu() {
        return waktu ;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }

    public int getJumlah_VCD() {
        return jumlah_VCD;
    }

    public void setJumlah_VCD(int jumlah_VCD) {
        this.jumlah_VCD = jumlah_VCD;
    }
    public void rentalVCD (int jumlahVCD) {
        if (jumlahVCD >= 1 && jumlahVCD <6 ){
            waktu = jumlahVCD + 1;
        } 
        else if ( jumlahVCD >= 6 ) {
            
            waktu +=7;
        }
        else {
            System.out.println("ERROR");
        }
    }
    public static void main(String[] args) {
        Soal6 S6 = new Soal6();
        
        String strJumVCD = "";
        
        int iJumVCD = 0;
        
        strJumVCD = JOptionPane.showInputDialog("masukkan jumlah VCD" );
        
        iJumVCD = Integer.parseInt(strJumVCD);
        
        S6.rentalVCD(iJumVCD);
        JOptionPane.showMessageDialog(null, "jumlah vcd yang anda pinjam :"+iJumVCD+"\nwaktu peminjaman selama : "+S6.getWaktu()+" hari");
        
        
        
    }
}
