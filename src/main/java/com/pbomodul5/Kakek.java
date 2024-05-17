package com.pbomodul5;

public class kakek {
    protected String namekakek;
    protected String address;
    public kakek(String namekakek, String address){
        System.out.println("\n Program Demo Inheritance");
        System.out.println("====================================");
        System.out.println("Masukan konstruktor kakek");
        System.out.println("Dijalankan oleh class bapak");
        namekakek = "Joyo Cokro Aminoto";
        address = "Sleman Dajogjakarta";

    }
    public kakek(String namekakek, String address){
        this.namekakek = namekakek;
        this.address = address;
    }
    public String getName(){
        return namekakek;
    }
    public String getAddress(){
        return address;
    }
}
