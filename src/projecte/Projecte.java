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
        String model = null, luthier = null;
        double preu = 0;
        boolean tapa = false, omplit = false, llista = false, borrar = false;
        int opcio = 5, any=0;
        char esTapa = ' ', esLlista = ' ', esBorrar = ' ';
        
        while (!(opcio == 0)) {
            System.out.println("--------MENÚ--------");
            System.out.println("0. Sortir");
            System.out.println("1. Afegir violí");
            System.out.println("2. Borrar violí");
            System.out.println("3. Modificar violí");
            System.out.println("4. Llistar violins");
            opcio=ent.skip("[\r\n]*").nextInt();
        
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
                    any=ent.skip("[\r\n]*").nextInt();
                    System.out.println("Introdueix el preu.");
                    preu=ent.skip("[\r\n]*").nextDouble();
                    System.out.println("És de tapa única? (Si/No)");
                        do {
                            esTapa = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                        } while (esTapa != 'S' && esTapa != 'N');
                        tapa = (esTapa == 'S');
                        
                    omplit=true;
                    break;
                } else {
                    System.out.println("Ja has introduit les dades, si en vols tornar a introduir, borra-les primer.");
                }
            case 2:
                if (omplit != false) {
                    
                    System.out.println("Vols veure les dades? (S/N)");
                    do {
                        esLlista = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                    }while (esLlista !='S' && esLlista !='N');
                    esLlista = 'S';
                    System.out.println("Model: "+model);
                    System.out.println("Luthier: "+luthier);
                    System.out.println("Any: "+any);
                    System.out.println("Preu: "+preu);
                    System.out.println("Tapa única? "+tapa);
                    System.out.println("Segur que el vols borrar? (S/N)");
                    do {
                        esBorrar = ent.skip("[\r\n]*").nextLine().toUpperCase().charAt(0);
                    }while (esBorrar !='S' && esBorrar !='N');
                    esBorrar = 'S';
                    model = null;
                    luthier = null;
                    any = 0;
                    preu = 0;
                    tapa = false;
                    omplit = false;
                    System.out.println("Violí borrat correctament!");
                } else {
                    System.out.println("No hi ha dades a borrar!");
                }
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                if (omplit != false) {
                    System.out.println("Model: "+model);
                    System.out.println("Luthier: "+luthier);
                    System.out.println("Any: "+any);
                    System.out.println("Preu: "+preu);
                    System.out.println("Tapa única? "+tapa);
                } else {
                    System.out.println("No hi ha dades a mostrar!");
                }             
                break;
            default:
                System.out.println("Has d'introduir una opció vàlida!");
              
        }
        }
    }
}