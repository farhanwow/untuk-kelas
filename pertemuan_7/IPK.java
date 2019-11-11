// NAMA  : SILITONGA, KENNY VITO
// NIM   : 18615021
// KELAS : D3 T.INFORMATIKA 3A

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_7;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
/**
 *
 * @author HP
 */
public class IPK {
    int UKT;
    double IPK;
    int Bantuan;
    int IuranModul;
    int BiayaKuliah;
    
    public int getUKT(int menu) {
        if (menu==1) 
            UKT = 1500000;
        else if (menu==2) 
            UKT = 1750000;
        else if (menu==3) 
            UKT = 2500000;
        else if (menu==4) 
            UKT = 3500000;
        
        return UKT;
    }

    public void setUKT(int UKT) {
        this.UKT = UKT;
    }
    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    
    public int getBantuan(double mthdIPK) {
        IPK = mthdIPK;
        
        if (IPK >= 3 && IPK <= 3.5) 
            Bantuan = (int)(UKT*0.05);
        else if (IPK > 3.5 && IPK <= 4.0) 
            Bantuan = (int)(UKT*0.075);
        
        return Bantuan;
    }

    public void setBantuan(int Bantuan) {
        this.Bantuan = Bantuan;
    }

    public int getIuranModul(double mthdIPK) {
        IPK = mthdIPK;
        
        if (IPK >= 3.75 && IPK <= 4)
            IuranModul = 0;  
        else if(IPK >= 1 && IPK < 3.75)
            IuranModul = 350000;
        
        return IuranModul;
    }

    public void setIuranModul(int IuranModul) {
        this.IuranModul = IuranModul;
    }
    

    public int getBiayaKuliah() {
        return BiayaKuliah = (UKT+IuranModul) - Bantuan;
    }

    public void setBiayaKuliah(int BiayaKuliah) {
        this.BiayaKuliah = BiayaKuliah;
    }

    public static void main(String[] args) {
        // function menambah titik pada uang
        DecimalFormat kursIDR = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp. ");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        kursIDR.setDecimalFormatSymbols(formatRP);
        //   inisialisasi kelas dan variable
        IPK StatusMHS = new IPK();
        
        String strUKT = "";
        String strIPK = "";
        StatusMHS.UKT = 0;
        StatusMHS.IPK = 0.0;
        // deklarasi       
        while(true) {
            strUKT = JOptionPane.showInputDialog("masukkan kategori UKT anda");
            StatusMHS.UKT = Integer.parseInt(strUKT);
            if (StatusMHS.UKT < 1  || StatusMHS.UKT > 4 ) {
                JOptionPane.showMessageDialog(null, "ERROR : kategori UKT hanya dapat di isi dengan bilangan bulat (1-4)");
                continue;
            }
            else if(StatusMHS.UKT >= 1 && StatusMHS.UKT <= 4) {
                while(true) {
                    strIPK = JOptionPane.showInputDialog("masukkan IPK anda");
                    StatusMHS.IPK = Double.parseDouble(strIPK);
                    if (StatusMHS.IPK < 1.0 || StatusMHS.IPK > 4.0) {
                        JOptionPane.showMessageDialog(null, "ERROR : rentang IPK yang dapat di input ialah 1 - 4");
                        continue;
                    }
                    else if (StatusMHS.IPK >= 1.0 && StatusMHS.IPK <= 4.0) {
                        JOptionPane.showMessageDialog(null, "Jenis UKT = "+StatusMHS.UKT+
                                                            "\nUKT = "+kursIDR.format(StatusMHS.getUKT(StatusMHS.UKT))+
                                                            "\nIPK = "+ StatusMHS.IPK+
                                                            "\nIuran Modul = "+kursIDR.format(StatusMHS.getIuranModul(StatusMHS.IPK))+
                                                            "\nBantuan = "+kursIDR.format(StatusMHS.getBantuan(StatusMHS.IPK))+
                                                            "\nTotal = (UKT + Iuran Modul) - Bantuan"+
                                                            "\n          = ("+kursIDR.format(StatusMHS.getUKT(StatusMHS.UKT))+" + "+
                                                                                kursIDR.format(StatusMHS.getIuranModul(StatusMHS.IPK))+") - "+
                                                                                kursIDR.format(StatusMHS.getBantuan(StatusMHS.IPK))+
                                                            "\n          = "+kursIDR.format(StatusMHS.getBiayaKuliah()) );
                        break;
                    }
                }
            }
        break;
        }
        //Akhir deklarasi
        
    }
    
}