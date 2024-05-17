package com.pbomodul5;
public class Person {
    private String Nama;
    private String Alamat;
    private int Umur;
    public Person(String Nama, String Alamat, int Umur){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.Umur = Umur;
    }
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public int getUmur(){
        return Umur;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setAlamat(String Alamat){
        this.Alamat = Alamat;
    }
    public void setUmur(int Umur){
        this.Umur = Umur;
    }
    public void infoPerson(){
        System.out.println("\nInfoPerson");
        System.out.println("Nama\t\t : "+getNama());
        System.out.println("Alamat\t\t : "+getAlamat());
        System.out.println("Umur :\t\t "+getUmur());
    }
}
