package com.example.bilregister;
import java.util.ArrayList;
import java.util.List;

public class BilController {
    private static List<Bil> biler = new ArrayList<>();

    public static void addCar(String persNum, String navn, String adresse, String bilskilt, String merke, String modell) {
        Bil bil = new Bil(persNum, navn, adresse, bilskilt, merke, modell);
        biler.add(bil);
    }

    public static List<Bil> getCars() {
        return biler;
    }
}
