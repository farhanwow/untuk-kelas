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
public class Karyawan {
    //property
    String namaKaryawan;
    String alamatKaryawan;
    String divisiKaryawan;

    public Karyawan() {
        this.namaKaryawan = "";
        this.alamatKaryawan = "";
        this.divisiKaryawan = "";
    }

    public Karyawan(String namaKaryawan, String alamatKaryawan, String divisiKaryawan) {
        this.namaKaryawan = namaKaryawan;
        this.alamatKaryawan = alamatKaryawan;
        this.divisiKaryawan = divisiKaryawan;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    public String getDivisiKaryawan() {
        return divisiKaryawan;
    }

    public void setDivisiKaryawan(String divisiKaryawan) {
        this.divisiKaryawan = divisiKaryawan;
    }
    
    public void viewData() {
        System.out.println("==============data karyawan==============");
        System.out.println("Nama                        : "+this.namaKaryawan);
        System.out.println("Alamat                      : "+this.alamatKaryawan);
        System.out.println("Divisi                         : "+this.divisiKaryawan);
    }
    
}
