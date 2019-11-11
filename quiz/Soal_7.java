/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Quiz;

/**
 *
 * @author Khan
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Soal_7 
{
    public static void main(String[] args) 
    {
   int k=1;
   String l="";
   String m="";
   l=JOptionPane.showInputDialog("Silahkan masukkan angka disini ");
   int angka = Integer.parseInt(l);
   m=JOptionPane.showInputDialog("Silahkan masukkan pangkat disni ");
   int pangkat = Integer.parseInt(m);
   
   
   for (int n = 1; n < pangkat;n++)
   {
     k = k * angka;
    }
 String hasil= angka + "^" + pangkat + "=" + k;
 JOptionPane.showMessageDialog(null, hasil);
 }
}

//while
 
// int n=1;
//   while (n<=pangkat){
//    n++;
//    k=k*angka;
//   }
//   String hasil= angka + "^" + pangkat + "=" + k;
//   JOptionPane.showMessageDialog(null, hasil);

//do while

// int n=1;
//   do {
//       k= k*pangkat;
//       n++;
//   }while(n<=pangkat);
//       String hasil = angka + "^" + pangkat + "=" +k;
//    JOptionPane.showMessageDialog(null, hasil);
//   }










// while (i<pangkat){
// h = h*input;
// i++;
// }
// System.out.println(input + " ^ " +pangkat +" = " +h);
// 
// }
// 

//do {
// h = h*angka;
// i++ ;
// }while(i<pangkat);
// System.out.println(angka +" ^ " + pangkat + " = " +h);
//}
// }

//int h = 1;
// 
// for (int i = 1; i < pkt;i++){
// h = h * nilai;
// }
// System.out.println(nilai+ " ^ " + pkt + " = " +h);
//  }
// }
