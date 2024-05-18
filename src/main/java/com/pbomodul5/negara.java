package com.pbomodul5;

public class negara extends benua{
    protected String namenegara;
    protected String ibukota;
    public negara(){
        System.out.println("Nama Benua : "+namebenua);
        namenegara="Indonesia";
        ibukota="Jakarta";
    }
    public negara(String namenegara, String ibukota){
        this.namenegara = namenegara;
        this.ibukota = ibukota;
    }
    public String getName(){
        return namenegara;
    }
    public String getIbukota(){
        return ibukota;
    }
}
