/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
