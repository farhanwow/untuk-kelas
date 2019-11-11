/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class Soal5 {
double diskonkamar;    
int akhir;

    public int getAkhir() {
        return akhir;
    }

    public void setAkhir(int akhir) {
        this.akhir = akhir;
    }

    public double getDiskonkamar() {
        return diskonkamar;
    }

    public void setDiskonkamar(double diskonkamar) {
        this.diskonkamar = diskonkamar;
    }



    public void total(int hari){
        
        if (hari >= 8) {
           akhir = (int) ((250000*hari)/0.2);
           
        }
        else if(hari < 7)
        {
            akhir = (250000*hari);
        }
    }
    
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String strHari = "";
        Soal5 S5 = new Soal5();
        int iHari = 0;
          try {
              System.out.print("Berapa lama anda menginap : ");
             strHari = dataIn.readLine();

        } catch (Exception e) {
              System.out.println("Gagal Membaca Keyboard");
        }
          iHari = Integer.parseInt(strHari);
          S5.total(iHari);
        System.out.println("harga kamar anda : "+S5.getAkhir());


    }
}