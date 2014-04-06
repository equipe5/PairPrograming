/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprograming.exercicio4;

/**
 *
 * @author André
 */
public class CalculoTabuada {

private int numero; //numero

    
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void tabuada(){
    if (numero < 5){
        System.out.printf("Numeros menores que 5 sao invalidos\n");
        
    }
    else{
        
        for(int i=1;i<=10;i++){
            if(isprimo((numero*i))){                
                System.out.printf(numero + " x " + i + " = %d é primo\n",(numero * i));
            }else{
                System.out.printf(numero + " x " + i + " = %d \n",(numero * i));
            }            
        }                       
    }
   }
      public boolean isprimo(int valor){
        boolean primo = true;
        for(int i = (valor/2); i > 1;i--){
            if (valor %(i) == 0)
            {
                primo = false;  
            }
        }
        return primo;
}
 






    
    



}
