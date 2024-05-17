package com.pbomodul5;

public class Kakek {
    protected String namakakek;
    protected String address;
    public Kakek(String namakakek, String address){
        System.out.println("\n Program Demo Inheritance");
        System.out.println("====================================");
        System.out.println("Masukan konstruktor kakek");
        System.out.println("Dijalankan oleh class bapak");
        namakakek = "Joyo Cokro Aminoto";
        address = "Sleman Dajogjakarta";

    }
    public kakek(String namakakek, String address){
        this.namakakek = namakakek;
        this.address = address;
    }
    public String getName(){
        return namakakek;
    }
    public String getAddress(){
        return address;
    }
}
