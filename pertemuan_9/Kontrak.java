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
public class Kontrak extends Karyawan{
    String noKontrak;
    String tglMulai;
    String tglAkhir;
    String vendor;

    public Kontrak() {
        super();
    }

    public Kontrak(String noKontrak, String tglMulai, String tglAkhir, String vendor, String namaKaryawan, String alamatKaryawan, String divisiKaryawan) {
        super(namaKaryawan, alamatKaryawan, divisiKaryawan);
        this.noKontrak = noKontrak;
        this.tglMulai = tglMulai;
        this.tglAkhir = tglAkhir;
        this.vendor = vendor;
    }

    public String getNoKontrak() {
        return noKontrak;
    }

    public void setNoKontrak(String noKontrak) {
        this.noKontrak = noKontrak;
    }

    public String getTglMulai() {
        return tglMulai;
    }

    public void setTglMulai(String tglMulai) {
        this.tglMulai = tglMulai;
    }

    public String getTglAkhir() {
        return tglAkhir;
    }

    public void setTglAkhir(String tglAkhir) {
        this.tglAkhir = tglAkhir;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Override
    public void viewData() {
        super.viewData(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("No Kontrak                                  : "+this.noKontrak);
        System.out.println("Tanggal Mulai                             : "+this.tglMulai);
        System.out.println("Tanggal Akhir                              : "+this.tglAkhir);
        System.out.println("Vendor                                          : "+this.vendor);
    }
    
}
