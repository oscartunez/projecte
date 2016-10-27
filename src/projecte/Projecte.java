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
        String model=null;
        String luthier=null;
        double preu;
        boolean tapa = false;
        int opcio, any;
        
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
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("Has d'introduir una opció vàlida!");
              
        }
    }
}