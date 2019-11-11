/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_5;
import javax.swing.JOptionPane;
import javax.swing.JButton;


/**
 *
 * @author HP
 */


public class Penggajian1 {
    
    int gajiPokok;
    int uangMakan;
    int tunjanganUangKeluarga;
    int gajiBulanan;
    int tunjanganAbdi;
    int hariKerja;

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public int getTunjanganAbdi() {
        return tunjanganAbdi;
    }

    public void setTunjanganAbdi(int tunjanganAbdi) {
        this.tunjanganAbdi = tunjanganAbdi;
    }

    public int getGajiBulanan() {
        return gajiBulanan =  (hariKerja * uangMakan) + gajiPokok + tunjanganUangKeluarga + tunjanganAbdi;
    }

    public void setGajiBulanan(int gajiBulanan) {
        this.gajiBulanan = gajiBulanan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(int uangMakan) {
        this.uangMakan = uangMakan;
    }

    public int getTunjanganUangKeluarga() {
        return tunjanganUangKeluarga;
    }

    public void setTunjanganUangKeluarga(int tunjanganUangKeluarga) {
        this.tunjanganUangKeluarga = tunjanganUangKeluarga;
    }
    public void gajiPegawai (int jenisPegawai, int tahunKerja, int hari) {
        if (jenisPegawai == 1) {
            gajiPokok = 3500000;
            uangMakan = 27500;
            tunjanganUangKeluarga = 1500000;
            hariKerja = hari;
            if (tahunKerja >= 3 && tahunKerja <= 7) 
                     tunjanganAbdi = 750000;
            else if (tahunKerja > 7) 
                     tunjanganAbdi = 1250000;
            
        }
        else if (jenisPegawai == 2) {
            gajiPokok = 2200000;
            uangMakan = 12500;
            tunjanganUangKeluarga = 0;
            hariKerja = hari;
        }
    }
    public static void main(String[] args) {
        Penggajian1 penggajian = new Penggajian1();
        
        String strJenisPegawai = "";
        String strTahunKerja = "";
        String strHariKerja = "";
        
        int iJenisPegawai = 0;
        int iTahunKerja = 0;
        int iHariKerja = 0;
    
        strJenisPegawai = JOptionPane.showInputDialog("Jenis pegawai apakah anda :\n 1.Permanen\n 2.Kontrak");
        iJenisPegawai = Integer.parseInt(strJenisPegawai);
        
        if (iJenisPegawai == 1) {
        strTahunKerja = JOptionPane.showInputDialog("Berapa tahun anda telah bekerja");
        strHariKerja = JOptionPane.showInputDialog("Sudah Berapa Hari Anda Bekerja Dalam Sebulan Ini");
        
        iTahunKerja = Integer.parseInt(strTahunKerja);
        iHariKerja = Integer.parseInt(strHariKerja);
        
         penggajian.gajiPegawai(iJenisPegawai, iTahunKerja, iHariKerja);
        JOptionPane.showMessageDialog(null,"jenis pegawai : permanen"+
                                                                                   "\nwaktu bekerja "+penggajian.getHariKerja()+ " hari"+
                                                                                   "\ntahun abdi "+iTahunKerja+ " tahun"+
                                                                                   "\n====================================="+
                                                                                   "\ntotal gaji RP."+penggajian.getGajiBulanan());
        }
        else if (iJenisPegawai == 2) {
            strHariKerja = JOptionPane.showInputDialog("Sudah Berapa Hari Anda Bekerja Dalam Sebulan Ini");
           
            iHariKerja = Integer.parseInt(strHariKerja);
           
            penggajian.gajiPegawai(iJenisPegawai, iTahunKerja, iHariKerja);
           JOptionPane.showMessageDialog(null,"jenis pegawai : Kontrak"+
                                                                                      "\nwaktu bekerja "+penggajian.getHariKerja()+" hari"+
                                                                                      "\n====================================="+
                                                                                      "\ntotal gaji RP."+penggajian.getGajiBulanan());
        }
        
    }
}
