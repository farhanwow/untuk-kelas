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
public class Penggajian {
    long gaji_pokok;
    long tuj_kel;
    long uang_makan;
    long gaji_bulanan;
    long tunj_abdi;
    int hari_kerja;
    
    public long getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(long gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    public long getTuj_kel() {
        return tuj_kel;
    }

    public void setTuj_kel(long tuj_kel) {
        this.tuj_kel = tuj_kel;
    }

    public long getUang_makan() {
        return uang_makan;
    }

    public void setUang_makan(long uang_makan) {
        this.uang_makan = uang_makan;
    }

    public long getGaji_bulanan() {
        
//        gajiPokok = gaji_pokok;
        
        return gaji_bulanan =  gaji_pokok+uang_makan+tunj_abdi+tuj_kel;
    }

    public void setGaji_bulanan(long gaji_bulanan) {
        this.gaji_bulanan = gaji_bulanan;
    }

    public long getTunj_abdi() {
        return tunj_abdi;
    }

    public void setTunj_abdi(long tunj_abdi) {
        this.tunj_abdi = tunj_abdi;
    }

    public int getHari_kerja() {
        return hari_kerja;
    }

    public void setHari_kerja(int hari_kerja) {
        this.hari_kerja = hari_kerja;
        
    }
    public void gajiPegawai(int jenis_peg,  int tahun_abdi, int hari) {
        if (jenis_peg==1){
            gaji_pokok = 3500000;
            uang_makan = 2750000;
            tuj_kel =  1500000;
            
            if ((tahun_abdi >3) && (tahun_abdi < 8)) {
                tunj_abdi = 750000;
            }
            else if (tahun_abdi > 7) {
                tunj_abdi = 125000;
            }
            
        }
        else if (jenis_peg==2) {
            gaji_pokok = 2500000;
            uang_makan = 12500;
        }
        
    }
    
        public static void main(String[] args) {
            Penggajian p = new Penggajian();
            
            String stringJP = "";
            String stringTA = "";
            String stringHK = "";
            
            int iJP = 0;
            int iTA = 0;
            int iHK = 0;
            
            stringJP = JOptionPane.showInputDialog("pilih jenis karyawan.\n 1. karyawan permanen \n 2. karyawan kontrak");
            stringTA = JOptionPane.showInputDialog("masukkan lama pengabdian dalam tahun");
            stringHK = JOptionPane.showInputDialog("masukkan lama hari kerja");
            
            iJP = Integer.parseInt (stringJP);
            iTA = Integer.parseInt (stringTA);
            iHK = Integer.parseInt (stringHK);
            
            p.gajiPegawai(iJP, iTA, iHK);
            JOptionPane.showMessageDialog(null, "gaji anda adalah Rp."+p.getGaji_bulanan());
    }
        
}
