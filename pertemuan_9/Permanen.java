/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_9;

/**
 *
 * @author HP
 */
public class Permanen extends Karyawan {
    //property milik permanen
    String NIP;
    String TMT;
    String jabatan;

    public Permanen() {
        super();
    }

    public Permanen(String NIP, String TMT, String jabatan, String namaKaryawan, String alamatKaryawan, String divisiKaryawan) {
        super(namaKaryawan, alamatKaryawan, divisiKaryawan);
        this.NIP = NIP;
        this.TMT = TMT;
        this.jabatan = jabatan;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getTMT() {
        return TMT;
    }

    public void setTMT(String TMT) {
        this.TMT = TMT;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public void viewData() {
        super.viewData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("NIP                        : "+this.NIP);
        System.out.println("TMT                      : "+this.TMT);
        System.out.println("Jabatan                         : "+this.jabatan);
    }
    
    
}
