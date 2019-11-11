/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_5;

import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class Penggajian2 {
    int UKT;
    double IPK;
    int Bantuan;
    int IuranModul;
    int BiayaKuliah;
    
    public int getUKT(int menu) {
        if (menu==1) {
            UKT = 1500000;
        }
        else if (menu==2) {
            UKT = 1750000;
        }
        else if (menu==3) {
            UKT = 2500000;
        }
        else if (menu==4) {
            UKT = 3500000;
        }
       
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
        
        if (IPK >= 3 && IPK <= 3.5) {
            Bantuan = (int)(UKT*0.05);
        }
        else if (IPK > 3.5 && IPK <= 4.0) {
            Bantuan = (int)(UKT*0.075);
        }
        
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


//    void jenisUKT(int menu) {
//        Penggajian2 Kuliah = new Penggajian2();
//
//    }
    public static void main(String[] args) {
        Penggajian2 Bayar = new Penggajian2();
        
        String strUKT = "";
        String strIPK = "";
        int iUKT = 0;
        double fltIPK = 0.0;
        strUKT = JOptionPane.showInputDialog("masukkan kategori UKT anda");
        iUKT = Integer.parseInt(strUKT);
       
       
        if (iUKT < 1  || iUKT > 4 ) 
            JOptionPane.showMessageDialog(null, "ERROR : kategori UKT hanya dapat di isi dengan bilangan bulat (1-4)");
        else if(iUKT >= 1 && iUKT <= 4) {
             strIPK = JOptionPane.showInputDialog("masukkan IPK anda");
             fltIPK = Float.parseFloat(strIPK);
           if (fltIPK < 1.0 || fltIPK > 4.0) 
                JOptionPane.showMessageDialog(null, "ERROR : rentang IPK yang dapat di input ialah 1 - 4");
           else if (fltIPK >= 1.0 && fltIPK <= 4.0) {
                JOptionPane.showMessageDialog(null,"Jenis UKT = "+iUKT+
                                                                                          "\nUKT = RP."+Bayar.getUKT(iUKT)+
                                                                                          "\nIPK = RP."+fltIPK+
                                                                                          "\nIuran Modul = RP."+Bayar.getIuranModul(fltIPK)+
                                                                                          "\nBantuan = RP."+Bayar.getBantuan(fltIPK)+
                                                                                          "\nTotal = (UKT + Iuran Modul) - Bantuan"+
                                                                                          "\n          = (RP."+Bayar.getUKT(iUKT)+" + RP."+Bayar.getIuranModul(fltIPK)+") - RP."+Bayar.getBantuan(fltIPK)+
                                                                                          "\n          = RP."+Bayar.getBiayaKuliah() );
            }
           
        }
        
    }
}