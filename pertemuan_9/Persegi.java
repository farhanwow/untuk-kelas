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
public class Persegi implements BangunDatar {
    float panjang;
    float lebar;

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public float luasBangunDatar() {
        return this.panjang * this.lebar;
    }

    @Override
    public float kelilingBangunDatar() {
        return 2 * (this.panjang + this.lebar);
    }
}
