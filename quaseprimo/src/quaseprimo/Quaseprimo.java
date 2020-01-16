/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quaseprimo;
import java.util.Scanner;

/**
 *
 * @author Cesar_Gennaro
 */
public class Quaseprimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Insira um numero de 1 a 1000 :");
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    int num2 = num - 1;
    int cont = 0;
    int res= 0;
    if (num == 1||num == 2){
       System.out.println("N"); 
     
    }else{
    for (int i = num2; i > 1; i--) {
        res= num% i;
     
      if( res == 0){
              cont++;
        }
      
        if (cont==2){
  
           break;
            
        }
      }
   if (cont==1){
             System.out.println("S");
         }else {
    System.out.println("N");
    }
    }
    }
}
