/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_8;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }
    public Mahasiswa() {
        nama = "";
        nim = "";
        jurusan = "";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void print () {
        System.out.println("Nama        : "+this.nama);
        System.out.println("NIM         : "+this.nim);
        System.out.println("Jurusan     : "+this.jurusan+"\n");
    }
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Kenny", "18615021", "D3 Teknik Informatika");
        mhs1.print();
       
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNama("burhan");
        mhs2.setNim("19615021");
        mhs2.setJurusan("D3 Teknik Elektro");
        mhs2.print();
    }
}
