/*TP0
 *Hugo Lacombe
*Exo3
* 27/09/2021
 */
package exo3;

import java.util.Scanner;

/**
 *
 * @author Hugo LAcombe
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator \n 1) add \n 2) substract \n 3) multiply \n 4) divide \n 5) modulo");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Entrer un nombre :");
        int operator = sc.nextInt();
         while (operator>5||operator<0){
             System.out.println("Erreur choissir un nombre entre 1 et 5");
             System.out.println("\n Entrer un nombre :");
             operator = sc.nextInt();
             
         }
         
         
         
        System.out.println("\n Entrer une premiere valeur :");
        Float operande1 = sc.nextFloat();
        System.out.println("\n Entrer une deuxieme valeur :");
        Float operande2 = sc.nextFloat();
        float result;
        switch(operator){
            case 1 ://addition 
                result = operande1+operande2;
                System.out.println("Le résultat est "+ result);
                break;
            case 2 : //substract 
                result = operande1-operande2;
                System.out.println("Le résultat est "+ result);
                break;
            case 3 : //multiply 
                result = operande1*operande2;
                System.out.println("Le résultat est "+ result);
                break;
            case 4: //divide
                result=operande1/operande2 ;
                System.out.println("Le résultat est "+ result);
                break;
            case 5 : //modulo
                result = operande1%operande2;
                System.out.println("Le résultat est "+ result);
                break;
                
            
         
                
        }
        
        
        
        
    }
    
}
