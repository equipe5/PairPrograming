/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprograming.exercicio4;
import java.util.Scanner;
/**
 *
 * @author André
 */
public class Principal {
    public static void main(String args[]) {
    Scanner ObjLer = new Scanner(System.in);
    String resposta; 
    
    do{
    System.out.println("----------Tabuada de Numero maior que 5----------\n");
    System.out.println("Digite um numero inteiro: ");
    int numero = ObjLer.nextInt();
		
    
    
    CalculoTabuada CT = new CalculoTabuada();
    CT.setNumero(numero);
    CT.isprimo(numero);
    CT.tabuada();
    
    System.out.println("Você deseja realizar algum novo calculo?");
    System.out.println("Digite 'sim' para continuar...");
    resposta = ObjLer.next();
    
    }while (resposta.equalsIgnoreCase("sim")); 
            
    }
}