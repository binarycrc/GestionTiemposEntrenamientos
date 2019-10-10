/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiontiemposentrenamientos;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class Atleta {
    public Atleta() {}
    private int idatleta; //variable para numero de atleta
    //variable para el nivel de atleta    
    //Nivel (1.Principiante - 2.Intermedio - 3.Avanzado - 4.Elite)
    private int nivel; 

    public int getIdatleta() {return idatleta;}
    public void setIdatleta(int idatleta) {this.idatleta = idatleta;}
    public int getNivel() {return nivel;}
    public void setNivel(int nivel) {this.nivel = nivel;}
    
}
