/*
 * Copyright (C) 2019 Pablo Ugalde Trejos
 * UNIVERSIDAD ESTATAL A DISTANCIA
 * 00824 Programacion Intermedia
 */
package gestiontiemposentrenamientos;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class Atleta extends Persona{
    Nivel nivel;
    private int idatleta; //variable para numero de atleta
    //variable para el nivel de atleta    
    //Nivel (1.Principiante - 2.Intermedio - 3.Avanzado - 4.Elite)
    private enum Nivel{Principiante, Intermedio, Avanzado, Elite}; 

    public int getIdatleta() {return idatleta;}
    public void setIdatleta(int idatleta) {this.idatleta = idatleta;}
    public Nivel getNivel() {return nivel;}
    public void setNivel(Nivel nivel) {this.nivel = nivel;}
    
    public Atleta() {    
    }
}
