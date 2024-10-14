package org.example;

import java.util.ArrayList;


public class EvidencePojistencu {
    private ArrayList<Pojistenec> pojistenci;

    public EvidencePojistencu() {
        pojistenci = new ArrayList<>();
    }

    public void pridejPojistence(Pojistenec novyPojistenec) {
        pojistenci.add(novyPojistenec);
        System.out.println("Pojištěnec byl úspěšně přidán.");
    }

    public void zobrazitVsechnyPojistence() {
        if (pojistenci.isEmpty()) {
            System.out.println("Seznam pojistenců je prázdný. ");
        } else {
            for (Pojistenec pojistenec : pojistenci) {
                System.out.println(pojistenec);
            }
        }
    }

    public void vyhledejPojistence(String jmeno, String prijmeni) {
        boolean nalez = false;
        for (Pojistenec pojistenec : pojistenci) {
            if (pojistenec.getJmeno().equalsIgnoreCase(jmeno) && pojistenec.getPrijmeni().equalsIgnoreCase(prijmeni)) {
                System.out.println(pojistenec);
                nalez = true;
            }
        }
        if (!nalez) {
            System.out.println("Pojištěnec nenalezen.");
        }
    }


}