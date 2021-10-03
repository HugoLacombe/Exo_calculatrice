/*TP0
 * Hugo Lacombe
 *Additon d'entier
 * 27/07/2021
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author 33695
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Declaration des variables
    int nb; //nb entier à additionner
    int result; //resultat
    int ind;//indice
  //  nb=5;
     Scanner sc=new Scanner(System.in); 
     System.out.println("\n Entrer le nombre :");
     nb=sc.nextInt();//demande la valeur
     result=0;
    
    //Addition des nb premiers entiers
    ind=1;
    while (ind<=nb) {
        result=result+ind;
        ind+=1;
    }
    //Affichage du resultat
    System.out.println();
    System.out.println("La somme des "+ nb +" entiers est: "+ result);
    }
    }
   
