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
public class UtamaKaryawan {
    public static void main(String[] args) {
        Permanen karyawan1 = new Permanen();
        Kontrak karyawan2 = new Kontrak();
        
        //data karyawan 1
        karyawan1.setNamaKaryawan("Farhan");
        karyawan1.setAlamatKaryawan("Samarinda");
        karyawan1.setDivisiKaryawan("IT");
        karyawan1.setNIP("17628021");
        karyawan1.setTMT("1 Januari 2017");
        karyawan1.setJabatan("IT security");
        //data karyawan 2
        karyawan2.setNamaKaryawan("Burhan");
        karyawan2.setAlamatKaryawan("Tenggarong");
        karyawan2.setDivisiKaryawan("IT");
        karyawan2.setNoKontrak("KO02");
        karyawan2.setTglMulai("1 Januari 2017");
        karyawan2.setTglAkhir("31 Desember 2017");
        karyawan2.setVendor("MultiMedia");
        
        //tampilkan data karyawan 1
        System.out.println("KARYAWAN 1");
        karyawan1.viewData();
        System.out.println("KARYAWAN 2");
        karyawan2.viewData();
        
    }
}
