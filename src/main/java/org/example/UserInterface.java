package org.example;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private EvidencePojistencu evidence;

    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.evidence = new EvidencePojistencu();
    }

    public void start() {
        while (true) {
            System.out.println("\n--- Evidence Pojištěnců ---");
            System.out.println("1. Přidej nové pojištěnce");
            System.out.println("2. Zobrazit všechny pojištěnce");
            System.out.println("3. Vyhledej pojištěnce");
            System.out.println("4. Ukončit program");
            System.out.print("Vyberte možnost: ");

            int volba = Integer.parseInt(scanner.nextLine());

            switch (volba) {
                case 1:
                    pridatPojistence();
                    break;
                case 2:
                    evidence.zobrazitVsechnyPojistence();
                    break;
                case 3:
                    vyhledejPojistence();
                    break;
                case 4:
                    System.out.println("Program ukončen.");
                    return;
                default:
                    System.out.println("Neplatná volba. Zkus to znovu.");
            }
        }


    }
    private void pridatPojistence() {
        System.out.println("Zadej jméno pojištěnce: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej přijmení pojištěnce: ");
        String prijmeni = scanner.nextLine();
        System.out.println("Zadej věk pojištěnce: ");
        int vek = Integer.parseInt(scanner.nextLine());
        System.out.println("Zadej telefonní číslo pojištěnce: ");
        int telefonniCislo = Integer.parseInt(scanner.nextLine());

        Pojistenec novyPojistenec = new Pojistenec(jmeno, prijmeni, vek, telefonniCislo);
        evidence.pridejPojistence(novyPojistenec);

    }

    private void vyhledejPojistence() {
        System.out.println("Zadej jméno: ");
        String jmeno = scanner.nextLine();
        System.out.println("Zadej přijmení: ");
        String prijmeni = scanner.nextLine();
        evidence.vyhledejPojistence(jmeno, prijmeni);
    }


}