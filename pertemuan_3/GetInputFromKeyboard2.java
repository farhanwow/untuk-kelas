/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
        String name = "", hobby = "";
        
        name = JOptionPane.showInputDialog("Nama Anda : ");
        hobby = JOptionPane.showInputDialog("Masukan Hobby :");
        
        String msg = "Jadi Anda Hobi "+hobby+" hobi yang bagus pak "+name;
        JOptionPane.showMessageDialog(null, msg);
        System.out.println("jadi anda hobi "+hobby+" hobi yang bagus pak "+name);
    }
}
