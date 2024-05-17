package com.pbomodul5;

public class Bapak extends Kakek {
    protected String namebapak;
    protected String addressbapak;

    public bapak(){
    System.out.println("Nama Kakek : "+namakakek);
    System.out.println("Alamat Kakek : "+address);
    System.out.println("\n");
    System.out.println("Masukan konstruktor bapak");
    System.out.println("Dijalankan oleh class cucu");
    namebapak="ROHAEDI";
    addressbapak="Kuningan";
    }

    public bapak(String namebapak, String addressbapak){
        this.namebapak = namebapak;
        this.addressbapak = addressbapak;
    }

    public String getName() {
        return namebapak;
    }

    public String getAddress() {
        return addressbapak;
    }

    public static void main(String[] args) {
        bapak sari = new bapak();
    }
}
