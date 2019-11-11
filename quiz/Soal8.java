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
public class Soal8 {
    int nilai1;
    int nilai2;
    int nilai3;

    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }

    public int getNilai3() {
        return nilai3;
    }

    public void setNilai3(int nilai3) {
        this.nilai3 = nilai3;
    }

    
    public  int rata_rata (int nilaiUjian1, int nilaiUjian2, int nilaiUjian3) {
        nilai1 = nilaiUjian1;
        nilai2 = nilaiUjian2 ;
        nilai3 = nilaiUjian3 ;
        return  (nilaiUjian1+nilaiUjian2+nilaiUjian3)/3;
    }
    
    public static void main(String[] args) {
        Soal8 S8 = new Soal8();
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String strNilai1 = "";
        String strNilai2 = "";
        String strNilai3 = "";
        
        int iNilai1 = 0;
        int iNilai2 = 0;
        int iNilai3 = 0;
        try {
              System.out.print("Masukkan nilai ke - 1 : ");
              strNilai1 = dataIn.readLine();
              System.out.print("Masukkan nilai ke - 2 : ");
              strNilai2 = dataIn.readLine();
              System.out.print("Masukkan nilai ke - 3 : ");
              strNilai3 = dataIn.readLine();

        } catch (Exception e) {
              System.out.println("Gagal Membaca Keyboard");
        }
           
          iNilai1 = Integer.parseInt(strNilai1);
          iNilai2 = Integer.parseInt(strNilai2);
          iNilai3 = Integer.parseInt(strNilai3);
          int totalUser =S8.rata_rata(iNilai1, iNilai2, iNilai3);
          System.out.println("rata-rata nilai anda : "+totalUser);
          
          if (totalUser >= 60 && totalUser <= 100)
            System.out.println("emotikon anda : :)");  
          else if (totalUser<= 60 && totalUser >= 0)
             System.out.println("emotikon anda :  :(");
          else
              System.out.println("error");
          
    }
}
