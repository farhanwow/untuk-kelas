/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_2;

/**
 *
 * @author HP
 */
public class Shirt 
{
    public int shirtID = 0; //
    public String description ="-description required-"; // 
    public char colorCode = 'u'; //
    public double price= 0.0; // ----	salah menggunakan huruf dalam tipe
//data
    public int quantityInStok = 0; //


    public void displayShirtInformation() { 
        System.out.println("Shirt ID : "+shirtID); 
        System.out.println("Shirt Description : "+description); 
        System.out.println("Color Code : "+colorCode); 
        System.out.println("Shirt Price : "+price);
        System.out.println("Quantity in Stock : "+quantityInStok);
    }


    public static void main(String[] args) 
    {
        Shirt shirt=new Shirt(); 
        shirt.displayShirtInformation();
    }    
    
}
