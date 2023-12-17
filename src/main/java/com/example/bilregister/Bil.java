package com.example.bilregister;

public class Bil {
    private String persNum;
    private String navn;
    private String adresse;
    private String bilskilt;
    private String merke;
    private String modell;

    public Bil (String persNum, String navn, String adresse, String bilskilt, String merke, String modell) {
        this.persNum = persNum;
        this.navn = navn;
        this.adresse = adresse;
        this.bilskilt = bilskilt;
        this.merke = merke;
        this.modell = modell;
    }
}
