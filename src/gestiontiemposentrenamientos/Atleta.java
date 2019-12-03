/*
 * Copyright (C) 2019 Pablo Ugalde Trejos
 * UNIVERSIDAD ESTATAL A DISTANCIA
 * 00824 Programacion Intermedia
 test
 */
package gestiontiemposentrenamientos;

import java.util.Date;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class Atleta extends Persona{
    //Nivel (1.Principiante - 2.Intermedio - 3.Avanzado - 4.Elite)
    public enum Nivel{Principiante, Intermedio, Avanzado, Elite}; 
    //1.Principiante: : 02:56 y 05:59 minutos/segundos 176/359
    //2.Intermedio: 02:11 y 02:55 minutos/segundos 131/175
    //3.Avanzado: 01:46 y 02:10 minutos/segundos 106/130
    //4.Elite: 01:00 y 01:45 minutos/segundos 60/105
    private int minElite = 105;
    private int minAvanzado = 130;
    private int minIntermedio = 175;
    private int minPrincipiante = 359;
    private int[] RangoPrincipiante = new int[4]; 
    
    Nivel nivel;
    private int idatleta; //variable para numero de atleta
    
    
    //variable para el nivel de atleta    
    public Atleta() {
        RangoPrincipiante[0]=minElite;
        RangoPrincipiante[1]=minAvanzado;
        RangoPrincipiante[2]=minIntermedio;
        RangoPrincipiante[3]=minPrincipiante;
    }
    public Atleta(int identificacion,String nombre,String apellido,char sexo
            ,int edad,Date fechanacimiento) {
        super(identificacion, nombre, apellido, sexo, edad, fechanacimiento);
        RangoPrincipiante[0]=minElite;
        RangoPrincipiante[1]=minAvanzado;
        RangoPrincipiante[2]=minIntermedio;
        RangoPrincipiante[3]=minPrincipiante;
    }


    public int getIdatleta() {return idatleta;}
    public void setIdatleta(int idatleta) {this.idatleta = idatleta;}
    public Nivel getNivel() {return nivel;}
    public void setNivel(Nivel nivel) {this.nivel = nivel;}
    
    
}
