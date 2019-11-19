/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan_7;

/**
 *
 * @author user
 */
public class BangunDatar 
{
    //variable-atribut
    float alas;
    float tinggi;
    int sisi;
    final float pi = (float) 3.14;
    float rad;
    
    //constructor

    public BangunDatar() {
        
    }

    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public BangunDatar(float rad) {
        this.rad = rad;
    }

    public float getAlas() {
        return alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public int getSisi() {
        return sisi;
    }

    public float getPi() {
        return pi;
    }

    public float getRad() {
        return rad;
    }
    
    

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }
    
    public float luasBangunDatar(int sisi)
    {
        return sisi * sisi;
    }
    
    public float luasBangunDatar(float rad)
    {
       return (float) pi * (rad*rad);
    }
    
    public float luasBangunDatar(float alas, float tinggi)
    {
        return (alas * tinggi)/2;
    }
    
    public static void main(String[] args) {
        BangunDatar persegi1 = new BangunDatar();
        BangunDatar persegi2 = new BangunDatar(10);
        persegi1.setSisi(5);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Luas Persegi 1 adalah : " + persegi1.luasBangunDatar(persegi1.getSisi()));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Luas Persegi 2 adalah : " + persegi2.luasBangunDatar(persegi2.getSisi()));
        System.out.println("--------------------------------------------------------------------");
        
        BangunDatar lingkaran1 = new BangunDatar();
        BangunDatar lingkaran2 = new BangunDatar((float)5);
        lingkaran1.setRad(7);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Luas lingkaran 1 adalah : " + lingkaran1.luasBangunDatar(lingkaran1.getRad()));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Luas lingkaran 2 adalah : " + lingkaran2.luasBangunDatar(lingkaran2.getRad()));
        System.out.println("--------------------------------------------------------------------");
        
        BangunDatar segi1 = new BangunDatar();
        BangunDatar segi2 = new BangunDatar(4,8);
        segi1.setAlas(3);
        segi1.setTinggi(10);
        
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Luas Segi Tiga 1 adalah : " + segi1.luasBangunDatar(segi1.getAlas(), segi1.getTinggi()));
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Luas Segi Tiga 2 adalah : " + segi2.luasBangunDatar(segi2.getAlas(), segi2.getTinggi()));
        System.out.println("--------------------------------------------------------------------");
    }
}
