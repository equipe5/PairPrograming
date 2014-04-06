/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprograming.exercicio3;
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
    System.out.println("----------Cálculo do cilindro----------");
    System.out.println("utilizar a ',' para calculos quabrados\n");
    System.out.println("Digite o valor do RAIO do Cilindro: ");
    double R = ObjLer.nextDouble();
		
    System.out.println("Digite o valor da ALTURA do Cilindro: ");
    double L = ObjLer.nextDouble();
    
    CalculoVolumeCilindro CV = new CalculoVolumeCilindro();
    CV.setL(L);
    CV.setR(R);
    CV.calculoCilindro();
    CV.getV();
        
    System.out.println("O volume do Cilindro é:  " + CV.getV() + "\n");
        
    
    System.out.println("Você deseja realizar algum novo calculo?");
    System.out.println("Digite 'sim' para continuar...");
    resposta = ObjLer.next();
    
    }while (resposta.equalsIgnoreCase("sim"));
    }
}