package com.pbomodul5;

public class Tampil {
    public static void main(String[] args) {
        Person a = new Person("rere", "cijoho", 29);
        a.infoPerson();
        Dosen b = new Dosen("Gugun", "Kuningan", 45, "17.05.05");
        b.infoDosen();
        Mahasiswa c = new Mahasiswa("Ina", "Le akwangi", 17, "13.11.7066");
        c.infoMahasiswa();
        System.out.println("====================================");
    }
}
