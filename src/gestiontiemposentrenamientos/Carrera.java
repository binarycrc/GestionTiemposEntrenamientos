/*
 * Copyright (C) 2019 Pablo Ugalde Trejos
 * UNIVERSIDAD ESTATAL A DISTANCIA
 * 00824 Programacion Intermedia
 */
package gestiontiemposentrenamientos;

import java.util.Date;

/**
 *
 * @author Pablo Ugalde Trejos
 */
public class Carrera {
    public Carrera() {}
    private int idatleta; //variable para numero de atleta
    private Date fechapractica; //variable para la fecha de practica
    private int vuelta; //variable para numero de vuelta
    private int tiempominutos; //variable para tiempo obtenido en minutos
    private int tiemposegundos; //variable para tiempo obtenido en segundos

    public int getIdatleta() {return idatleta;}
    public void setIdatleta(int idatleta) {this.idatleta = idatleta;}
    public Date getFechapractica() {return fechapractica;}
    public void setFechapractica(Date fechapractica) {this.fechapractica = fechapractica;}
    public int getVuelta() {return vuelta;}
    public void setVuelta(int vuelta) {this.vuelta = vuelta;}
    public int getTiempominutos() {return tiempominutos;}
    public void setTiempominutos(int tiempominutos) {this.tiempominutos = tiempominutos;}
    public int getTiemposegundos() {return tiemposegundos;}
    public void setTiemposegundos(int tiemposegundos) {this.tiemposegundos = tiemposegundos;}
}
