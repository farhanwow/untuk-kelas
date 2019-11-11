/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




/**
 *
 * @author HP
 */
public class GetInputFromKeyboard {
    public static void main(String[] args) {
//        //percobaan 1
//        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in) );
//        String name = "";
//        System.out.print("Please Enter Your Name : ");
//        
//        try {
//            name = dataIn.readLine();
//        } catch (Exception e) {
//            System.out.println("Error!");
//        }
//        
//        System.out.print("Hello "+ name +" !");

          //percobaan 3
          BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
          String name = "", hobby = "";
          try {
              System.out.print("Nama Anda : ");
              name = dataIn.readLine();
              System.out.print("Hobi Anda : ");
              hobby = dataIn.readLine();
        } catch (Exception e) {
              System.out.println("Gagal Membaca Keyboard");
        }
        System.out.println("jadi anda hobi "+hobby+" hobi yang bagus pak "+name);











//        //deklarasi objek bufferedreader
//        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
//        //blok untuk menerima input data
//        String name = "";
//        System.out.println("print your name");
//        
//        try {
//            name = dataIn.readLine();
//        } 
//        catch (IOException e) {
//            System.out.println("Error");
//        }
//        //menampilkan input data
//        System.out.println("Hello "+name+"!");
        
//        //variable menerima input
//        String nilai1String = "";
//        String nilai2String = "";
//        //variable perhtiungan
//        int hasil = 0;
//        int nilai1Int = 0;
//        int nilai2Int = 0;
//        //terima input
//        nilai1String = JOptionPane.showInputDialog("masukkan nilai 1 : ");
//        nilai2String = JOptionPane.showInputDialog("masukkan nilai 2 : ");
//        //bagian untuk typecast/parsing
//        nilai1Int = Integer.parseInt(nilai1String);
//        nilai2Int = Integer.parseInt(nilai2String);
//        
//        //bagian perhitungan
//        hasil = nilai1Int + nilai2Int;
//        
//        JOptionPane.showMessageDialog(null, "hasilnya adalah "+hasil);


    }
    
}
