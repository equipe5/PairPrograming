/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pairprograming.exercicio3;

/**
 *
 * @author André
 */
public class CalculoVolumeCilindro {

private double R; //RAIO
private double L; //ALTURA
private double V; //VOLUME
   



public void calculoCilindro()
{
    V = (3.1416 * (R*R)) * L;
}

    
    public void setR(double R) {
        this.R = R;
    }

    
    public void setL(double L) {
        this.L = L;
    }

    public double getV() {
        return V;
    }



}
