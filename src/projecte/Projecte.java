/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ent=new Scanner(System.in);
        Scanner in=new Scanner(System.in);
        String model = null, luthier = null;
        double preu=0;
        boolean tapa = false, omplit = false;
        int opcio = 5, any=0;
        char esTapa = ' ';
        
        while (!(opcio == 0)) {
            System.out.println("--------MENÚ--------");
            System.out.println("0. Sortir");
            System.out.println("1. Afegir violí");
            System.out.println("2. Borrar violí");
            System.out.println("3. Modificar violí");
            System.out.println("4. Llistar violins");
            opcio=ent.nextInt();
        
        switch (opcio) {
            case 0:
                break;
            case 1:
                if (omplit!=true) {
                    System.out.println("Introducció de les dades del violí.");
                    System.out.println("Introdueix el model.");
                    model = ent.skip("[\r\n]*").nextLine();
                    System.out.println("Introdueix el luthier.");
                    luthier = ent.skip("[\r\n]*").nextLine();
                    System.out.println("Introdueix l'any.");
                    any=ent.nextInt();
                    System.out.println("Introdueix el preu.");
                    preu=in.nextDouble();
                    System.out.println("És de tapa única? (Si/No)");
                        do {
                            esTapa = ent.nextLine().toUpperCase().charAt(0);
                        } while (esTapa != 'S' && esTapa != 'N');
                        tapa = (esTapa == 'S');
                        
                    omplit=true;
                    break;
                } else {
                    System.out.println("Ja has introduit les dades, si en vols tornar a introduir, borra-les primer.");
                }
            case 2:
                System.out.println("Borrant les dades...");
                model = null;
                luthier = null;
                any = 0;
                preu = 0;
                tapa = false;
                omplit=false;
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("Violí 1:");
                System.out.println("Model: "+model);
                System.out.println("Luthier: "+luthier);
                System.out.println("Any: "+any);
                System.out.println("Preu: "+preu);
                System.out.println("Tapa única? "+tapa);
                break;
            default:
                System.out.println("Has d'introduir una opció vàlida!");
              
        }
        }
    }
}